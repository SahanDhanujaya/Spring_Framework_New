package lk.ijse;

import lk.ijse.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;
import java.util.Properties;

public class AppInitializer {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();
        /*//System environment variables
        Map<String, String> getenv = System.getenv();
        for (String key: getenv.keySet()) {
            System.out.println(key + " = " + getenv.get(key));
        }
        System.out.println(getenv.get("PROCESSOR_LEVEL"));

        //Access Predefined Properties From Java
        Properties property = System.getProperties();
        for (String key : property.stringPropertyNames()) {
            System.out.println(key+" = "+property.getProperty(key));
        }*/
            context.registerShutdownHook();

    }
}