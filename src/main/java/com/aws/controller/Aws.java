package com.aws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aws {

	@GetMapping("/aws")
	public String get() {
		return "SuccessFully";
	}
}
