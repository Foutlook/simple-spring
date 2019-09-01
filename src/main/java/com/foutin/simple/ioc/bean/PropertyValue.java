package com.foutin.simple.ioc.bean;

/**
 * bean标签属性,用于bean的属性注入
 *
 * @author xingkai.fan
 * @date 2019-08-31
 */
public class PropertyValue {
    private final String name;
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
