package com.example.AwsEc2TomcatJenkinsGithubMavenSpringBootJava11.rest_resorce;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class HelloResource {
	
	@GetMapping
	public String greet()
	{
		return "hello";
	}

}
