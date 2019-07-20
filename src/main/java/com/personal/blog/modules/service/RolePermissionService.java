package com.personal.blog.modules.service;

import com.personal.blog.modules.entity.Permission;
import com.personal.blog.modules.entity.RolePermission;

import java.util.List;
import java.util.Set;

/**
 * @author weizp
 * */
public interface RolePermissionService {
    List<Permission> findPermissions(long roleId);
    void deleteByRoleId(long roleId);
    void add(Set<RolePermission> rolePermissions);

}
