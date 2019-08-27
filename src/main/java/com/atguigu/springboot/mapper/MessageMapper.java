package com.atguigu.springboot.mapper;

import java.util.List;


import com.atguigu.springboot.bean.Message;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MessageMapper {

	@Select("select * from message")
	List<Message> showMessage();

	@Insert("INSERT INTO message(content,username,time) VALUES(#{content},#{username},#{time})")
	void addMessage(Message message);
}
