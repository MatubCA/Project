package com.dong.dao.impl;/*
 * ClassName: com.dong.dao.impl.SystemAdminDaoImpl
 * date: 2022/8/9 19:45
 * Description:
 * @author 苏无及
 * @version
 * @since JDK 8
 */

import com.dong.dao.SystemAdminDao;
import com.dong.entity.SystemAdmin;
import com.dong.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SystemAdminDaoImpl implements SystemAdminDao {
    @Override
    public SystemAdmin findByUsername(String username) {
        Connection connection = JDBCUtil.getConnection();
        String sql = "select * from system_admin where username = '" +username+ "'";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            resultSet = statement.executeQuery();
            if (resultSet.next()){
                int id = resultSet.getInt("id");
                String uname = resultSet.getString("username");
                String password = resultSet.getString("password");
                String name = resultSet.getString("name");
                String telephone = resultSet.getString("telephone");
                return new SystemAdmin(id, uname, password, name, telephone);
            }
        } catch (SQLException e) {
            System.out.println("tab1!");
        } finally {
            JDBCUtil.close(connection,statement,resultSet);
        }
          return null;
    }
}
