package org.liuc;

import org.liuc.dao.MySQLDaoImpl;
import org.liuc.dao.UserService;
import org.liuc.dao.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {

        UserServiceImpl userService = new UserServiceImpl();
        userService.setUserDao(new MySQLDaoImpl());
        userService.getUser();

        //使用Spring创建对象
        //获取Spring的上下文对象
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        //对象都在Spring中托管了，可以直接取
        UserService userService1 = (UserService) context.getBean("UserServiceImpl");
        userService.getUser();
    }
}
