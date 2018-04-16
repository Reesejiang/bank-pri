/**
 * 
 */
package cn.itcast.ssm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.ssm.po.UserList;
import cn.itcast.ssm.service.UserListService;

/**
 * @author Reese.jiang
 *
 * 2018年3月6日下午4:42:17
 */
@Controller
public class LoginController {
	
	
	
	
	//登陆
	@RequestMapping("/login")
	public String login(HttpSession session, String userName, String password)
			throws Exception {
		
		// 调用service进行用户身份验证*
		
		// 在session中保存用户身份信息
		session.setAttribute("userName", userName);
		
		// 重定向到用户列表页面
		return "redirect:/userList/queryUser.action";
		
		//return "welcome";

	
	}
	//退出
	@RequestMapping("/logout")
	public String logout(HttpSession session) throws Exception {

		// 清除session
		session.invalidate();

		// 重定向到用户列表页面
		return "redirect:/userList/queryUser.action";
	}
	
	



}
