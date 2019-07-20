package com.personal.blog.modules.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 喜欢/收藏
 *
 * @author weizp
 */
@Entity
@Table(name = "t_favorite", indexes = {
        @Index(name = "IK_USER_ID", columnList = "user_id")
})
@Data
public class Favorite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    /**
     * 所属用户
     */
    @Column(name = "user_id")
    private long userId;

    /**
     * 内容ID
     */
    @Column(name = "post_id")
    private long postId;

    @Temporal(TemporalType.TIMESTAMP)
    private Date created;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
