package com.personal.blog.modules.data;

import com.personal.blog.modules.entity.Tag;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * 标签
 * @author weizp
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class TagVO extends Tag implements Serializable {

    private PostVO post;

    public PostVO getPost() {
        return post;
    }

    public void setPost(PostVO post) {
        this.post = post;
    }
}
