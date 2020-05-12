package com.discardpast.proxy.trendproxy.jdk.proxy;

import com.sun.jdi.Bootstrap;

import java.lang.reflect.Method;
import java.lang.reflect.ReflectPermission;

/***
 * @className: MyJdkProxyImpl
 * @description:
 * @author: discardpast@yeah.net
 * @date: 2020/5/13 1:57
 * @version: 1.0.0
 */
public class MyJdkProxyImpl{

    public static String getMyProxyInstance(ClassLoader classLoader, Class[] clazzS, InvokerHandler invokerHandler) throws Exception {


        for(Class clazz : clazzS)
        {
            if(!clazz.isInterface())
            {
                return null;
            }
            else {
                Class temp = classLoader.loadClass(clazz.getName());
            }
        }
        return "1";
    }
}
