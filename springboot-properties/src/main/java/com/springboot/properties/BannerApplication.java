package com.springboot.properties;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class BannerApplication {
    public static void main(String[] args) {
        // 启动嵌入式的 Tomcat 并初始化 Spring 环境及其各 Spring 组件
        SpringApplication.run(BannerApplication.class,args);
        //清除banner
        SpringApplication springApplication=new SpringApplication(BannerApplication.class);
        // 1.3 springApplication.setShowBanner(false);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
        //清除banner
        new SpringApplicationBuilder(BannerApplication.class).bannerMode(Banner.Mode.OFF).run(args);
    }
}
