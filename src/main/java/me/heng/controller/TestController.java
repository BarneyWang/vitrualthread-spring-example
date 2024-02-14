package me.heng.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    private static final Logger log = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/thread")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> test() {
        Thread thread = Thread.currentThread();
        log.info("Rest controller method has been called {}", thread.getName());
        return ResponseEntity.ok(thread.getName());
    }
}
