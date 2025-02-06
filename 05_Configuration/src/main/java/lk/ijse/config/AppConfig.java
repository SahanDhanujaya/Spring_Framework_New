package lk.ijse.config;

import lk.ijse.bean.SpringBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
/*if root
@ImportResource("classPath:abc.xml")
if not
@ImportResource("file:absolute-path-of-abc.xml")*/
public class AppConfig {
    @Bean
    public SpringBean getSpringBean(){
        return new SpringBean();
    }
}
