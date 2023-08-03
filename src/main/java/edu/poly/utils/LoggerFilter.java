//package edu.poly.utils;
//
//import java.io.IOException;
//import java.util.Date;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//import edu.poly.model.User;
//
//@WebFilter("/account/admin/*")
//public class LoggerFilter implements HttpFilter{
//
//	@Override
//	public void doFilter1(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
//			throws IOException, ServletException {
//		// TODO Auto-generated method stub
//		User user = (User) req.getSession().getAttribute("user");
//		String uri = req.getRequestURI();
//		Date time = new Date();
//		chain.doFilter(req, resp);
//	}
//
//}
