package lk.ijse.config;

import lk.ijse.bean.MyConnection;
import lk.ijse.bean.TestBean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan(basePackages = "lk.ijse.bean")
@ComponentScan(basePackageClasses = TestBean1.class)
public class AppConfig {
    /* public AppConfig() {
         System.out.println("AppConfig Constructor");

     }*/
    @Bean("bean2")
    @Scope("prototype")
    public MyConnection getConnection() {
        return new MyConnection();
    }
}
