package lk.ijse.bean;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SpringBean implements InitializingBean {
    @Value("${os.name}")
    private String osName;

    @Value("${USERNAME}")
    private String logName;

    @Value("${db.user}")
    private String user;

    @Value("${db.password}")
    private String password;

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("OSName : "+osName);
        System.out.println("LOGName : "+logName);
        System.out.println("User : "+user);
        System.out.println("Password : "+password);
    }
}
