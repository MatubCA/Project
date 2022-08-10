package com.dong.service.impl;/*
 * ClassName: com.dong.service.impl.DormitoryAdminServiceImpl
 * date: 2022/8/10 19:31
 * Description:
 * @author 苏无及
 * @version
 * @since JDK 8
 */

import com.dong.dao.DormitoryAdminDao;
import com.dong.dao.impl.DormitoryAdminDaoImpl;
import com.dong.entity.DormitoryAdmin;
import com.dong.service.DormitoryAdminService;

import java.util.List;

public class DormitoryAdminServiceImpl implements DormitoryAdminService {
    private DormitoryAdminDao dao = new DormitoryAdminDaoImpl();

    @Override
    public List<DormitoryAdmin> list() {

        return this.dao.list();
    }

    @Override
    public List<DormitoryAdmin> search(String key, String value) {
        if (value.equals(""))
            return this.dao.list();
        return this.dao.search(key, value);
    }
}
