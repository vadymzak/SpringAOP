package ua.javabegin.spring.aop.loggins;

import org.springframework.stereotype.Component;

@Component
public class MyLogger {

    public void printValue(Object ob) {
        System.out.println(ob);
    }

    public void init() {
        System.out.println("init");
    }

    public void close() {
        System.out.println("close");
    }
}
