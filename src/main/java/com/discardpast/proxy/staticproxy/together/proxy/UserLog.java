package com.discardpast.proxy.staticproxy.together.proxy;

import com.discardpast.proxy.staticproxy.together.dao.UserInterface;

/***
 * @className: UserLog
 * @description:
 * @author: discardpast@yeah.net
 * @date: 2020/5/13 1:36
 * @version: 1.0.0
 */
public class UserLog implements UserInterface {

    @Override
    public void getUserName(String userName) {
        System.out.println(userName + "的用户日志");
        System.out.println("用户名称" + userName);
    }

}
