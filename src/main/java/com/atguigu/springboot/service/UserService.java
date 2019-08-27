package com.atguigu.springboot.service;

import com.atguigu.springboot.bean.Information;
import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;

	//登录
	public User login(User form) throws UserException{
		
		User user = userMapper.findByUsername(form.getUsername());
		if(user==null){
			throw new UserException("用户名不能为空或用户名不存在");
		}
		if(!user.getPassword().equals(form.getPassword())){
			throw new UserException("密码错误");
		}
		return user;
	}

	
	//注册
	public void regist(User form) throws UserException, InterruptedException{
		User user=userMapper.findByUsername(form.getUsername());
		if(user!=null){
			throw new UserException("用户名已被注册");}
		//插入用户到数据库中
		userMapper.regist(form);
	}
	
	//个人信息回显功能
	
	public Information showInformation(int uid){
		Information information = userMapper.showInformation(uid);
		return information;
	}

	//修改个人信息
	public void editInformation(Information form) {
		userMapper.editInformation(form);
		
	}


	public void setUid(int uid) {
		userMapper.setUid(uid);
		
	}
	
	public User findByUsername(String username){
		return userMapper.findByUsername(username);
	}
}
