package com.discardpast.proxy.staticproxy.together;

import com.discardpast.proxy.staticproxy.together.dao.UserInterface;
import com.discardpast.proxy.staticproxy.together.proxy.UserLog;
import com.discardpast.proxy.staticproxy.together.proxy.UserTime;
import com.discardpast.proxy.staticproxy.together.proxy.UserValue;

/***
 * @className: Test
 * @description:
 * @author: discardpast@yeah.net
 * @date: 2020/5/13 1:41
 * @version: 1.0.0
 */
public class Test {

    public static void main(String[] args) {
        UserInterface user = new UserTime(new UserLog());
        user.getUserName("DiscardPast");
    }
}
