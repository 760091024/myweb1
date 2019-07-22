package com.action;

import java.sql.Connection;
import java.util.*;
import com.service.*;
import com.entity.*;

import com.service.impl.SpringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class IndexController {

    @Value("${spring.datasource.url}")
    private String url;

    @Autowired
    private IDeptService ds;
    @Autowired
    private IEmpService es;
    @Autowired
    private SpringUtils utils;

    @RequestMapping("/Index")
    public ModelAndView Login(ModelAndView mvo, HttpServletRequest request){
        System.out.println("-----------INDEX");
        List<Dept> list = ds.selectAll();
        System.out.print("list ="+list);
        mvo.setViewName("index");
        return mvo;
    }

    @RequestMapping("/TestAction")
    public String TestAction(HttpServletRequest request, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("UTF-8");
        String content = request.getParameter("editorValue");
        System.out.println("editorValue=\n"+content);
        request.setAttribute("content", content);
        return "success";
    }

    @RequestMapping(value = "/testData")
    public String testData(){
        Connection con = utils.getConnection();
        System.out.println("con="+con);
        String sql = " select * from emp " ;
        return "success";
    }


}
