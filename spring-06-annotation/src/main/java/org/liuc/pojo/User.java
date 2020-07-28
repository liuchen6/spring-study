package org.liuc.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component  //等价于 <bean id="dog" class="org.liuc.pojo.Dog"/>
public class User {

    @Value("liuc")  //等价于 <property name="name" value="liuc"/>
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
