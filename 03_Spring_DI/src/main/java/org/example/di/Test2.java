package org.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Test2 implements DIInterface{
   //// property injection
    @Autowired
    DI di;

    //// constructor ekat Autowired danna onema ne
//    @Autowired
//    public Test2(DI di) {
//        this.di = di;
////        System.out.println("Test2() Constructor Called");
//    }

////Setter method through injection
    @Autowired
    public void setterMethod(DI di) {
        this.di = di;
    }
    public void test(){
        di.sayHello();
    }

    @Override
    @Autowired
    public void injected(DI test1) {
        this.di = test1;
    }
}
