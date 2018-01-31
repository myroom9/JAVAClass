package kr.co.ca;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String userName = request.getParameter("userName");
		String sex = request.getParameter("sex");
		String[] hobby = request.getParameterValues("hobby");
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("���� ������ ������ ID�� " + id + "�Դϴ�.<br>");
		out.print("���� ������ ������ PW�� " + pw + "�Դϴ�.<br>");
		out.print("���� ������ ������ �̸��� " + userName + "�Դϴ�.<br>");
		out.print("���� ������ ������ ������ " + sex + "�Դϴ�.<br>");
		out.print("���� ������ ������ ��̴� ");
		for(String x : hobby){
			out.print(x+" ");
		}
		out.print("�Դϴ�<br>");
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=euc-kr");
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String userName = request.getParameter("userName");
		String sex = request.getParameter("sex");
		String[] hobby = request.getParameterValues("hobby");
		
		String msg = String.join(",", hobby);
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>");
		out.print("<body>");
		out.print("���� ������ ������ ID�� " + id + "�Դϴ�.<br>");
		out.print("���� ������ ������ PW�� " + pw + "�Դϴ�.<br>");
		out.print("���� ������ ������ �̸��� " + userName + "�Դϴ�.<br>");
		out.print("���� ������ ������ ������ " + sex + "�Դϴ�.<br>");
		out.print("���� ������ ������ ��̴� ");
		for(String x : hobby){
			out.print(x+" ");
		}
		out.print(msg);
		out.print("�Դϴ�<br>");
		out.print("</body>");
		out.print("</html>");
	}

}