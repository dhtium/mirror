package org.element.mirror.user;


import org.element.mirror.user.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {

    @Test
    public void test1() {
        String xmlPath = "spring/applicationContext.xml";
        ApplicationContext context = new ClassPathXmlApplicationContext(xmlPath);
        UserService userService = context.getBean("userService", UserService.class);
        userService.getUserDTO(null);
        System.out.println("Hello World!");
    }
}
