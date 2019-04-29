package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/login.do")
public class LoginServlet extends HttpServlet{

	private LoginService loginService = new LoginService();
	/**
	 * 
	 */
	private static final long serialVersionUID = -154176561953216931L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		PrintWriter out = response.getWriter();
//		out.println("<html>");
//		out.println("<head>");
//		out.println("<title>My First WebServlet  </title>");
//		out.println("</head>");
//		out.println("<body>");
//		out.println("Welcome to my first Servlet");
//		out.println("name = "+ request.getParameter("name"));
//		out.println("password = "+ request.getParameter("password"));
//		out.println("</body>");
//		out.println("</html>");
		request.setAttribute("name", request.getParameter("name"));
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if (LoginService.isUserValid(request.getParameter("name"), request.getParameter("password")))
		{
			request.setAttribute("name", request.getParameter("name"));
			request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);

		}
		else
		{
		request.setAttribute("messageError","Usted como que no es el usuario ._.");
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	
		}
	}


}
