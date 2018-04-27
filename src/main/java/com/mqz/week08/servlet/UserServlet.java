package com.mqz.week08.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mqz.week08.entity.Userinfo;
import com.mqz.week08.service.UserinfoService;

public class UserServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String action=request.getParameter("op");
		if("reg".equals(action)){
			doReg(request, response);
		}
		
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	protected void doReg(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String username=request.getParameter("username");
		  String password=request.getParameter("password");
		  String realname=request.getParameter("realname");
		  Userinfo user=new Userinfo();
		  user.setPassword(password);
		  user.setRealname(realname);
		  user.setUsername(username);
		  UserinfoService service=new UserinfoService();
		  int result= service.registerUser(user);
		  PrintWriter out= response.getWriter();
		  if(result>0){
			 response.sendRedirect("login.jsp");
		  }else if(result==0){
			  out.println("<script>alert('注册失败');history.go(-1);<script/>");
		  }else{
			  out.println("<script>alert('注册失败,用户名已经存在');history.go(-1);<script/>");
		  }
				  
	}
}
