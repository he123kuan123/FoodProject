package com.atguigu.springboot.mapper;



import com.atguigu.springboot.bean.Menu;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MenuMapper {


    @Select("select * from menu")
    List<Menu> showAllMenu();

    @Insert("INSERT INTO menu (mname,murl,mtype,mmaterial,mtaste,mdescription,maddtime)VALUES (#{mname},#{murl},#{mtype},#{mmaterial},#{mtaste},#{mdescription},#{maddtime})")
	void addMenu(Menu menu);

    @Select("SELECT* FROM menu WHERE mname LIKE \"%\"#{mname}\"%\" AND mtype LIKE \"%\"#{mtype}\"%\"")
    List<Menu> queryMenuByNameAndType(Menu menu);
	
	
}