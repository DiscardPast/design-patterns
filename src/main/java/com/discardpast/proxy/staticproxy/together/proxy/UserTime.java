package com.discardpast.proxy.staticproxy.together.proxy;

import com.discardpast.proxy.staticproxy.together.dao.UserInterface;

/***
 * @className: UserTime
 * @description:
 * @author: discardpast@yeah.net
 * @date: 2020/5/13 1:39
 * @version: 1.0.0
 */
public class UserTime implements UserInterface {

    UserInterface userInterface;

    public UserTime(UserInterface userInterface)
    {
        this.userInterface = userInterface;
    }

    @Override
    public void getUserName(String userName) {
        userInterface.getUserName(userName);
        System.out.println("用户" + userName + "的时间日志");
    }
}
