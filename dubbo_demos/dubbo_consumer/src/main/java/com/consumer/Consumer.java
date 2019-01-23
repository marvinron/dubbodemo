package com.consumer;

import com.dubbo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author houlei
 * @DESC:
 * @create 2019-01-22 16:47
 */
public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        DemoService demoService = (DemoService) context.getBean(DemoService.class);
        System.out.println("consumer");
        System.out.println(demoService.getPermeisons(1L)+"=================");
    }

}
