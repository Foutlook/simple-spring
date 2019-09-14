package com.foutin.simple.ioc.beans.io;

import java.net.URL;

/**
 * 资源加载类
 *
 * @author xingkai.fan
 * @date 2019-09-01
 */
public class ResourceLoader {

    public Resource getResource(String location) {
        URL resource = this.getClass().getClassLoader().getResource(location);
        return new UrlResource(resource);
    }
}
