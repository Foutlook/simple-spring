package com.foutin.simple.ioc.factory;

/**
 * bean容器
 *
 * @author xingkai.fan
 * @date 2019-09-01
 */
public interface BeanFactory {
    Object getBean(String name) throws Exception;
}
