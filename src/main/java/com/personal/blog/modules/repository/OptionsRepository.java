package com.personal.blog.modules.repository;

import com.personal.blog.modules.entity.Options;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @author weizp
 */
public interface OptionsRepository extends JpaRepository<Options, Long>, JpaSpecificationExecutor<Options> {
	Options findByKey(String key);
}
