package com.dao;

import java.util.*;
import com.entity.*;

public interface IDeptDao {

   List<Dept> selectAll();
    Dept selectByPrimaryKey(Integer deptno);
    int deleteByPrimaryKey(Integer deptno);
    int insert(Dept dept);
    int updateByPrimaryKey(Integer deptno);
}
