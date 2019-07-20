package com.personal.blog.modules.repository;

import com.personal.blog.modules.entity.SecurityCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author weizp
 */
public interface SecurityCodeRepository extends JpaRepository<SecurityCode, Long>, JpaSpecificationExecutor<SecurityCode> {
    SecurityCode findByKeyAndType(String key, int type);
    SecurityCode findByKey(String key);
}
