package com.dong.dto;/*
 * ClassName: com.dong.dto.SystemAdminDto
 * date: 2022/8/9 19:38
 * Description:
 * @author 苏无及
 * @version
 * @since JDK 8
 */

import com.dong.entity.SystemAdmin;

public class SystemAdminDto {
    private Integer code;
    private SystemAdmin systemAdmin;

    public SystemAdminDto() {
    }

    public SystemAdminDto(Integer code, SystemAdmin systemAdmin) {
        this.code = code;
        this.systemAdmin = systemAdmin;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public SystemAdmin getSystemAdmin() {
        return systemAdmin;
    }

    public void setSystemAdmin(SystemAdmin systemAdmin) {
        this.systemAdmin = systemAdmin;
    }
}
