package kr.co.ca;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		String[] hobby = request.getParameterValues("hobby");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
//		String hobby = request.getParameter("hobby");
//		System.out.println(hobby);   --> 값을 3개 던지지만 그 중 제일 위에 꺼만 받아들일 수 있음
		
		
		for(String x : hobby){
			out.print(x +"를 선택하셨습니다.");
			out.print("<br>");
			System.out.println(x);
		}
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		String[] hobby = request.getParameterValues("hobby");
		PrintWriter out = response.getWriter();
		out.print("<html>");
		out.print("<body>");
//		String hobby = request.getParameter("hobby");
//		System.out.println(hobby);   --> 값을 3개 던지지만 그 중 제일 위에 꺼만 받아들일 수 있음
		for(String x : hobby){
			out.print(x +"를 선택하셨습니다.");
			out.print("<br>");
			System.out.println(x);
		}
		out.print("</body>");
		out.print("</html>");
	}

}
