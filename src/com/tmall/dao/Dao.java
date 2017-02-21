package com.tmall.dao;

import com.tmall.bean.Ibatis;

import java.util.List;

/**
 * Created by Hacker on 2017/2/15.
 */
public interface Dao {
    public List<Ibatis> getList();
    public Ibatis getByName(String name);
    public Ibatis getById(String id);
    public void insert(Ibatis ibatis);
    public void delete(String id);
    public void update(Ibatis ibatis);
}
