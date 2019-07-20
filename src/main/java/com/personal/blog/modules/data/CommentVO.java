package com.personal.blog.modules.data;

import com.alibaba.fastjson.annotation.JSONField;
import com.personal.blog.modules.entity.Comment;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 评论
 * @author weizp
 */
@Data
public class CommentVO extends Comment implements Serializable {

	@JSONField(format="yyyy-MM-dd")
	private Date created;

	private UserVO author;

	private CommentVO parent;

	private PostVO post;

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	public UserVO getAuthor() {
		return author;
	}

	public void setAuthor(UserVO author) {
		this.author = author;
	}

	public CommentVO getParent() {
		return parent;
	}

	public void setParent(CommentVO parent) {
		this.parent = parent;
	}

	public PostVO getPost() {
		return post;
	}

	public void setPost(PostVO post) {
		this.post = post;
	}
}
