package com.fmgarcia.cetus.notifications.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class InfoController {

	@GetMapping("/info")
	public ResponseEntity<String> getHello() {
		log.info("get Hello method");
		return ResponseEntity.ok().body("Hello Spring Cetus");
	}
}
