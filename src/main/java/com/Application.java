package com;

import org.joda.time.DateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

/**
 * Created by HenDiao on 2017/7/8.
 */
@SpringBootApplication
public class Application {
    public static String isAfterPayDay() {
        DateTime d=new DateTime(new Date());

        return    d.toString();
    }
    public static void main(String[] args) {

        System.out.print(isAfterPayDay());
        SpringApplication.run(Application.class, args);
    }
}
