package kr.co.ca;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class KrEncoding
 */
@WebFilter("/*") //--> �׻� Ŭ���̾�Ʈ�� ��� ��û�� ���͸� ��ġ�� ���� /*�� ����!!
public class KrEncoding implements Filter {

    /**
     * Default constructor. 
     */
    public KrEncoding() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		request.setCharacterEncoding("euc-kr");
		response.setContentType("text/html;charset=euc-kr");
		//doFilter���� ����� ���ڵ� �� ���·� �����Ͱ� �Ѿ�Եȴ�.
		chain.doFilter(request, response);
		System.out.println("���� ��!");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}