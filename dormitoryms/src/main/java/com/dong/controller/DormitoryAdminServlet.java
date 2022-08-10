package com.dong.controller;/*
 * ClassName: com.dong.controller.DormitoryAdminServlet
 * date: 2022/8/10 19:35
 * Description:
 * @author 苏无及
 * @version
 * @since JDK 8
 */

import com.dong.entity.DormitoryAdmin;
import com.dong.service.DormitoryAdminService;
import com.dong.service.impl.DormitoryAdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/dormitoryAdmin")
public class DormitoryAdminServlet extends HttpServlet {
    private DormitoryAdminService dormitoryAdminService = new DormitoryAdminServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String method = req.getParameter("method");
        switch (method){
            case "list":
                req.setAttribute("list",this.dormitoryAdminService.list());
                req.getRequestDispatcher("/adminmanager.jsp").forward(req, resp);
                break;
            case "search":
                String key = req.getParameter("key");
                String value = req.getParameter("value");
                req.setAttribute("list",this.dormitoryAdminService.search(key, value));
                req.getRequestDispatcher("/adminmanager.jsp").forward(req, resp);
        }

    }
}
