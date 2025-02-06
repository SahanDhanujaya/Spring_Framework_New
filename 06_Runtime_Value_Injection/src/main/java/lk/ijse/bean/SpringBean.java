package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
    @Value("Dhanu")
    String name;
    public SpringBean() {
        System.out.println("Spring Bean Constructor");
        System.out.println("Name : "+name);
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Name : "+name);
    }


    /*@Autowired(required = false)
    public SpringBean(@Value("Dhanu") String name,@Value("1") int id ,@Value("true") boolean isTrue){
        System.out.println("ID : " + id);
        System.out.println("Name : "+name);
        System.out.println("IsTrue : "+isTrue);
    }

    @Autowired(required = false)
    public SpringBean(@Value("Dhanu") String name,@Value("1") int id ,@Value("true") boolean isTrue,@Value("c") char c){
        System.out.println("ID : " + id);
        System.out.println("Name : "+name);
        System.out.println("IsTrue : "+isTrue);
        System.out.println("Char : "+c);
    }*/

}
