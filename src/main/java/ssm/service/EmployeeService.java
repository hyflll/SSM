package ssm.service;


import com.github.pagehelper.PageInfo;
import ssm.pojo.Emp;

import java.util.List;

public interface EmployeeService {
    List<Emp> selectByExample();

    PageInfo<Emp> getEmployeePage(Integer pageNum);
}
