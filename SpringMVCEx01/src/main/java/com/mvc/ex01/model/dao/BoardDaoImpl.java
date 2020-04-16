package com.mvc.ex01.model.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvc.ex01.model.dto.BoardDto;

@Repository	//exception을 하나의 exception으로 바꿔주기 때문에 try/catch시 편리하게 사용할 수 있어서 @component가 아닌 repository를 사용한다. 
public class BoardDaoImpl implements BoardDao {
	
	@Autowired
	private SqlSessionTemplate sqlsession;

	@Override
	public List<BoardDto> selectList() {
		
		List<BoardDto> list = new ArrayList<BoardDto>();
		
		try {
			list = sqlsession.selectList(NAMESPACE+"selectList");
		} catch (Exception e) {
			System.out.println("[error] : selectList");
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public BoardDto selectOne(int myno) {
		
		return null;
	}

	@Override
	public int insert(BoardDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(BoardDto dto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int myno) {
		// TODO Auto-generated method stub
		return 0;
	}

}
