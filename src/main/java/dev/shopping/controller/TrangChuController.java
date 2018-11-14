package dev.shopping.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.dom4j.rule.Mode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import dev.shopping.persistentdata.Hang;
@Controller
public class TrangChuController {
	@RequestMapping("/")
	public String printHello(ModelMap model) {
		List<Hang> listhang = new ArrayList<>();
		listhang.add(new Hang("1","2"));
		listhang.add(new Hang("1","2"));
		listhang.add(new Hang("1","2"));
		model.addAttribute("list", listhang);
	    return "index";
	}
}
