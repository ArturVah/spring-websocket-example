package com.mainserver.testik.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {

    @RequestMapping(value = "/message", method = RequestMethod.POST)
    public ResponseEntity<?> broadCastMessage(@ModelAttribute String message) {
        //TODO send message
        return ResponseEntity.ok().build();
    }

}
