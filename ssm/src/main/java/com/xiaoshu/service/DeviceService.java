package com.xiaoshu.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.xiaoshu.dao.DeviceMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Device;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class DeviceService {


	@Autowired
	DeviceMapper deviceMapper;



	public PageInfo<Device> findPage(Device device, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);
		List<Device> list=deviceMapper.findList(device);
		return new PageInfo<Device>(list);
	}



	public void deletDevice(int id) {
		// TODO Auto-generated method stub
		deviceMapper.deleteByPrimaryKey(id);
	}






	public Device findByName(String deviceName) {
		// TODO Auto-generated method stub
		Device pram=new Device();
		pram.setDeviceName(deviceName);
		
		return deviceMapper.selectOne(pram);
	}



	public void updateDevice(Device device) {
		// TODO Auto-generated method stub
		device.setCreatetime(new Date());
		deviceMapper.updateByPrimaryKeySelective(device);
	}



	public void addDevice(Device device) {
		// TODO Auto-generated method stub
		device.setCreatetime(new Date());
		deviceMapper.insert(device);
	}


}
