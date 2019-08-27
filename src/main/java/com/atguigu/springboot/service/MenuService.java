package com.atguigu.springboot.service;

import java.util.List;

import com.atguigu.springboot.bean.Menu;
import com.atguigu.springboot.mapper.MenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MenuService {
	@Autowired
	private MenuMapper menuMapper;
	
	
	public List<Menu> findAllMenu(){
		return menuMapper.showAllMenu();
	}


	public void addMenu(Menu menu) {
		menuMapper.addMenu(menu);
		
	}
	
	public List<Menu> queryMenuByNameAndType(Menu menu){
		return menuMapper.queryMenuByNameAndType(menu);
	}

}
