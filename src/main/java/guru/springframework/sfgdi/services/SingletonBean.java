package guru.springframework.sfgdi.services;

import org.springframework.stereotype.Component;

@Component
public class SingletonBean {

    public SingletonBean() {
        System.out.println("Singleton bean created");
    }

    public String getScope() {
        return "singleton";
    }
}
