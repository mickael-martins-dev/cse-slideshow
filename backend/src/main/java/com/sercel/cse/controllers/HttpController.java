package com.sercel.cse.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sercel.cse.model.Gallery;

@RestController
public class HttpController {

    @Autowired
    private Gallery gallery;

    @GetMapping(value = "/heartbeat")
    public ResponseEntity<String> getGeartbeat() {
        return ResponseEntity.ok().build();
    }

}
