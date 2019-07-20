package com.personal.blog.modules.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 用户角色映射表
 *
 * @author weizp
 */
@Entity
@Table(name = "shiro_user_role")
@Data
public class UserRole implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "user_id")
	private Long userId;

	@Column(name = "role_id")
	private Long roleId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
}
