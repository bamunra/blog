package net.devstudy.blog.controller.page;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.devstudy.blog.controller.AbstractController;

@WebServlet("/error")

public class ErrorController extends AbstractController {

	private static final long serialVersionUID = -1741107861025409404L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		forvardToPage("error.jsp",req, resp);
	}

}