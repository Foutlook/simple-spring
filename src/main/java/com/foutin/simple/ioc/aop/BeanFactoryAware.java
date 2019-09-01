package com.foutin.simple.ioc.aop;

import com.foutin.simple.ioc.factory.BeanFactory;

/**
 * @author xingkai.fan
 * @date 2019-09-01
 */
public interface BeanFactoryAware {
    void setBeanFactory(BeanFactory beanFactory) throws Exception;
}
