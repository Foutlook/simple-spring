package com.foutin.simple.ioc.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * @author xingkai.fan
 * @date 2019-09-14
 */
public class ReflectiveMethodInvocation implements MethodInterceptor {

    protected Object target;

    protected Method method;

    protected Object[] arguments;


    public ReflectiveMethodInvocation(Object target, Method method, Object[] arguments) {
        this.target = target;
        this.method = method;
        this.arguments = arguments;
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        return null;
    }
}
