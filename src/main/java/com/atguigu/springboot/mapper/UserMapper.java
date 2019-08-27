package com.atguigu.springboot.mapper;



import com.atguigu.springboot.bean.Information;
import com.atguigu.springboot.bean.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {

    @Select("select * from user where username=#{username}")
    User findByUsername(String username);

    @Insert("INSERT INTO USER (username,PASSWORD,regtime) VALUES (#{username},#{password},#{regtime})")
    void regist(User user);
    
    @Select("SELECT * FROM information WHERE uid=#{uid}")
    Information showInformation(int uid);

    @Update("UPDATE information SET realname=#{realname},sex=#{sex},age=#{age},phone=#{phone} where uid=#{uid}")
    void editInformation(Information form);

    @Insert("INSERT INTO information (uid) VALUES (#{uid})")
    void setUid(int uid);
}