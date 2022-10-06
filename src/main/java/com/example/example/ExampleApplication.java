package com.example.example;

import com.example.example.data.BeerDto;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplication.class, args);
    }


    public static void beer() {
        val beerDto = new BeerDto();
        beerDto.setName("");
    }
}
