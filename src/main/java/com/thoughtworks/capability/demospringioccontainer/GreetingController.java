package com.thoughtworks.capability.demospringioccontainer;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final GreetingService greetingService;

    private final ObjectFactory<GreetingService> greetingServiceObjectory;

    public GreetingController(GreetingService greetingService, ObjectFactory<GreetingService> greetingServiceObjectory) {
        this.greetingService = greetingService;
        this.greetingServiceObjectory = greetingServiceObjectory;
    }

    @GetMapping("/greet")
    public String greet() {
        System.out.println("Singleton Bean created");
        return greetingService.sayHi();
    }

}
