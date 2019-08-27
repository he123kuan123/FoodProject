package com.atguigu.springboot.controller;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.itcast.commons.CommonUtils;
import com.atguigu.springboot.bean.Menu;
import com.atguigu.springboot.bean.User;
import com.atguigu.springboot.service.MenuService;
import com.atguigu.springboot.service.UserService;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
public class MenuController {
	@Autowired
	private MenuService menuService;
	@Autowired
	private UserService userService;


	
	//展示所有产品信息
	@RequestMapping("/showAllMenu")
	public String showAllMenu(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		
		//调用Service方法返回一个List集合
		List<Menu> menuList = menuService.findAllMenu();
		
		//jedis.set("menuList".getBytes(),util.Util.serializableUtil(menuList));
		
		
		//将list集合保存在request域中
		request.setAttribute("menuList", menuList);		
		
		System.out.println(menuList);
		//转发到menulist页面
		return "/menu/menulist";	
	}
	
	//上传菜谱
//	@RequestMapping("/addMenu")
//	public String addMenu(HttpServletRequest request)throws Exception{
//
//		//1.把表单数据封装到book对象中
//		//上传三步
//		
//		//创建工厂
//		DiskFileItemFactory factory=new DiskFileItemFactory();
//		//得到解析器
//		ServletFileUpload sfu= new ServletFileUpload(factory);
//		//使用解析器解析request对象，得到List<FileItem>
//		try {
//			List<FileItem> fileItemList=sfu.parseRequest(request);
//		//把fileItemList中的数据封装到Book对象中
//			//把所有普通表单字段数据线封装到map中
//			//再把map中的数据封装到Book对象中
//			Map<String,String> map=new HashMap<String, String>();
//			for(FileItem fileItem:fileItemList){
//				if(fileItem.isFormField()){
//				map.put(fileItem.getFieldName(), fileItem.getString("UTF-8"));
//				}
//			}
//			Menu menu=CommonUtils.toBean(map, Menu.class);
//			Date date =new Date();
//			DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
//			menu.setMaddtime(format.format(date));
//			
//			//保存上传的文件
//			//*保存的目录
//			//*保存的名称
//			
//			String savepath=request.getServletContext().getRealPath("/menu_image");
//			//得到文件名称
//			String filename=CommonUtils.uuid();
//			File destFile=new File(savepath,filename);
//			fileItemList.get(1).write(destFile);
//			menu.setMurl("/menu_img/"+filename);
//			//使用bookservice完成保存
//			menuService.addMenu(menu);
//			request.setAttribute("msg", "添加成功");
//			return "/user/msg";
//		} catch (Exception e) {
//			request.setAttribute("msg", "发布失败，请重试");
//			return "/user/msg";
//		}
//
//	}
	
	
	
	//上传菜谱
	@RequestMapping("/addMenu")
	public String addMenu(HttpServletRequest request) {
		//创建磁盘工厂 缓冲区 和 磁盘目录
		DiskFileItemFactory factory = new DiskFileItemFactory();
		
		//设置文件上传的大小限制
		ServletFileUpload upload= new ServletFileUpload(factory);
		upload.setFileSizeMax(1024*1024*10);//最大上传10M
		upload.setHeaderEncoding("UTF-8");//设置编码格式
		try{
			List<FileItem> fileItemList=upload.parseRequest(request);
			Map<String,String> map=new HashMap<>();
			for (FileItem fileItem : fileItemList) {
				if(fileItem.isFormField()){
					map.put(fileItem.getFieldName(), fileItem.getString("UTF-8"));
				}
			}
			Menu menu= CommonUtils.toBean(map, Menu.class);
			Date date =new Date();
			DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			menu.setMaddtime(format.format(date));
			System.out.println(menu);
			//保存上传的文件
			//*保存的目录
			//*保存的名称
			String savepath=request.getServletContext().getRealPath("/menu_image");
			//得到文件名称
			String filename=CommonUtils.uuid()+"_"+fileItemList.get(1).getName();
			File destFile=new File(savepath,filename);
			fileItemList.get(1).write(destFile);
			menu.setMurl("/menu_image/"+filename);
			System.out.println(menu);
			menuService.addMenu(menu);
			request.setAttribute("msg", "添加成功");
			return "/user/msg";
		}catch(Exception e){
			request.setAttribute("msg", "上传失败，请重新尝试");
			return "/user/msg";
		}
	}
		
	//个人信息回显功能
	@RequestMapping("/menushowInformation")
	public String showInformation(HttpServletRequest request) throws Exception{
		try{
		
		 User user = (User) request.getSession().getAttribute("session_user");
		 int uid = user.getUid();
		userService.showInformation(uid);
		return "/menu/addmenu";
		}catch(Exception e){
			request.setAttribute("msg", "您还没有登录!");
			return "/user/msg";
		}
	}
	
	//菜品排行
	@RequestMapping("/showPaihang")
	public String showPaihang(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		
		//调用Service方法返回一个List集合
		List<Menu> menuList = menuService.findAllMenu();
		
		Collections.reverse(menuList);
		//将list集合保存在request域中
		request.setAttribute("menuList", menuList);		
		
		System.out.println(menuList);
		//转发到menulist页面
		return "/menu/menupaihang";	
	}
	
	//菜品排行
	@RequestMapping("/showPaihang2")
	public String showPaihang2(HttpServletRequest request,HttpServletResponse response)throws Exception{
		
		
		//调用Service方法返回一个List集合
		List<Menu> menuList = menuService.findAllMenu();
		
		//将list集合保存在request域中
		request.setAttribute("menuList", menuList);		
		
		System.out.println(menuList);
		//转发到menulist页面
		return "/menu/menupaihang";	
	}
	
	//按照名称和类型查询菜品
	@RequestMapping("/queryMenuByNameAndType")
	public String queryMenuByNameAndType(HttpServletRequest request) throws Exception{
		Menu form=CommonUtils.toBean(request.getParameterMap(), Menu.class);
		try {
			List<Menu> menuList = menuService.queryMenuByNameAndType(form);
			System.out.println(menuList);
			if(menuList.isEmpty()){
				request.setAttribute("msg", "查询失败，请输入正确的名称或类型");
				return "/menu/menuquery";
			}
			request.setAttribute("menuList", menuList);
			return "/menu/menulist2";
		} catch (Exception e) {
			request.setAttribute("msg", "查询失败，请输入正确的名称或类型");
			return "/menu/menulist2";
		}
	}
	

	
	
	
}
