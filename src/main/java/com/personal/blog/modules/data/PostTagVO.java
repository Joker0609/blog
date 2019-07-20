package com.personal.blog.modules.data;

import com.personal.blog.modules.entity.PostTag;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author weizp
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class PostTagVO extends PostTag implements Serializable {

    private PostVO post;

    public PostVO getPost() {
        return post;
    }

    public void setPost(PostVO post) {
        this.post = post;
    }
}
