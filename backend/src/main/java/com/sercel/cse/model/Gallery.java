package com.sercel.cse.model;

import org.springframework.context.annotation.Bean;

public class Gallery {


    public Gallery(){
    }

    @Bean
    public Gallery create(){
        return new Gallery();
    }
}
