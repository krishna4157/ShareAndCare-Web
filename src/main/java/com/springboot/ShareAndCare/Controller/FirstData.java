package com.springboot.ShareAndCare.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.springboot.ShareAndCare.entity.User;

@CrossOrigin
@RestController
public class FirstData {
	@GetMapping("/welcome")
	public ResponseEntity<String> printStateMent(HttpServletRequest request, HttpServletResponse response, @RequestHeader("User-Agent") String userAgent) {
		response.setHeader("Access-Control-Expose-Headers", "Authorization");
		String s = "HELLO";
		return ResponseEntity.ok()
			      .body(s);
	}
	
	
	@PostMapping("/login")
	public ResponseEntity<?> checkUserCredentials(@RequestBody User user) {
//		response.setHeader("Access-Control-Expose-Headers", "Authorization");
		String s = "HELLO";
		if(user.getLoginPassword().equals("Asdx#123")) {
			return new ResponseEntity<>(s, HttpStatus.OK);
		} else {
			return new  ResponseEntity<>("", HttpStatus.FORBIDDEN);
		}
		
	}
	
}
