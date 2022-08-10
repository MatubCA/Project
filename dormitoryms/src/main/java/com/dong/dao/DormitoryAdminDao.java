package com.dong.dao;/*
 * ClassName: com.dong.dao.DormitoryAdminDao
 * date: 2022/8/10 19:14
 * Description:
 * @author 苏无及
 * @version
 * @since JDK 8
 */

import com.dong.entity.DormitoryAdmin;

import java.util.List;

public interface DormitoryAdminDao {
    public List<DormitoryAdmin> list();
    public List<DormitoryAdmin> search(String key,String value);
}
