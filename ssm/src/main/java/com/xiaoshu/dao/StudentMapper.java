package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.StudentExample;
import com.xiaoshu.entity.StudentVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StudentMapper extends BaseMapper<Student> {

	List<StudentVo> findList(StudentVo studentVo);
   }