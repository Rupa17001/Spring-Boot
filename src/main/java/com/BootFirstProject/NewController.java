package com.BootFirstProject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//Annotation for REST api
@RestController
public class NewController {
	//Annotation for mapping web requests onto methods  
	@RequestMapping("/hello")
		public String showHey() {
			return "Hey!";
		}
}
