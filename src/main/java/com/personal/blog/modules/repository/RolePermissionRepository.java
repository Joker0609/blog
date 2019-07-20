package com.personal.blog.modules.repository;

import com.personal.blog.modules.entity.RolePermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

/**
 * @author weizp
 */
public interface RolePermissionRepository extends JpaRepository<RolePermission, Long>, JpaSpecificationExecutor<RolePermission> {
    int deleteByRoleId(long roleId);
    List<RolePermission> findAllByRoleId(long roleId);
}
