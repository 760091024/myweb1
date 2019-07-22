package com.service;
import java.util.*;
import com.entity.*;

public interface IEmpService {

    List<Emp> selectAll();
    Emp selectByPrimaryKey(Integer empno);
    int deleteByPrimaryKey(Integer empno);
    int insert(Emp emp);
    int updateByPrimaryKey(Integer empno);
}
