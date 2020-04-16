package com.mvc.emp.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.emp.dto.EmpDto;

@Repository
public class EmpDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	String NAMESPACE = "empTable.";
	
	public List<EmpDto> selectList(){
		
		List<EmpDto> list = new ArrayList<EmpDto>();
		
		try {
			list = sqlSession.selectList(NAMESPACE+"selectList");
		} catch (Exception e) {
			System.out.println("[error] : emp selectList");
			e.printStackTrace();
		}
		
		return list;
	}

}
