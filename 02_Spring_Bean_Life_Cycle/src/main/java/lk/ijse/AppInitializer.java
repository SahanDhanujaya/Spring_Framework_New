package lk.ijse;

import lk.ijse.bean.TestBean1;
import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        /*TestBean1 bean1 = context.getBean(TestBean1.class);
        System.out.println(bean1);

        TestBean1 bean2 = context.getBean(TestBean1.class);
        System.out.println(bean2);*/
       /* TestBean1 testBean1 = context.getBean(TestBean1.class);
        TestBean1 testBean2 = context.getBean(TestBean1.class);
*/
        context.registerShutdownHook();
    }
}
