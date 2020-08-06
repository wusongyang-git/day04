package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "content_category")
public class Catejory implements Serializable {
    @Id
    @Column(name = "content_Category_Id")
    private Integer contentCategoryId;

    @Column(name = "category_name")
    private String categoryName;

    private String status;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    /**
     * @return content_Category_Id
     */
    public Integer getContentCategoryId() {
        return contentCategoryId;
    }

    /**
     * @param contentCategoryId
     */
    public void setContentCategoryId(Integer contentCategoryId) {
        this.contentCategoryId = contentCategoryId;
    }

    /**
     * @return category_name
     */
    public String getCategoryName() {
        return categoryName;
    }

    /**
     * @param categoryName
     */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    /**
     * @return status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * @return createtime
     */
    public Date getCreatetime() {
        return createtime;
    }

    /**
     * @param createtime
     */
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", contentCategoryId=").append(contentCategoryId);
        sb.append(", categoryName=").append(categoryName);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}