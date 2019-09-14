package com.foutin.simple.ioc.aop;

/**
 * AOP代理抽象类
 *
 * @author xingkai.fan
 * @date 2019-09-14
 */
public abstract class AbstractAopProxy implements AopProxy {

    protected AdvisedSupport advised;

    public AbstractAopProxy(AdvisedSupport advised) {
        this.advised = advised;
    }

}
