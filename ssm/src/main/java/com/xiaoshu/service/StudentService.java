package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.github.pagehelper.util.StringUtil;
import com.mysql.fabric.xmlrpc.base.Param;
import com.xiaoshu.dao.MajorMapper;
import com.xiaoshu.dao.StudentMapper;
import com.xiaoshu.dao.UserMapper;
import com.xiaoshu.entity.Major;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.StudentVo;
import com.xiaoshu.entity.User;
import com.xiaoshu.entity.UserExample;
import com.xiaoshu.entity.UserExample.Criteria;

@Service
public class StudentService {

	@Autowired
	UserMapper userMapper;
	@Autowired
	StudentMapper studentMapper;
	@Autowired
	MajorMapper majorMapper;

	public Object findMajor(Major major) {
		// TODO Auto-generated method stub
		
		return majorMapper.selectAll();
	}

	public PageInfo<StudentVo> findpage(StudentVo studentVo, Integer pageNum, Integer pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum,pageSize);
		List<StudentVo> list=studentMapper.findList(studentVo);
		return new PageInfo<StudentVo>(list);
	}



	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentMapper.deleteByPrimaryKey(id);
	}

	public Student findByName(String sName) {
		// TODO Auto-generated method stub
		Student pram=new Student();
		pram.setsName(sName);
 		
		return studentMapper.selectOne(pram);
	}

	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentMapper.updateByPrimaryKeySelective(student);
	}

	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		studentMapper.insert(student);
	}

	public List<StudentVo> findList(StudentVo studentVo) {
		// TODO Auto-generated method stub
		return studentMapper.findList(studentVo);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
