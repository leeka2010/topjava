package ru.javawebinar.topjava.web;

import org.slf4j.Logger;
import ru.javawebinar.topjava.util.MealsUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * Created by ruslangrigoryev on 19.12.16.
 */
public class MealServlet extends HttpServlet{
    private static final Logger LOG = getLogger(MealServlet.class);

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        LOG.info("getAll");
        request.setAttribute("mealList",);

//        request.getRequestDispatcher("/meals.jsp").forward(request, response);
        response.sendRedirect("meals.jsp");
    }
}
