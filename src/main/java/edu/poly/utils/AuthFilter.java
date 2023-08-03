//package edu.poly.utils;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import edu.poly.model.User;
//
//@WebFilter
//({"/video/like/*","/video/share/","/account/change-password", "/account/admin"})public class AuthFilter
//		implements HttpFilter {
//
//@Override
//public void doFilter1(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
//		throws IOException, ServletException {
//	// TODO Auto-generated method stub
//	String uri =req.getRequestURI();
//	User user = (User) req.getSession().getAttribute("user");
//	String error="";
//	if(user==null) {
//		error = resp.encodeURL("dang nhap lai");
//	}else if(!user.isAdmin() && uri.contains("/account/admin")) {
//		error = resp.encodeURL("ban khong phai admin");
//	}
//	if(!error.isEmpty()) {
//		req.getSession().setAttribute("securi", uri);
//		resp.sendRedirect("Lab7/account/sign-in?error="+resp.encodeURL(error));
//	}else {
//		chain.doFilter(req, resp);
//	}
//	}
//}