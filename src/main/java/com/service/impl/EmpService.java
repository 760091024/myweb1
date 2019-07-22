package com.service.impl;

import com.entity.Emp;
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
@Service("empService")
public class EmpService implements IEmpService{

    @Autowired
    private IEmpDao dao;

    @Override
    public List<Emp> selectAll() {
        return dao.selectAll();
    }

    @Override
    public Emp selectByPrimaryKey(Integer empno) {
        return dao.selectByPrimaryKey(empno);
    }

    @Override
    public int deleteByPrimaryKey(Integer empno) {
        return dao.deleteByPrimaryKey(empno);
    }

    @Override
    public int insert(Emp emp) {
        return insert(emp);
    }

    @Override
    public int updateByPrimaryKey(Integer empno) {
        return updateByPrimaryKey(empno);
    }
}
