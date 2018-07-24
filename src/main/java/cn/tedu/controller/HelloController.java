package cn.tedu.controller;

import java.util.List;


import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.tedu.pojo.User;
import cn.tedu.service.UserService;

@Controller
public class HelloController {
	@Autowired
	UserService userService;

	private static final Logger logger=Logger.getLogger(HelloController.class);
	
	@RequestMapping("/find.action")
    public String find(Model model){
    	List<User> users =userService.finaAll();
    	System.out.println(users);
    	model.addAttribute("msg", users);
    	logger.error(users);
    	return "message";
    }
}
