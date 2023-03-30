package com.tekion.spring;

import com.tekion.spring.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(CdiApplication.class);

    public static void main(String[] args) {

//        ApplicationContext applicationContext = SpringApplication.run(CdiApplication.class, args);
//
//        SomeCDIBusiness business = applicationContext.getBean(SomeCDIBusiness.class);
//
//        LOGGER.info("{} {}", business, business.getSomeCDIDao());
    }
}
