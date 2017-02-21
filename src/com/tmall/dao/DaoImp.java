package com.tmall.dao;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.tmall.bean.Ibatis;
/**
 * Created by Hacker on 2017/2/15.
 */
public class DaoImp extends SqlMapClientDaoSupport implements Dao {

    public void delete(String id) {
        getSqlMapClientTemplate().delete("deleteUsers", id);
    }

    public Ibatis getById(String id) {
        return (Ibatis)getSqlMapClientTemplate().queryForObject("getUsersById",id);
    }

    public Ibatis getByName(String name) {

        return (Ibatis)getSqlMapClientTemplate().queryForObject("getUsersByName",name);
    }

    @SuppressWarnings("unchecked")
    public List<Ibatis> getList() {
        return getSqlMapClientTemplate().queryForList("getAllUsers",null);
    }

    public void insert(Ibatis ibatis) {
        getSqlMapClientTemplate().insert("insertUsers",ibatis);
    }

    public void update(Ibatis ibatis) {
        getSqlMapClientTemplate().update("updateUsers", ibatis);
    }

}
