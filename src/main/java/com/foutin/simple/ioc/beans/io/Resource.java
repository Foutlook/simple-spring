package com.foutin.simple.ioc.beans.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * Resource是从spring内部定位资源的接口
 *
 * @author xingkai.fan
 * @date 2019-09-01
 */
public interface Resource {
    InputStream getInputStream() throws IOException;
}
