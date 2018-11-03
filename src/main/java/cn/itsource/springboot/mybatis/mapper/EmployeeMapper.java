package cn.itsource.springboot.mybatis.mapper;

import cn.itsource.springboot.mybatis.domain.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface EmployeeMapper extends BaseMapper<Employee> {
}
