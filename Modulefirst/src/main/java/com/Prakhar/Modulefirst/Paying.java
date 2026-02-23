package com.Prakhar.Modulefirst;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
public class Paying {

    public void   pay() {
        System.out.println("Paying");

    }

    @PostConstruct
    public void postconst()
    {
        System.out.println("Construct");
    }
    @PreDestroy
    public void predestruct()
    {
        System.out.println("Destroy");
    }

}

