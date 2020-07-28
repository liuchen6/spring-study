package org.liuc.demo01;

public class Client {
    public static void main(String[] args) {
        //房东要租房子
        Host host = new Host();
        //将房东的房子交给代理，同时中介会有一些附属操作
        Proxy proxy = new Proxy(host);
        //找中介租房
        proxy.rent();
    }
}
