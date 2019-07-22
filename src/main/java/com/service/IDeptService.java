package com.service;

import java.util.*;
import com.entity.*;


public interface IDeptService {

    List<Dept> selectAll();
    Dept selectByPrimaryKey(Integer deptno);
    int deleteByPrimaryKey(Integer deptno);
    int insert(Dept dept);
    int updateByPrimaryKey(Integer deptno);
}
