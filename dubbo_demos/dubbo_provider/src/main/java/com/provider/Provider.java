package com.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author houlei
 * @DESC:
 * @create 2019-01-22 16:41
 */
public class Provider {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:provider.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("服务已经启动...");
        System.in.read();
    }
}
