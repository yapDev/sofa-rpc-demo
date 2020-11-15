package org.example.single;

public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String message) {
        System.out.println("receive message [" + message + "]");
        return "hello " + message;
    }
}
