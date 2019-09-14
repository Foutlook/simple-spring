package com.foutin.simple.ioc.aop.jdk;

import com.foutin.simple.ioc.aop.AbstractAopProxy;
import com.foutin.simple.ioc.aop.AdvisedSupport;
import com.foutin.simple.ioc.aop.ReflectiveMethodInvocation;
import org.aopalliance.intercept.MethodInterceptor;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 基于jdk的动态代理
 *
 * @author xingkai.fan
 * @date 2019-09-14
 */
public class JdkDynamicAopProxy extends AbstractAopProxy implements InvocationHandler {


    public JdkDynamicAopProxy(AdvisedSupport advised) {
        super(advised);
    }

    @Override
    public Object getProxy() {
        return Proxy.newProxyInstance(getClass().getClassLoader(), advised.getTargetSource().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        MethodInterceptor methodInterceptor = advised.getMethodInterceptor();
        if (advised.getMethodMatcher() != null
                && advised.getMethodMatcher().matches(method, advised.getTargetSource().getTarget().getClass())) {
            return methodInterceptor.invoke(new ReflectiveMethodInvocation(advised.getTargetSource().getTarget(),
                    method, args));
        } else {
            return method.invoke(advised.getTargetSource().getTarget(), args);
        }
    }
}
