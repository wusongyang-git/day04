package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

public class Content implements Serializable {
    @Id
    @Column(name = "content_Id")
    private Integer contentId;

    @Column(name = "content_Category_Id")
    private Integer contentCategoryId;

    @Column(name = "content_title")
    private String contentTitle;

    @Column(name = "content_url")
    private String contentUrl;

    private String price;

    private String status;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    /**
     * @return content_Id
     */
    public Integer getContentId() {
        return contentId;
    }

    /**
     * @param contentId
     */
    public void setContentId(Integer contentId) {
        this.contentId = contentId;
    }

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
     * @return content_title
     */
    public String getContentTitle() {
        return contentTitle;
    }

    /**
     * @param contentTitle
     */
    public void setContentTitle(String contentTitle) {
        this.contentTitle = contentTitle == null ? null : contentTitle.trim();
    }

    /**
     * @return content_url
     */
    public String getContentUrl() {
        return contentUrl;
    }

    /**
     * @param contentUrl
     */
    public void setContentUrl(String contentUrl) {
        this.contentUrl = contentUrl == null ? null : contentUrl.trim();
    }

    /**
     * @return price
     */
    public String getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
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
        sb.append(", contentId=").append(contentId);
        sb.append(", contentCategoryId=").append(contentCategoryId);
        sb.append(", contentTitle=").append(contentTitle);
        sb.append(", contentUrl=").append(contentUrl);
        sb.append(", price=").append(price);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}