package com.times.dockerExample.controller;

import com.times.dockerExample.mapper.TestMapper;
import com.times.dockerExample.model.Test;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final TestMapper testMapper;

    @GetMapping("/home")
    public String home() {
        return "times docker sample!";
    }

    @GetMapping("/{id}")
    public ResponseEntity<Test> getTest(@PathVariable("id") Long id) {
        return ResponseEntity.ok(testMapper.findById(id));
    }
}
