package lk.ijse.di;

import lk.ijse.bean.Agreement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Boy implements Di{
   // @Autowired //Property Injection
    Agreement girl;

    /*@Autowired //Constructor through injection //noo  need @Autowired
    public Boy(Agreement girl) {
        this.girl = girl;
    }*/

   /* @Autowired //Methanadi automa dependency injection eka karagannawa
    public void setGirl(Agreement girl) {
        this.girl = girl;
    }*/

    public void chatWithGirl(){
        girl.chat();
    }

    @Override
    @Autowired
    public void inject(Agreement agreement) {
        this.girl = agreement;
    }
}
