/**
 * 
 */
package cn.itcast.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.itcast.ssm.po.UserList;
import cn.itcast.ssm.po.UserListCustom;
import cn.itcast.ssm.po.UserQueryVo;
import cn.itcast.ssm.service.UserListService;

/**
 * @author Reese.jiang
 * 
 *
 *         2018年3月1日上午10:14:47
 */
@Controller
// 为了对url进行分类管理 ，可以在这里定义根路径，最终访问url是根路径+子路径
// 比如：用户列表：/userList/queryUser.action
@RequestMapping("/userList")
public class UserController {

	@Autowired
	private UserListService userListService;

	// 用户查询列表
	// @RequestMapping实现 对queryItems方法和url进行映射，一个方法对应一个url
	// 一般建议将url和方法写成一样
	@RequestMapping("/queryUser")
	public ModelAndView queryUser(HttpServletRequest request,UserQueryVo userQueryVo) throws Exception {

		// 测试feoward后request是否可以共享
		System.out.println(request.getParameter("userName"));
		
		// 调用service查找 数据库，查询用户列表
		List<UserListCustom> userList = userListService.findUserList(userQueryVo);

		// 返回ModelAndView
		ModelAndView modelAndView = new ModelAndView();
		// 相当 于request的setAttribut，在jsp页面中通过userList取数据
		modelAndView.addObject("userList", userList);

		// 指定视图
		// 下边的路径，如果在视图解析器中配置jsp路径的前缀和jsp路径的后缀，修改为
		// modelAndView.setViewName("/WEB-INF/jsp/userList/userList.jsp");
		// 上边的路径配置可以不在程序中指定jsp路径的前缀和jsp路径的后缀
		modelAndView.setViewName("userList/userList");

		return modelAndView;

	}

	/*
	 * // 用户信息修改页面显示 // @RequestMapping("/editUserList") //
	 * 处于安全性的考虑，限制http请求方法，可以post和get
	 * 
	 * @RequestMapping(value = "/editUserList", method = { RequestMethod.POST,
	 * RequestMethod.GET })
	 * 
	 * public ModelAndView editUserList() throws Exception {
	 * 
	 * // 调用service查询用户信息根据商品userName查询商品信息 UserListCustom userListCustom =
	 * userListService.findUserListByuserName("Xin");
	 * 
	 * // 返回ModelAndView ModelAndView modelAndView = new ModelAndView();
	 * 
	 * // 将商品信息放到model modelAndView.addObject("userListCustom", userListCustom);
	 * 
	 * // 用户修改页面 modelAndView.setViewName("userList/editUserList"); return
	 * modelAndView;
	 * 
	 * }
	 */

	// 用户信息修改页面显示
	// @RequestMapping("/editUserList")
	// 处于安全性的考虑，限制http请求方法，可以post和get
	@RequestMapping(value = "/editUserList", method = { RequestMethod.POST, RequestMethod.GET })

	// 将方法返回值类型设置为String类型
	public String editUserList(Model model, String userName,UserList userList) throws Exception {
		
		System.out.println("userName"+ userName);
		// 调用service查询用户信息根据商品userName查询用户信息*
		UserListCustom userListCustom = userListService.findUserListByuserName(userName);

		// 返回ModelAndView
		// ModelAndView modelAndView = new ModelAndView();

		// 将商品信息放到model
		// modelAndView.addObject("userListCustom", userListCustom);

		// 用户修改页面
		// modelAndView.setViewName("userList/editUserList");

		// 通过形参中的model将model数据传到页面
		// 相当于modelAndView.addObject方法
		model.addAttribute("userListCustom", userListCustom);
		
		return "userList/editUserList";

	}

	// 用户信息修改提交
	@RequestMapping("/editUserListSubmit")
	public String editUserListSubmit(HttpServletRequest request,String userName,UserListCustom userListCustom) throws Exception {

		
		// 调用service更新用户信息，页面需要将用户信息传到此方法
		userListService.updateUserList(userName, userListCustom);

		// 返回ModelAndView
		// ModelAndView modelAndView = new ModelAndView();

		// 返回成功页面
		// modelAndView.setViewName("success");

		// 重定向到用户查询列表
		// return "redirect:queryUser.action";

		// 页面转发
		//return "forward:queryUser.action";

		return "success";

	}
	
	//删除用户信息
	@RequestMapping("/deleteuserList")
	public String deleteuserList(String userName) throws Exception{
		//调用service删除用户
		System.out.println(" delete userList userName:"+ userName);
		userListService.deleteuserList(userName);
		return "success";
		
	}
	
	//添加用户信息
	@RequestMapping("/insertuserList")
	public String insertuserList(UserList userList) throws Exception{
		
		//userListService.insertuserList(userList);
		
		return "userList/insertuserList";
	
	}
	
	//添加用户信息提交
	@RequestMapping("/insertuserListSubmit")
	public String insertuserListSubmit(UserList userList) throws Exception{
		userListService.insertuserList(userList);
		return "success";
	
	}
}
