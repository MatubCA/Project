package com.dong.service;/*
 * ClassName: com.dong.service.AccountAdminService
 * date: 2022/8/9 19:36
 * Description:
 * @author 苏无及
 * @version
 * @since JDK 8
 */

import com.dong.dto.SystemAdminDto;

public interface SystemAdminService {

    // 数据验证,封装了返回值
    public SystemAdminDto login(String userName, String password);


}
