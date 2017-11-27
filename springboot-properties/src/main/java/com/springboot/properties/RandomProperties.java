package com.springboot.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties
 @PropertySource("classpath:random.properties")
public class RandomProperties {

    private int randomId;

    private Long randomLong;

    private String randomString;

    private int randomNumber;

    private int randomRange;

    private String uuid;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public int getRandomId() {
        return randomId;
    }

    public Long getRandomLong() {
        return randomLong;
    }

    public String getRandomString() {
        return randomString;
    }

    public int getRandomNumber() {
        return randomNumber;
    }

    public int getRandomRange() {
        return randomRange;
    }

    public void setRandomId(int randomId) {
        this.randomId = randomId;
    }

    public void setRandomLong(Long randomLong) {
        this.randomLong = randomLong;
    }

    public void setRandomString(String randomString) {
        this.randomString = randomString;
    }

    public void setRandomNumber(int randomNumber) {
        this.randomNumber = randomNumber;
    }

    public void setRandomRange(int randomRange) {
        this.randomRange = randomRange;
    }

    @Override
    public String toString() {
        return "RandomProperties{" +
                "randomId=" + randomId +
                ", randomLong=" + randomLong +
                ", randomString='" + randomString + '\'' +
                ", randomNumber=" + randomNumber +
                ", randomRange=" + randomRange +
                ", uuid='" + uuid + '\'' +
                '}';
    }
}
