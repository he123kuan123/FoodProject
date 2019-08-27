package com.atguigu.springboot.controller;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.atguigu.springboot.bean.Information;
import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.service.UserException;
import com.atguigu.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	//登录功能
	@RequestMapping("/login")
	public String login(HttpServletRequest request) throws Exception{
		//封装表单数据
		User form=new User();
		form.setUsername(request.getParameter("username"));
		form.setPassword(request.getParameter("password"));
		try {
			User user=userService.login(form);
			request.getSession().setAttribute("session_user", user);
			request.setAttribute("msg", "登录成功");
			return "/user/msg";
		} catch (UserException e) {
		request.setAttribute("msg", e.getMessage());
		return "/user/login";
		}
	}
	
	//注册功能
	@RequestMapping("/regist")
	public String regist(HttpServletRequest request) throws Exception{
		//封装表单数据
		User form =new User();
		form.setUsername(request.getParameter("username"));
		form.setPassword(request.getParameter("password"));
		//生成注册日期并封装
		Date date =new Date();
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		form.setRegtime(format.format(date));
		
		//1.创建一个map用来封装错误信息，其中key为表单字段名称，值为错误信息。
				Map<String,String> errors=new HashMap<String,String>();
				//2.获取form 中的username password email进行校验
				String username =form.getUsername();
				if(username==null||username.trim().isEmpty()){
					errors.put("username", "用户名不能为空");
				}
				String password =form.getPassword();
				if(password==null||password.trim().isEmpty()){
					errors.put("password", "密码不能为空");
				}
			
				//判断是否存在错误信息
				if(errors.size()>0){
					//1.保存错误信息
					//2.保存表单数据
					//3.转发到regist.jsp
					request.setAttribute("errors", errors);
					request.setAttribute("form", form);
					return "/user/regist";
				}
				
				//调用service的regist方法
				try {
					userService.regist(form);
					request.setAttribute("msg", "注册成功");
					User user1 = userService.findByUsername(form.getUsername());
					int uid = user1.getUid();
					System.out.println(uid+form.getUsername());
					userService.setUid(uid);
					return "/user/msg";
				} catch (UserException e) {
					request.setAttribute("msg", e.getMessage());
					request.setAttribute("form", form);
					return "/user/regist";
				}
		
	}
	
	//退出功能
	@RequestMapping("/quit")
	public String quit(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().invalidate();
		return "/index";
	}
	
	//个人信息回显功能
	@RequestMapping("/showInformation")
	public String showInformation(HttpServletRequest request) throws Exception{
		try{
		
		 User user = (User) request.getSession().getAttribute("session_user");
		 int uid = user.getUid();
		Information information = userService.showInformation(uid);
		request.setAttribute("information", information);
		return "/user/information";
		}catch(Exception e){
			request.setAttribute("msg", "您还没有登录!");
			return "/user/msg";
		}
	}
	
	//修改个人信息
	@RequestMapping("/editInformation")
	public String editInformation(HttpServletRequest request){
		try {
			Information form=new Information();
			form.setRealname(request.getParameter("realname"));
			form.setSex(request.getParameter("sex"));
			form.setAge(request.getParameter("age"));
			form.setPhone(request.getParameter("phone"));
			User user = (User) request.getSession().getAttribute("session_user");
			 int uid = user.getUid();
			form.setUid(uid);
			userService.editInformation(form);
			request.setAttribute("msg", "修改个人信息成功");
			return "/user/msg";
		} catch (Exception e) {
			request.setAttribute("msg", "出错了，请重试~");
			return "/user/information";
		}
		
		
	}
	
}
