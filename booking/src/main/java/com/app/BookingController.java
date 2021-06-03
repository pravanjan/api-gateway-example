package com.app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookingController {

    @RequestMapping(method = RequestMethod.GET, path = "get")
    public String sayHello(){
        return "i am inside Booking  Controller";

    }
}
