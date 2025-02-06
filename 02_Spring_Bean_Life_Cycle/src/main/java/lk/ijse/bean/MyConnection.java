package lk.ijse.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MyConnection implements BeanNameAware, BeanFactoryAware, ApplicationContextAware , InitializingBean,DisposableBean {
    @Override
    public void destroy() throws Exception {
        System.out.println("MyConnection DisposableBean destroy");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("MyConnection BeanFactoryAware setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("MyConnection ApplicationContextAware setApplicationContext");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyConnection InitializingBean afterPropertiesSet");
    }
    public MyConnection() {
        System.out.println("MyConnection Constructor");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("MyConnection BeanNameAware setBeanName");
    }


}
