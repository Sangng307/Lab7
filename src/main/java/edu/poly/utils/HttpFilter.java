package edu.poly.utils;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface HttpFilter extends Filter {

//	@Override
//    default void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
//    		throws IOException, ServletException {
//    	// TODO Auto-generated method stub
//    	HttpServletRequest request = (HttpServletRequest)req;
//    	HttpServletResponse response = (HttpServletResponse)resp;
//    	this.doFilter(request, response, chain);
//    }
//	
//	@Override
//	default void init(FilterConfig e)throws ServletException{}
//	
//	@Override
//	default void destroy() {}
//
//	void doFilter1(HttpServletRequest req, HttpServletResponse resp, FilterChain chain)
//			throws IOException, ServletException;

}