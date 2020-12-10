package com.springboot.ShareAndCare;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstData {
	@GetMapping("/welcome")
	public ResponseEntity<String> printStateMent(HttpServletRequest request, HttpServletResponse response, @RequestHeader("User-Agent") String userAgent) {
		response.setHeader("Access-Control-Expose-Headers", "Authorization");
		String s = "HELLO";
		return ResponseEntity.ok()
			      .body(s);
	}
}
