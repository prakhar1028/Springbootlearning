package com.Prakhar.Modulefirst.impl;

import com.Prakhar.Modulefirst.Notificatonservice;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MailNotif")
@ConditionalOnProperty(name= "notification.type",havingValue="mail")
public class MailNotifiction implements Notificatonservice {

    public void send(String message)
    {
        System.out.println("MailNotifcaton"+message);
    }

}
