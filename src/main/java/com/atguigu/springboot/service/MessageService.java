package com.atguigu.springboot.service;

import java.util.List;

import com.atguigu.springboot.bean.Message;
import com.atguigu.springboot.mapper.MessageMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MessageService {
	
	@Autowired
	private MessageMapper messageMapper;
	
	
	public List<Message> showMessage(){
		return messageMapper.showMessage();
	}


	public void addMessage(Message message) {
		messageMapper.addMessage(message);
		
	}
	
}
