package edu.poly.utils;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class XHttp {
    // Pass HttpServletRequest object as an argument
	public static String getRealPath(HttpServletRequest request, String path) {
        ServletContext context = request.getServletContext();
        if (context != null) {
            return context.getRealPath(path);
        }
        return null;
	}
}
