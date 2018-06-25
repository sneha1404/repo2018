package webgroup.webartifact;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class App {
	
	@RequestMapping("/hello")
	public static String helloWorld(String[] args){
		System.out.println("Hello World!");
		return "WEB-INF/helloWorld.html";
	}

}
