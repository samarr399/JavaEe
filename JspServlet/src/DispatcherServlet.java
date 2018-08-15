import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/dispatcher")
public class DispatcherServlet extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int a = 0;
//		HttpSession session = request.getSession();
//		int a = (int) request.getAttribute("k");
//		int a  = (int) session.getAttribute("k");
		Cookie cookies[] = request.getCookies();
		for(Cookie c : cookies) {
			if(c.getName().equals("k")) {
				a = Integer.parseInt(c.getValue());
			}
		}
		ServletContext sc = request.getServletContext();
		String name = sc.getInitParameter("name");
		out.print("this is reqeuest dispatcher and value of k is : "+ a + name);
	}

}
