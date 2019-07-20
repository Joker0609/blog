package com.personal.blog.modules.data;

import com.personal.blog.modules.entity.Message;
import lombok.Data;

/**
 * @author weizp
 */
@Data
public class MessageVO extends Message {

    private UserVO from;

    private PostVO post;

    public UserVO getFrom() {
        return from;
    }

    public void setFrom(UserVO from) {
        this.from = from;
    }

    public PostVO getPost() {
        return post;
    }

    public void setPost(PostVO post) {
        this.post = post;
    }
}
