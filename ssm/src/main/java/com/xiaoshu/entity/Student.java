package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;

@Table(name = "stu_tb")
public class Student implements Serializable {
    @Id
    @Column(name = "s_id")
    private Integer sId;

    @Column(name = "s_name")
    private String sName;

    @Column(name = "s_sex")
    private String sSex;

    @Column(name = "s_hobby")
    private String sHobby;
    @DateTimeFormat(pattern="yyyy-MM-dd")
    @Column(name = "s_birth")
    private Date sBirth;

    @Column(name = "m_id")
    private Integer mId;

    private static final long serialVersionUID = 1L;

    /**
     * @return s_id
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * @param sId
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * @return s_name
     */
    public String getsName() {
        return sName;
    }

    /**
     * @param sName
     */
    public void setsName(String sName) {
        this.sName = sName == null ? null : sName.trim();
    }

    /**
     * @return s_sex
     */
    public String getsSex() {
        return sSex;
    }

    /**
     * @param sSex
     */
    public void setsSex(String sSex) {
        this.sSex = sSex == null ? null : sSex.trim();
    }

    /**
     * @return s_hobby
     */
    public String getsHobby() {
        return sHobby;
    }

    /**
     * @param sHobby
     */
    public void setsHobby(String sHobby) {
        this.sHobby = sHobby == null ? null : sHobby.trim();
    }

    /**
     * @return s_birth
     */
    public Date getsBirth() {
        return sBirth;
    }

    /**
     * @param sBirth
     */
    public void setsBirth(Date sBirth) {
        this.sBirth = sBirth;
    }

    /**
     * @return m_id
     */
    public Integer getmId() {
        return mId;
    }

    /**
     * @param mId
     */
    public void setmId(Integer mId) {
        this.mId = mId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", sId=").append(sId);
        sb.append(", sName=").append(sName);
        sb.append(", sSex=").append(sSex);
        sb.append(", sHobby=").append(sHobby);
        sb.append(", sBirth=").append(sBirth);
        sb.append(", mId=").append(mId);
        sb.append("]");
        return sb.toString();
    }
}