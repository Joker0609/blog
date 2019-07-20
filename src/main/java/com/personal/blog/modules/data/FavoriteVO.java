package com.personal.blog.modules.data;

import com.personal.blog.modules.entity.Favorite;
import lombok.Data;

/**
 * @author weizp
 */
@Data
public class FavoriteVO extends Favorite {

    private PostVO post;

    public PostVO getPost() {
        return post;
    }

    public void setPost(PostVO post) {
        this.post = post;
    }
}
