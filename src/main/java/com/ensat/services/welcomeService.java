package com.ensat.services;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "welcomePetrolService", url = "http://localhost:8081")
public interface welcomeService {
    @RequestMapping(value = "/getWelcomeMessage", method = RequestMethod.GET)
    public String getWelcomeMessage();
}
