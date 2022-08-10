package com.dong.dao;/*
 * ClassName: com.dong.dao.SystemAdminDao
 * date: 2022/8/9 19:43
 * Description:
 * @author 苏无及
 * @version
 * @since JDK 8
 */

import com.dong.entity.SystemAdmin;

public interface SystemAdminDao {
    public SystemAdmin findByUsername(String username);
}
