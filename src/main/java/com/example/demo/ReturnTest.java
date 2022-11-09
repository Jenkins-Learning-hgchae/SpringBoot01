package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturnTest {
	
	@RequestMapping("/retruntest/{num1}/{num2}")
	public int[] addOperator(@PathVariable int num1, @PathVariable int num2){
		int[] answer = new int[] {num1, num2};
		System.out.println(answer);
		return answer;
	}
}
