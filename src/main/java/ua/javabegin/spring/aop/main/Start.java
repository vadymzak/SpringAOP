package ua.javabegin.spring.aop.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.javabegin.spring.aop.objects.SomeService;

public class Start {

    public static void main(String[] args) {


        ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        SomeService service = (SomeService) context.getBean("someService");
        double val = service.getDoubleValue();
    }
}
