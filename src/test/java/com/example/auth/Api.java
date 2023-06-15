package com.example.auth;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@FeignClient(name = "api", url = "localhost:8080")
public interface Api {

    @GetMapping(path = "/resource", produces = APPLICATION_JSON_VALUE)
    String get();
}
