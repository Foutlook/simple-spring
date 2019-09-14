package com.foutin.simple.ioc.beans;

import com.foutin.simple.ioc.beans.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * 读取BeanDefinition
 *
 * @author xingkai.fan
 * @date 2019-08-31
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader{

    private Map<String,BeanDefinition> registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    protected ResourceLoader getResourceLoader() {
        return resourceLoader;
    }


}
