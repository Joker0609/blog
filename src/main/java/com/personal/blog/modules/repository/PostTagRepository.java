package com.personal.blog.modules.repository;

import com.personal.blog.modules.entity.PostTag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

/**
 * @author weizp
 */
@Repository
public interface PostTagRepository extends JpaRepository<PostTag, Long>, JpaSpecificationExecutor<PostTag> {
    Page<PostTag> findAllByTagId(Pageable pageable, long tagId);
    PostTag findByPostIdAndTagId(long postId, long tagId);
    int deleteByPostId(long postId);
}
