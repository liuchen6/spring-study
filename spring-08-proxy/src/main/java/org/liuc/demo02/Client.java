package org.liuc.demo02;

public class Client {

    public static void main(String[] args) {
        UserServiceImpl userServiceImpl = new UserServiceImpl();
        UserServiceProxy userServiceProxy = new UserServiceProxy();
        userServiceProxy.setUserService(userServiceImpl);
        userServiceProxy.select();
    }
}
