package webgroup.webartifact;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HelloWorldController {
	
//	@RequestMapping("/helloWorld")
//	public String getHelloWorld(ModelMap model) {
////		Map m = new HashMap();
////		m.put("message1", "goodbyeWorld");
//		model.addAttribute("message","helloWorld");
//		model.addAttribute("message1" , "goodbye");
////		model.mergeAttributes(m);
//		return "view";
//		
//	}
	
	
	@RequestMapping("/helloWorld")
	public ModelAndView getHelloWorld(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("view");
		modelAndView.addObject("message","Hello , World!");
		modelAndView.addObject("message1", "Hello,Sky!");
		return modelAndView;
		
	}
	
	@RequestMapping(value="getHelloWorld")
	@ResponseBody
	public String getHelloWorldString() {
		return "Hello World!";
	}
	

}
