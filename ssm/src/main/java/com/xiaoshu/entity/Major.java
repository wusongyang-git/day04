package com.xiaoshu.entity;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "major_tb")
public class Major implements Serializable {
    @Id
    @Column(name = "m_id")
    private Integer mId;

    @Column(name = "m_name")
    private String mName;

    private static final long serialVersionUID = 1L;

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

    /**
     * @return m_name
     */
    public String getmName() {
        return mName;
    }

    /**
     * @param mName
     */
    public void setmName(String mName) {
        this.mName = mName == null ? null : mName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", mId=").append(mId);
        sb.append(", mName=").append(mName);
        sb.append("]");
        return sb.toString();
    }
}