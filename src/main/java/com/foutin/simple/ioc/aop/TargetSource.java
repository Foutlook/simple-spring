package com.foutin.simple.ioc.aop;

/**
 * 被代理的对象
 * @author xingkai.fan
 * @date 2019-09-14
 */
public class TargetSource {
    private Class<?> targetClass;

    private Class<?>[] interfaces;

    private Object target;

    public TargetSource(Object target, Class<?> targetClass,Class<?>... interfaces) {
        this.target = target;
        this.targetClass = targetClass;
        this.interfaces = interfaces;
    }

    public Class<?> getTargetClass() {
        return targetClass;
    }

    public Class<?>[] getInterfaces() {
        return interfaces;
    }

    public Object getTarget() {
        return target;
    }
}
