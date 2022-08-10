package com.dong.service;/*
 * ClassName: com.dong.service.DormitoryAdminService
 * date: 2022/8/10 19:31
 * Description:
 * @author 苏无及
 * @version
 * @since JDK 8
 */

import com.dong.entity.DormitoryAdmin;

import java.util.List;

public interface DormitoryAdminService {
    public List<DormitoryAdmin> list();
    public List<DormitoryAdmin> search(String key, String value);
}
