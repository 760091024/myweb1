package com.dao;

import java.util.*;
import com.entity.*;

public interface IEmpDao {
   List<Emp> selectAll();
    Emp selectByPrimaryKey(Integer empno);
    int deleteByPrimaryKey(Integer empno);
    int insert(Emp emp);
    int updateByPrimaryKey(Integer empno);


}
