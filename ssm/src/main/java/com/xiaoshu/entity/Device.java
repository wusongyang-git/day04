package com.xiaoshu.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_device")
public class Device implements Serializable {
    @Id
    @Column(name = "deviceId")
    private Integer deviceid;

    @Column(name = "device_type")
    private String deviceType;

    @Column(name = "device_name")
    private String deviceName;

    @Column(name = "device_ram")
    private String deviceRam;

    private String color;

    private Integer price;

    private String status;

    private Date createtime;

    private static final long serialVersionUID = 1L;

    /**
     * @return deviceId
     */
    public Integer getDeviceid() {
        return deviceid;
    }

    /**
     * @param deviceid
     */
    public void setDeviceid(Integer deviceid) {
        this.deviceid = deviceid;
    }

    /**
     * @return device_type
     */
    public String getDeviceType() {
        return deviceType;
    }

    /**
     * @param deviceType
     */
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType == null ? null : deviceType.trim();
    }

    /**
     * @return device_name
     */
    public String getDeviceName() {
        return deviceName;
    }

    /**
     * @param deviceName
     */
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName == null ? null : deviceName.trim();
    }

    /**
     * @return device_ram
     */
    public String getDeviceRam() {
        return deviceRam;
    }

    /**
     * @param deviceRam
     */
    public void setDeviceRam(String deviceRam) {
        this.deviceRam = deviceRam == null ? null : deviceRam.trim();
    }

    /**
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color
     */
    public void setColor(String color) {
        this.color = color == null ? null : color.trim();
    }

    /**
     * @return price
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Integer price) {
        this.price = price;
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
        sb.append(", deviceid=").append(deviceid);
        sb.append(", deviceType=").append(deviceType);
        sb.append(", deviceName=").append(deviceName);
        sb.append(", deviceRam=").append(deviceRam);
        sb.append(", color=").append(color);
        sb.append(", price=").append(price);
        sb.append(", status=").append(status);
        sb.append(", createtime=").append(createtime);
        sb.append("]");
        return sb.toString();
    }
}