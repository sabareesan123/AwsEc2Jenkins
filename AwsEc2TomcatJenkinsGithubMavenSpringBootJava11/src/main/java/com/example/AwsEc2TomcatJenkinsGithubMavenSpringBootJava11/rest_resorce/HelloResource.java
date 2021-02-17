package com.example.AwsEc2TomcatJenkinsGithubMavenSpringBootJava11.rest_resorce;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class HelloResource {
	
	@GetMapping("greet")
	public String greet()
	{
		return "hello";
	}

}
