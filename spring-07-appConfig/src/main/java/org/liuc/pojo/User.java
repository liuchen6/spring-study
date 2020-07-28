package org.liuc.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//这个注解说明：这个类被Spring容器托管了
@Component
public class User {

    private String name;

    public String getName() {
        return name;
    }

    //注入属性值
    @Value("liucgcc")
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
