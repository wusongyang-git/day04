package com.xiaoshu.dao;

import com.xiaoshu.base.dao.BaseMapper;
import com.xiaoshu.entity.Person;
import com.xiaoshu.entity.PersonExample;
import com.xiaoshu.entity.PersonVo;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PersonMapper extends BaseMapper<Person> {

	List<PersonVo> findList(PersonVo personVo);

    }