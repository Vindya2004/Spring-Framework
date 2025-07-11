package org.example.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
//    @Autowired(required=false)
//    public SpringBean(@Value("Vindya") String name,@Value("2") int number,@Value("true") boolean value) {
//        System.out.println("SpringBean Constructor: "+name);
//        System.out.println("SpringBean Constructor Value: "+number);
//        System.out.println("SpringBean Constructor Value: "+value);
//    }
//    @Autowired(required=false)
//    public SpringBean(@Value("Vindya") String name,@Value("2") int number,@Value("Colombo") String address,@Value("1") int id) {
//        System.out.println("SpringBean Constructor: "+name);
//        System.out.println("SpringBean Constructor Value: "+number);
//        System.out.println("SpringBean Constructor Value: "+address);
//        System.out.println("SpringBean Constructor Value: "+id);
    @Value("Vindya")
    private String name;

    @Value("saffj3332#")
    private String key;

    public SpringBean() {
        System.out.println(name);
    }


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(key);
    }
}
