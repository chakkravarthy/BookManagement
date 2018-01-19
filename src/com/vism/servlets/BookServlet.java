package com.vism.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.visam.bean.Book;

/**
 * Servlet implementation class BookServlet
 */
@WebServlet("*.do")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public BookServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println("request Uri "+request.getRequestURI());
		
		if (request.getRequestURI().equals("/bookmgt/catalog.do")) {
			Book b = new Book();
			b.setId(1);
			b.setBookName("How are you");
			b.setAuthor("John");
			b.setprice((float) 100.0);
			Book b1 = new Book();
			b1.setId(2);
			b1.setBookName("I am fine");
			b1.setAuthor("Martin");
			b1.setprice((float) 50);

			/*
			 * request.setAttribute("book1", b); request.setAttribute("book2",
			 * b1);
			 */

			List<Book> books = new ArrayList<Book>();
			books.add(b);
			books.add(b1);
			
			request.setAttribute("books", books);
			
			/*request.getParameter(arg0)
			request.getAttribute(arg0)
			request.getHeader(arg0)*/

			Cookie c = new Cookie("UserGeneratedCookie", "14646464");
			
			response.addCookie(c);

			request.getRequestDispatcher("catalog.jsp").forward(request, response);
		
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
