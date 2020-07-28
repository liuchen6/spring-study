package org.liuc.demo04;

import org.liuc.demo02.UserService;
import org.liuc.demo02.UserServiceImpl;

public class Client {

    public static void main(String[] args) {

        //真实角色
        UserServiceImpl userServiceImpl = new UserServiceImpl();

        //代理角色
        ProxyInvocationHandler handler = new ProxyInvocationHandler();

        //设置要代理的对象
        handler.setTarget(userServiceImpl);

        //动态生成代理类
        UserService userService = (UserService) handler.getProxy();

        //调用方法
        userService.insert();
    }
}
