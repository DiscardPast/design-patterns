package com.discardpast.proxy.trendproxy.jdk.proxy;

import java.lang.reflect.Method;

/***
 * @className: InvokerHandler
 * @description:
 * @author: discardpast@yeah.net
 * @date: 2020/5/13 1:56
 * @version: 1.0.0
 */
public interface InvokerHandler {

    boolean invoke(ClassLoader classLoader, Method[] methods);


}
