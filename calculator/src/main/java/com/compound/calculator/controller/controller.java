package com.compound.calculator.controller;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.compound.calculator.service.service;

@RestController
@RequestMapping("/calculator")
public class controller {
@PostMapping(path="/calculate",produces=MediaType.APPLICATION_JSON_VALUE)
public float answer(@RequestBody service s) {
	return s.calculate();
}

}
