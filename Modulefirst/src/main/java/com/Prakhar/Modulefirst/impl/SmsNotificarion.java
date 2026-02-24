package com.Prakhar.Modulefirst.impl;

import com.Prakhar.Modulefirst.Notificatonservice;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
//@Primary
@Component
@Qualifier("SmsNotif")
@ConditionalOnProperty(name="notification.type",havingValue="sms")
public class SmsNotificarion implements Notificatonservice {

    public void send(String message)
    {
        System.out.println("SmsNotifcaton"+message);
    }

}
