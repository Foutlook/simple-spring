package com.foutin.simple.ioc.beans;

/**
 * @author xingkai.fan
 * @date 2019-09-01
 */
public interface BeanPostProcessor {

    Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception;

    Object postProcessAfterInitialization(Object bean, String beanName) throws Exception;

}
