package com.zhjiang.entity;

/**
 * @Description 博客类型
 * @author Thales
 *
 */
public class BlogType {

    private Integer id;
    private String typeName;
    private String orderNum;

    private Integer blogCount; //这种类型的博客数量

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTypeName() {
        return typeName;
    }
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
    public String getOrderNum() {
        return orderNum;
    }
    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }
    public Integer getBlogCount() {
        return blogCount;
    }
    public void setBlogCount(Integer blogCount) {
        this.blogCount = blogCount;
    }

}
