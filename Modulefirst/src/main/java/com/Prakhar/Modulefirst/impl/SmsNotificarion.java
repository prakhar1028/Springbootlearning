package com.Prakhar.Modulefirst.impl;

import com.Prakhar.Modulefirst.Notificatonservice;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class SmsNotificarion implements Notificatonservice {

    public void send(String message)
    {
        System.out.println("SmsNotifcaton"+message);
    }

}
