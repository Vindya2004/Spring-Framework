package org.example;

import org.example.bean.MyConnection;
import org.example.bean.SpringBean;
import org.example.bean.TestBean1;
import org.example.bean.TestBean2;
import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        TestBean1 bean1 = context.getBean(TestBean1.class);
        TestBean1 bean2 = context.getBean(TestBean1.class);
        System.out.println(bean1);
        System.out.println(bean2);

        MyConnection myConnection1 = context.getBean(MyConnection.class);
        MyConnection myConnection2 = context.getBean(MyConnection.class);
        System.out.println(myConnection1);
        System.out.println(myConnection2);

        context.registerShutdownHook();
//        MyConnection myConnection =  context.getBean(MyConnection.class);
//        System.out.println(myConnection);
//        //beanid -> bean method name
//        MyConnection myConnection2 = (MyConnection) context.getBean("vindi");
//        System.out.println(myConnection2);
//        //beanid+class name
//        MyConnection myConnection3 = (MyConnection) context.getBean("vindi", MyConnection.class);
//        System.out.println(myConnection3);

        //class name
//        SpringBean springBean = context.getBean(SpringBean.class);
//        System.out.println(springBean);
        //Bean Id
//        SpringBean springBean1 = (SpringBean) context.getBean("springBean");
//        System.out.println(springBean1);
//        TestBean1 testBean1 = (TestBean1) context.getBean("testBean1");
//        System.out.println(testBean1);
        //Bean Id and Class name
//        TestBean2 testBean2 = (TestBean2) context.getBean("vindya", TestBean2.class);
//        System.out.println(testBean2);

//        SpringBean springBean1 = context.getBean(SpringBean.class);
//        System.out.println(springBean1);
//        TestBean1 testBean1 = context.getBean(TestBean1.class);
//        System.out.println(testBean1);



//        Runtime.getRuntime().addShutdownHook(new Thread() {
//            @Override
//            public void run() {
//                context.close();
//            }
//        });

//
//        TestBean2 testBean2 = context.getBean(TestBean2.class);
//        System.out.println(testBean2);





//        springBean1.test();
//
//        SpringBean springBean2 = context.getBean(SpringBean.class);
//        springBean2.test();
//
//        System.out.println(springBean1);
//        System.out.println(springBean2);


    }
}