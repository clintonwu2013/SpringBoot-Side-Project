package com.example.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.demo.dao.MemberDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SampleController {
	@Autowired
    MemberDAO memberDAO;
	@RequestMapping("/members")
	public @ResponseBody List index() {
        List members = memberDAO.query();
		return members;
	}

	@RequestMapping("/greeting") //對應的網址
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name); //讓HTML中的Thymeleaf語法{name}取得屬性值
        return "hello"; //!!請自行修正：剛才建立的HTML檔案名稱
    }
	@RequestMapping("/index") //對應的網址
    public String index(@RequestParam(value="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name); //讓HTML中的Thymeleaf語法{name}取得屬性值
        return "index"; //!!請自行修正：剛才建立的HTML檔案名稱
    }

}

