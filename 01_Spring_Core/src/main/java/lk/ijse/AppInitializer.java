package lk.ijse;

import lk.ijse.bean.*;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        /*SpringBean springBean = context.getBean(SpringBean.class);
        System.out.println(springBean);

        TestBean1 testBean1 = context.getBean(TestBean1.class);
        System.out.println(testBean1);

        TestBean2 testBean2 = context.getBean(TestBean2.class);
        System.out.println(testBean2);

        TestBean3 testBean3 = context.getBean(TestBean3.class);
        System.out.println(testBean3);*/

        /*Object springBean = context.getBean("springBean");
        System.out.println(springBean);*/

        Object testBean1 = context.getBean("testBean1");
        System.out.println(testBean1);

        Object testBean2 = context.getBean("testBean2");
        System.out.println(testBean2);

        Object testBean3 = context.getBean("testBean3");
        System.out.println(testBean3);

        TestBean2 testBean21 = context.getBean("testBean2", TestBean2.class);
        System.out.println(testBean21);

        Object bean = context.getBean("bean");
        System.out.println(bean);

        TestBean1 ref1 = context.getBean(TestBean1.class);
        System.out.println(ref1);

        TestBean1 ref2 = context.getBean(TestBean1.class);
        System.out.println(ref2);

        TestBean1 ref3 = context.getBean(TestBean1.class);
        System.out.println(ref3);

        MyConnection myConnection = context.getBean("bean2",MyConnection.class);
        System.out.println(myConnection);
        MyConnection myConnection1 = context.getBean("bean2",MyConnection.class);
        System.out.println(myConnection1);
        context.registerShutdownHook();
        /*Runtime.getRuntime().addShutdownHook(new Thread(){//hooking processors
            public void run(){
                System.out.println("Shutting Down");
                context.close();
            }
        });*/
    }
}
