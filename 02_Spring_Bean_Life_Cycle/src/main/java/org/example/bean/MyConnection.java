package org.example.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean {
    //the state of instantiation
    public MyConnection(){
        System.out.println("MyConnection Constructor");
    }
    //there is no method to find state of populate properties

    //bean name aware -> bean id
    @Override
    public void setBeanName(String name) {
        System.out.println("Set bean name aware");
    }

    //add DI to bean
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Set bean factory called");
    }
    //AOP and DP
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("setApplicationContext called");
    }

    //Complete bean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyConnection afterPropertiesSet");
    }
    //context call and remove all available
    @Override
    public void destroy()throws Exception{
        System.out.println("MyConnection destroy");
    }

}



//TestBean1 constructor called
//MyConnection Constructor
//Set bean name aware
//Set bean factory called
//setApplicationContext called
//MyConnection afterPropertiesSet
//org.example.bean.MyConnection@557caf28
//MyConnection destroy