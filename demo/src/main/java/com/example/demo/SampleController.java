package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class SampleController {
	
	@RequestMapping("/hello")
	public @ResponseBody Map<Integer, Integer> index() {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(1,2);
		return map;
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

