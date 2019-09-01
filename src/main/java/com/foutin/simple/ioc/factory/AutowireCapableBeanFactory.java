package com.foutin.simple.ioc.factory;

import com.foutin.simple.ioc.aop.BeanFactoryAware;
import com.foutin.simple.ioc.bean.BeanDefinition;
import com.foutin.simple.ioc.bean.BeanReference;
import com.foutin.simple.ioc.bean.PropertyValue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 可自动装配内容的BeanFactory
 * @author xingkai.fan
 * @date 2019-09-01
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception {
        if (bean instanceof BeanFactoryAware) {
            ((BeanFactoryAware) bean).setBeanFactory(this);
        }
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValues()) {
            Object value = propertyValue.getValue();
            if (value instanceof BeanReference) {
                BeanReference beanReference = (BeanReference)value;
                value = getBean(beanReference.getName());
            }

            try {
                Method declaredMethod = bean.getClass().getDeclaredMethod(
                        "set" + propertyValue.getName().substring(0, 1).toUpperCase() + propertyValue.getName().substring(1),
                        value.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(bean, value);
            } catch (NoSuchMethodException e) {
                Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
                declaredField.setAccessible(true);
                declaredField.set(bean, value);
            }
        }
    }
}
