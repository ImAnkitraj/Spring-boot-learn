package com.tekion.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ScopeApplication {


    private static Logger LOGGER = LoggerFactory.getLogger(ScopeApplication.class);
    public static void main(String[] args) {

//        ApplicationContext applicationContext = SpringApplication.run(ScopeApplication.class, args);
//
//        PersonDAO personDAO = applicationContext.getBean(PersonDAO.class);
//        PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);
//
//        LOGGER.info("{}", personDAO);
//        LOGGER.info("{}", personDAO.getJdbcConnection());
//        LOGGER.info("{}", personDAO2);
//        LOGGER.info("{}", personDAO2.getJdbcConnection());

    }

}
