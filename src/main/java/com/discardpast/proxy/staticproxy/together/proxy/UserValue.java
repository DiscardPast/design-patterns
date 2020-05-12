package com.discardpast.proxy.staticproxy.together.proxy;

import com.discardpast.proxy.staticproxy.together.dao.UserInterface;

/***
 * @className: UserValue
 * @description: 静态代理：聚合实现,都会造成类爆炸，会创建很多类，而且功能有限
 * @author: discardpast@yeah.net
 * @date: 2020/5/13 1:47
 * @version: 1.0.0
 */
public class UserValue implements UserInterface {

    UserInterface userInterface;

    public UserValue(UserInterface userInterface)
    {
        this.userInterface = userInterface;
    }

    @Override
    public void getUserName(String userName) {

    }
}
