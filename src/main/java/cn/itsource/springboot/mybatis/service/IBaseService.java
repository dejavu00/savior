package cn.itsource.springboot.mybatis.service;

import java.io.Serializable;
import java.util.List;

public interface IBaseService<T> {
    void saveOne(T t);
    void deleteOneById(Serializable id);
    void updateOne(T t);
    T loadOneById(Serializable id);
    List<T> LoadAll();
}
