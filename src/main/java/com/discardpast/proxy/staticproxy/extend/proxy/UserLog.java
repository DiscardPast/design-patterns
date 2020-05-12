package com.discardpast.proxy.staticproxy.extend.proxy;

import com.discardpast.proxy.staticproxy.extend.dao.UserImpl;

/***
 * @className: UserLog
 * @description:
 * @author: discardpast@yeah.net
 * @date: 2020/5/13 1:29
 * @version: 1.0.0
 */
public class UserLog extends UserImpl {

    @Override
    public void getUserName(String userName) {

        System.out.println(userName + "的Log日志");
        System.out.println("用户名称:" + userName);

    }
}
