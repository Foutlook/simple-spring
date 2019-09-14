package com.foutin.simple.ioc.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * bean标签属性复数
 *
 * @author xingkai.fan
 * @date 2019-08-31
 */
public class PropertyValues {

    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public PropertyValues() {
    }

    public void addPropertyValue(PropertyValue pv) {
        // todo 在这里可以对参数值 pv 做一些处理，如果直接使用 List，则就不行了
        this.propertyValueList.add(pv);
    }

    public List<PropertyValue> getPropertyValues() {
        return this.propertyValueList;
    }
}
