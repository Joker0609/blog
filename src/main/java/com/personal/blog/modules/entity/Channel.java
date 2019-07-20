package com.personal.blog.modules.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

/**
 * 模块/内容分组,对应界面的菜单
 *
 * @author weizp
 */
@Entity
@Table(name = "t_menu")
@Data
public class Channel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    /**
     * 名称
     */
    @Column(length = 32)
    private String name;

    /**
     * 唯一关键字
     */
    @Column(name = "key_", unique = true, length = 32)
    private String key;

    /**
     * 预览图
     */
    @Column(length = 128)
    private String thumbnail;

    @Column(length = 5)
    private int status;

    /**
     * 排序值
     */
    private int weight;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
