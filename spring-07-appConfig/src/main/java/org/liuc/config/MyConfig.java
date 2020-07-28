package org.liuc.config;

import org.liuc.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
//添加了@Configuration注解后，这个类也会被Spring容器托管，因为@Configuration包含了@Component
//@Configuration表示这是一个配置类，等价于beans.xml
@ComponentScan("org.liuc.pojo")
public class MyConfig {

    //@Bean,相当于beans.xml中的bean标签
    //方法名，相当于bean标签中的id属性
    //方法的返回值，相当于bean标签中的class属性
    @Bean
    public User getUser() {
        //return需要注入到bean的对象
        return new User();
    }
}
