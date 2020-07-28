package org.liuc.demo03;

public class Client {

    public static void main(String[] args) {
        //真实角色
        Host host = new Host();

        //创建代理类生成器，并set真实角色
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(host);

        //代理角色需要通过ProxyInvocationHandler生成
        Rent proxy = (Rent) proxyInvocationHandler.getProxy();

        //调用方法
        proxy.rent();
    }
}
