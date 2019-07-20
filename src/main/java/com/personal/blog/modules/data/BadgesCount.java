package com.personal.blog.modules.data;

import lombok.Data;

import java.io.Serializable;

/**
 * 消息层
 * @author weizp
 */
@Data
public class BadgesCount implements Serializable {

    private int messages; // 消息数量

    public int getMessages() {
        return messages;
    }

    public void setMessages(int messages) {
        this.messages = messages;
    }
}
