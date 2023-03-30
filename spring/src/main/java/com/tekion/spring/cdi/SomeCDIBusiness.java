package com.tekion.spring.cdi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import javax.inject.Named;


@Component
public class SomeCDIBusiness {

    @Autowired
    SomeCDIDao someCDIDao;

    public SomeCDIDao getSomeCDIDao() {
        return someCDIDao;
    }

    public void setSomeCDIDao(SomeCDIDao someCDIDao) {
        this.someCDIDao = someCDIDao;
    }
}
