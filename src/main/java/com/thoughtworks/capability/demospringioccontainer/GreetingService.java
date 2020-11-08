package com.thoughtworks.capability.demospringioccontainer;


import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class GreetingService {

    public GreetingService(){
        System.out.println("======GreetingService is instantiating=======");
    }

    String sayHi() {
        return "hello world";
    }
}
