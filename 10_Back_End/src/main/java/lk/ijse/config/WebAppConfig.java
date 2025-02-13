package lk.ijse.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "lk.ijse.controller")
public class WebAppConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/v1/customer/**")//any location
                //.addMapping("/api/v1/customer/**")//any customer locations
                .allowedOrigins("*")//any origin
                //.allowedOrigins("http://facebook.com") can access only facebook
                .allowCredentials(true)
                .allowedMethods("GET","POST","PUT","DELETE")
                .allowedHeaders("*");
    }
}
