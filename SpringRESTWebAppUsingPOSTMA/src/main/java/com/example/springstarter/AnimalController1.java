package com.example.springstarter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class AnimalController1 {
	@RequestMapping("swathi")
	public String home1()
	{
		System.out.println("Capgemini");
		return "animal.txt";
	}

}