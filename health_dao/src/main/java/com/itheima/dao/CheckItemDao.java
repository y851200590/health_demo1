package com.itheima.dao;

import com.github.pagehelper.Page;
import com.itheima.entity.PageResult;
import com.itheima.pojo.CheckItem;

public interface CheckItemDao {
   /**
    * 新增
    * @param checkItem
    */
   public void add(CheckItem checkItem);

   /**
    * 查询
    * @param queryString
    * @return
    */
   Page<CheckItem> selectByCondition(String queryString);

   void deleteById(Integer id);

   long findCountByCheckItemId(Integer id);

   CheckItem findByCheckItemId(Integer id);

   void update(CheckItem checkItem);
}
