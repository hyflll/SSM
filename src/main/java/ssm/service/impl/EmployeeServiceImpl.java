package ssm.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ssm.mapper.EmpMapper;
import ssm.pojo.Emp;
import ssm.service.EmployeeService;

import java.util.List;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmpMapper empMapper;
    @Override
    public List<Emp> selectByExample() {
        return empMapper.selectByExample(null);
    }

    @Override
    public PageInfo<Emp> getEmployeePage(Integer pageNum) {
        //开启分页功能
        PageHelper.startPage(pageNum,4);
        //查询所有员工信息
        List<Emp> list = empMapper.selectByExample(null);
        //获取分页相关数据
        PageInfo<Emp> page = new PageInfo<Emp>(list,5);
        return page;
    }
}
