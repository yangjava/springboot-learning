package com.springboot.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "user")
public class UserProperties1 {


    private long id;
    private String name;
    private int age;
    private String descp;


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDescp() {
        return descp;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setDescp(String descp) {
        this.descp = descp;
    }

    @Override
    public String toString() {
        return "UserProperties{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", descp='" + descp + '\'' +
                '}';
    }
}
