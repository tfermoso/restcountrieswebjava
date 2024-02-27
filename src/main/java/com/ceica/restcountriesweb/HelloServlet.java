package com.ceica.restcountriesweb;

import java.io.*;

import com.ceica.restcountriesweb.Services.RestCountriesService;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        RestCountriesService service=new RestCountriesService();
        String[] regions= service.getRegions();
        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + regions[0] + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}