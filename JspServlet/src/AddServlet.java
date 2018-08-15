

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int num1 = Integer.parseInt(request.getParameter("num1"));
//		int num2 = Integer.parseInt(request.getParameter("num2"));
//		int sum = num1 + num2;
//		PrintWriter out = response.getWriter();
//		out.print(sum);
//		request.setAttribute("k",num1);
//		RequestDispatcher rd = request.getRequestDispatcher("/dispatcher");
//		rd.forward(request, response);
//		HttpSession session = request.getSession();
//		session.setAttribute("k", num1);
		
		Cookie cookie = new Cookie("k",num1 + "");
		response.addCookie(cookie);
		
		response.sendRedirect("dispatcher");
	}

}
