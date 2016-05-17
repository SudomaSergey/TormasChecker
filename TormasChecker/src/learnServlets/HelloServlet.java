package learnServlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String inputName = request.getParameter("name");
		
		ArrayList<String> validNames = new ArrayList<>(Arrays.asList("nailia","naylia","nayilya","naiyla","наиля", "sergey", "сергій", "сергей", "марина","marina","maryna"));
		
		PrintWriter out = response.getWriter();
		
		if(validNames.contains(inputName.toLowerCase())){
			out.println("<h1>Not tormas!<h1>");
			out.println("<img src = \"http://images.clipartpanda.com/cute-sun-with-sunglasses-clipart-yTkg5reGc.jpeg\">");
			out.close();
		}
		else{
			out.println("<h1>It's tormas - catch him!</h1>");
			out.println("<img src = \"http://www.drivingtesttips.biz/wp-content/uploads/2014/05/when-to-use-handbrake.jpg\">");
			out.close();
		}
	}
}
