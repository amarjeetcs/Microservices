package com.amarjeet.webservice.Logical.String;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/string")
public class ReverseString {
	
		@GetMapping("/reverse1")
		public String ReverseString()
		{
			String str="amarjeet";
			String rev="";
			for(int i=str.length()-1;i>=0;i--)
			{
				rev=rev+str.charAt(i);
			}
			return "Reversed String is: "+rev;
		}
		
		
}
