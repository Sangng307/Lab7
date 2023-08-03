//package edu.poly.utils;
//
//import java.io.IOException;
//
//import javax.servlet.FilterChain;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//@WebFilter("/*")
//public class AppFilter implements HttpFilter {
//
//	@Override
//	public void doFilter1(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
//			throws IOException, ServletException {
//		// TODO Auto-generated method stub
//		req.setCharacterEncoding("utf-8");
//		resp.setCharacterEncoding("utf-8");
//		HttpServletRequest httpReq = (HttpServletRequest) req;
//        HttpServletResponse httpResp = (HttpServletResponse) resp;
//		RRSharer.add(httpReq, httpResp);
//		chain.doFilter(req, resp);
//		RRSharer.remove();
//	}	
//    
//}