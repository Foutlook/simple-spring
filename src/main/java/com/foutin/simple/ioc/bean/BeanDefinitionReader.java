package com.foutin.simple.ioc.bean;

/**
 * 从配置中读取BeanDefinition的类
 *
 * @author xingkai.fan
 * @date 2019-08-31
 */
public interface BeanDefinitionReader {

    void loadBeanDefinitions(String location) throws Exception;
}
