package com.xiangyanlin.springtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author xyl
 * vm option 中加入eruka地址：
 * -Dapollo.configService=http://115:29:173:51:8080
 */
@SpringBootApplication
public class SpringTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringTestApplication.class, args);
    }

}
