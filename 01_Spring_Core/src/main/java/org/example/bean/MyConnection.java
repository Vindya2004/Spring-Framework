package org.example.bean;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;


public class MyConnection {
    public MyConnection() {
        System.out.println("MyConnection");
    }
}
