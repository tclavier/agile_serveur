package fr.iutinfo.skeleton.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "testServlet", urlPatterns = {"/hello"}, initParams = {@WebInitParam(name = "simpleParam", value = "paramValue")})
public class Hello extends HttpServlet {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        String simpleParam = getServletConfig().getInitParameter("simpleParam");
        out.println("Hello World " + simpleParam);
        out.close();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
    
    public static void main(String[] args) {
		System.out.println("test : Hello World !");
	}

}