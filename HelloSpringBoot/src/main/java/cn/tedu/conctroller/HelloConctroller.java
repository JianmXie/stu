package cn.tedu.conctroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloConctroller {
	
	@RequestMapping("hello/{name}")
	@ResponseBody
	public String hello(@PathVariable String name) {
		
		return "SpringBoot "+name;
	}
}
