package com.personal.blog.modules.service;

import com.personal.blog.modules.data.PostTagVO;
import com.personal.blog.modules.data.TagVO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 标签管理
 * @author weizp
 */
public interface TagService {
    Page<TagVO> pagingQueryTags(Pageable pageable);
    Page<PostTagVO> pagingQueryPosts(Pageable pageable, String tagName);
    void batchUpdate(String names, long latestPostId);
    void deteleMappingByPostId(long postId);
}
