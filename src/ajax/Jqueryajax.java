package ajax;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jqueryajax
 */
@WebServlet("/jqueryajax")
public class Jqueryajax extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=utf-8");
		//response.setCharacterEncoding("utf-8");

		
		System.out.println(request.getMethod());
		
		//接收参数
		String user = request.getParameter("username");
		PrintWriter out = response.getWriter();
		out.write("dfafdafdafasdf");
	
	
		System.out.println(user);
		response.getWriter().print("中文");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
