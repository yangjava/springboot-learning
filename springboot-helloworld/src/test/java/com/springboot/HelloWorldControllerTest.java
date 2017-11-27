package com.springboot;
import com.springboot.controller.HelloWorldController;
import org.testng.annotations.Test;

public class HelloWorldControllerTest {
    @Test
    public void testSayHello() {
        String s=new HelloWorldController().sayHelloWorld();
        System.out.print(s);
    }

}
