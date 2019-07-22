package com.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
//工具类，用来连接数据库拿值
@Component
public class SpringUtils implements ApplicationContextAware{

    private ApplicationContext applicationContext;
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException{
        this.applicationContext = applicationContext;

    }

    private DataSource getDataSource(){
        if(applicationContext != null){
            Object obj = applicationContext.getBean(DataSource.class);
            if(obj != null){
                return (DataSource)obj;
            }else{
                return null;
            }

        }else{
            return null;
        }
    }

    public Connection getConnection(){
        Connection con = null ;
        try{
            DataSource ds = getDataSource();
            if(ds != null){
                con = ds.getConnection();
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }

}
