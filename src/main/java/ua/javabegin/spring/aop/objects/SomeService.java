package ua.javabegin.spring.aop.objects;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

    public int getIntValue() {
        return 5;
    }

    public double getDoubleValue() {
        return 5.5;
    }
}
