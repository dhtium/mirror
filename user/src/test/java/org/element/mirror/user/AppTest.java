package org.element.mirror.user;


import org.element.mirror.user.entity.User;
import org.element.mirror.user.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class AppTest {

    @Test
    public void test1() {
        String xmlPath = "spring/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = context.getBean("userService", UserService.class);
        User user = User.builder().name("Henry").password("123").lastAccessTime(new Date()).enable(true).build();
        userService.saveUser(user);

        System.out.println("Hello World!");
    }
}
