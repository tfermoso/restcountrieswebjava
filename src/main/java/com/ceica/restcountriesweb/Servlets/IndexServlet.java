package com.ceica.restcountriesweb.Servlets;

import com.ceica.restcountriesweb.Models.CountryDTO;
import com.ceica.restcountriesweb.Services.RestCountriesService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "indexServlet", value = "")
public class IndexServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        RestCountriesService service=new RestCountriesService();
        String[] regions= service.getRegions();
        request.setAttribute("regions",regions);
        String region = request.getParameter("region");
        if(region!=null){
            List<CountryDTO> countryDTOList=service.getCoutriesByRegion(region);
            request.setAttribute("countries",countryDTOList);
        }
        request.getRequestDispatcher("page.jsp").forward(request, response);
    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("page.jsp").forward(request, response);

    }
}
