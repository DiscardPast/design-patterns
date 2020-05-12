package com.discardpast.proxy.staticproxy.extend;

import com.discardpast.proxy.staticproxy.extend.dao.UserImpl;
import com.discardpast.proxy.staticproxy.extend.proxy.UserLog;

/***
 * @className: Test
 * @description: 静态代理:继承实现 缺点：只能进行一次继承，只能实现一个代理增强功能
 * @author: discardpast@yeah.net
 * @date: 2020/5/13 1:27
 * @version: 1.0.0
 */
public class Test {

    public static void main(String[] args) {

        UserImpl user = new UserLog();
        user.getUserName("DiscardPast");

    }
}
