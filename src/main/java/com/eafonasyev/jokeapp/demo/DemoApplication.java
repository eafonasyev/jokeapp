package com.eafonasyev.jokeapp.demo;

import com.eafonasyev.jokeapp.demo.exampleBean.FakeDataSource;
import com.eafonasyev.jokeapp.demo.exampleBean.FakeJmsBroker;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
//@PropertySource("classpath:application.properties")
public class DemoApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(DemoApplication.class,args);

        FakeDataSource  fakeDataSource = applicationContext.getBean(FakeDataSource.class);
        System.out.println(fakeDataSource.getUserName());

        FakeJmsBroker fakeJmsBroker = applicationContext.getBean(FakeJmsBroker.class);
        System.out.println(fakeJmsBroker.getUserName());




    }

}
