package lk.ijse.di;

import lk.ijse.bean.Agreement;
import org.springframework.stereotype.Component;

@Component
public class Girl implements Agreement {

    @Override
    public void chat() {
        System.out.println("Girl is chatting with boy");
    }
}
