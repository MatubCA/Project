package com.dong.dao.impl;/*
 * ClassName: com.dong.dao.impl.DormitoryAdminDaoImpl
 * date: 2022/8/10 19:16
 * Description:
 * @author 苏无及
 * @version
 * @since JDK 8
 */

import com.dong.dao.DormitoryAdminDao;
import com.dong.entity.DormitoryAdmin;
import com.dong.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DormitoryAdminDaoImpl implements DormitoryAdminDao {
    @Override
    public List<DormitoryAdmin> list() {
        Connection conn = JDBCUtil.getConnection();
        String sql = "select * from dormitory_admin";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<DormitoryAdmin> list = new ArrayList<DormitoryAdmin>();
        try {
            statement = conn.prepareStatement(sql);
            resultSet = statement.executeQuery();

            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);
                String name = resultSet.getString(4);
                String gender = resultSet.getString(5);
                String telephone = resultSet.getString(6);
                list.add(new DormitoryAdmin(id, username, password, name, gender, telephone));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,statement,resultSet);
        }
        return list;
    }

    @Override
    public List<DormitoryAdmin> search(String key, String value) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "select * from dormitory_admin where "+key+" like '%"+value+"%'";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        List<DormitoryAdmin> list = new ArrayList<DormitoryAdmin>();
        try {
            statement = conn.prepareStatement(sql);
            resultSet = statement.executeQuery();
            while(resultSet.next()) {
                int id = resultSet.getInt(1);
                String username = resultSet.getString(2);
                String password = resultSet.getString(3);
                String name = resultSet.getString(4);
                String gender = resultSet.getString(5);
                String telephone = resultSet.getString(6);
                list.add(new DormitoryAdmin(id, username, password, name, gender, telephone));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(conn,statement,resultSet);
        }
        return list;
    }
}
