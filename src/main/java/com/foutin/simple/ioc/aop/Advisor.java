package com.foutin.simple.ioc.aop;

import org.aopalliance.aop.Advice;

/**
 * @author xingkai.fan
 * @date 2019-09-14
 */
public interface Advisor {

    Advice getAdvice();
}
