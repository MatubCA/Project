package com.dong.service.impl;/*
 * ClassName: com.dong.service.impl.AccountAdminServiceImpl
 * date: 2022/8/9 19:41
 * Description:
 * @author 苏无及
 * @version
 * @since JDK 8
 */

import com.dong.dao.SystemAdminDao;
import com.dong.dao.impl.SystemAdminDaoImpl;
import com.dong.dto.SystemAdminDto;
import com.dong.entity.SystemAdmin;
import com.dong.service.SystemAdminService;

public class SystemAdminServiceImpl implements SystemAdminService {
    private SystemAdminDao systemAdminDao = new SystemAdminDaoImpl();
    @Override
    public SystemAdminDto login(String username, String password) {
        SystemAdminDto adminDto = new SystemAdminDto();
        SystemAdmin result = this.systemAdminDao.findByUsername(username);
        if (result == null) {
            adminDto.setCode(-1);
        } else if (!result.getPassword().equals(password)){
            adminDto.setCode(1);
        }else{
            adminDto.setCode(0);
            adminDto.setSystemAdmin(result);
        }
        return  adminDto;
    }
}
