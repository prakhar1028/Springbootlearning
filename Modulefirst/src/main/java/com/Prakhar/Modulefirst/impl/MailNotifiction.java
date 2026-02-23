package com.Prakhar.Modulefirst.impl;

import com.Prakhar.Modulefirst.Notificatonservice;
import org.springframework.stereotype.Component;

@Component
public class MailNotifiction implements Notificatonservice {

    public void send(String message)
    {
        System.out.println("MailNotifcaton"+message);
    }

}
