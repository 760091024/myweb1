package com.service.impl;

import com.entity.Dept;
import com.service.*;
import java.util.*;
import com.dao.*;
import com.service.*;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@MapperScan(basePackages = "com.dao")
@Service("DeptService")//可以不写名字，无重复即可
public class DeptService implements IDeptService{

    @Autowired
   private IDeptDao dao;


    @Override
    public List<Dept> selectAll() {
        return dao.selectAll();
    }

    @Override
    public Dept selectByPrimaryKey(Integer deptno) {
        return dao.selectByPrimaryKey(deptno);
    }

    @Override
    public int deleteByPrimaryKey(Integer deptno) {
        return dao.deleteByPrimaryKey(deptno);
    }

    @Override
    public int insert(Dept dept) {
        return dao.insert(dept);
    }

    @Override
    public int updateByPrimaryKey(Integer deptno) {
        return dao.updateByPrimaryKey(deptno);
    }
}
