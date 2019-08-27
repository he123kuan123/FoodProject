package com.atguigu.springboot.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.atguigu.springboot.bean.Message;
import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.commons.CommonUtils;


@Controller
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	
	@RequestMapping("/showMessage")
	public String showMessage(HttpServletRequest request) throws Exception{
		List<Message> messageList = messageService.showMessage();
		Collections.reverse(messageList);
		request.setAttribute("messageList", messageList);
		return "/message/message";
	}
	
	@RequestMapping("/addMessage")
	public String addMessage(HttpServletRequest request){
		Message message=CommonUtils.toBean(request.getParameterMap(), Message.class);
		User user = (User) request.getSession().getAttribute("session_user");
		if(user==null){
			message.setUsername("游客");
		}else{
			message.setUsername(user.getUsername());
		}
		Date date =new Date();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		message.setTime(format.format(date));
		messageService.addMessage(message);
		List<Message> messageList = messageService.showMessage();
		Collections.reverse(messageList);
		request.setAttribute("messageList", messageList);
		return "/message/message";
	}
}
