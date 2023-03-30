package com.tekion.spring;

import com.tekion.componentscan.ComponentDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.tekion.componentscan")
public class ComponentScanApplication {


    private static Logger LOGGER = LoggerFactory.getLogger(ComponentScanApplication.class);

    public static void main(String[] args) {

//        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
//
//        ComponentDao componentDao = applicationContext.getBean(ComponentDao.class);
//
//        LOGGER.info("{}", componentDao);
    }

}
