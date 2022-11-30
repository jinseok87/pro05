package com.myshop.web.controller.custormer;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer/notice/")
public class NoticeController {
	@RequestMapping("list")
	public String list(Model model)	{
		model.addAttribute("test","hello~boot~");
		return "customer/notice/list";
	}
	@RequestMapping("detail")
	public String detail() {
		return "detail";
	}
}
