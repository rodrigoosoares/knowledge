package com.codesheet.conditionalonproperty.controllers;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
@ConditionalOnProperty(value = "controllers.enable", matchIfMissing = false)
public class BasicController {

	@GetMapping
	public ResponseEntity<String> get() {

		return ResponseEntity.ok("GET - /base endpoint!");
	}

}
