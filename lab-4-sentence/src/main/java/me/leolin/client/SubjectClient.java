package me.leolin.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("LAB-4-SUBJECT")
public interface SubjectClient {

	@GetMapping("/")
	public String getWord();
	
}
