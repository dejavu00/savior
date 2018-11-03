package cn.itsource.springboot.mybatis.mapper;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T> {
    void saveOne(T t);
    void deleteOneById(Serializable id);
    void updateOne(T t);
    T loadOneById(Serializable id);
    List<T> LoadAll();
}
