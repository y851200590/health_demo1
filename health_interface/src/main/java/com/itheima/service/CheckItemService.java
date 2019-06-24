package com.itheima.service;
import com.itheima.entity.PageResult;
import com.itheima.pojo.CheckItem;


public interface CheckItemService {
    void add(CheckItem checkItem);

    PageResult pageQuery(Integer currentPage, Integer pageSize, String queryString);

    void delete(Integer id);

    CheckItem findByCheckItemId(Integer id);

    void update(CheckItem checkItem);
}
