package com.iqmsoft.payara.jms;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.Message;
import javax.jms.MessageListener;



@MessageDriven(name = "testmdb", activationConfig = {
    @ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue"),
    @ActivationConfigProperty(propertyName = "destination", propertyValue = "TESTQ"),
    @ActivationConfigProperty(propertyName = "resourceAdapter", propertyValue = "activemq-rar-5.14.5")
   
})
public class JMSReceiver implements MessageListener {
   
    public JMSReceiver() {
    }
   
    @Override
    public void onMessage(Message message) {
        System.out.println("Got JMS Message " + message);
    }
}


