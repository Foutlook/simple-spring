package com.foutin.simple.ioc.context;

import com.foutin.simple.ioc.bean.BeanDefinition;
import com.foutin.simple.ioc.factory.AbstractBeanFactory;
import com.foutin.simple.ioc.factory.AutowireCapableBeanFactory;
import com.foutin.simple.ioc.io.ResourceLoader;
import com.foutin.simple.ioc.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * 应用上下文加载类
 *
 * @author xingkai.fan
 * @date 2019-09-01
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {

    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) throws Exception {
        this(configLocation, new AutowireCapableBeanFactory());
    }

    public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory beanFactory) throws Exception {
        super(beanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    @Override
    protected void loadBeanDefinitions(AbstractBeanFactory beanFactory) throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
    }
}
