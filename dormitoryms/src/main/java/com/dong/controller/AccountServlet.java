package com.dong.controller;/*
 * ClassName: com.dong.controller.AccountServlet
 * date: 2022/8/9 19:27
 * Description:
 * @author 苏无及
 * @version
 * @since JDK 8
 */

import com.dong.dto.SystemAdminDto;
import com.dong.service.SystemAdminService;
import com.dong.service.impl.SystemAdminServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/account")
public class AccountServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String method = req.getParameter("method");
        switch (method) {
            case "login" :
                String username = req.getParameter("username");
                String password = req.getParameter("password");
                SystemAdminService systemAdminService = new SystemAdminServiceImpl();
                SystemAdminDto login = systemAdminService.login(username, password);
                if (login.getCode() == -1){
                    req.setAttribute("usernameError","用户名不存在");
                    req.getRequestDispatcher("/login.jsp").forward(req,resp);
                }else if (login.getCode() == 1){
                    req.setAttribute("passwordError","密码错误");
                    req.getRequestDispatcher("/login.jsp").forward(req,resp);
                }else{
                    HttpSession session = req.getSession();
                    session.setAttribute("systemAdmin",login.getSystemAdmin());
                    resp.sendRedirect("/systemadmin.jsp");
                }
                break;
            case "logout":
                req.getSession().invalidate();
                resp.sendRedirect("/login.jsp");
                break;
        }


    }
}
