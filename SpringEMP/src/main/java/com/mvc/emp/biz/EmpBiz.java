package com.mvc.emp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.emp.dao.EmpDao;
import com.mvc.emp.dto.EmpDto;

@Service
public class EmpBiz {
	
	@Autowired
	private EmpDao dao;
	
	public List<EmpDto> selectList(){
		
		return dao.selectList();
	}

}
