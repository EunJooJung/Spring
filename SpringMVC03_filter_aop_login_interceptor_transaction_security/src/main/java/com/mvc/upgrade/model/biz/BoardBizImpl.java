package com.mvc.upgrade.model.biz;

import java.util.List;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mvc.upgrade.model.dao.BoardDao;
import com.mvc.upgrade.model.dao.BoardDaoImpl;
import com.mvc.upgrade.model.dto.BoardDto;

@Service //service 객체 생성
public class BoardBizImpl implements BoardBiz {
	
	@Autowired
	private BoardDao dao;

	@Override
	public List<BoardDto> selectList() {
		// TODO Auto-generated method stub
		return dao.selectList();
	}

	@Override
	public BoardDto selectOne(int myno) {
		// TODO Auto-generated method stub
		return dao.selectOne(myno);
	}

	@Override
	public int insert(BoardDto dto) {
		// TODO Auto-generated method stub
		return dao.insert(dto);
	}

	@Override
	public int update(BoardDto dto) {
		// TODO Auto-generated method stub
		return dao.update(dto);
	}

	@Override
	public int delete(int myno) {
		// TODO Auto-generated method stub
		return dao.delete(myno);
	}
	
	@Transactional //최소한의 작업단위
	public String test() {
		
		dao.insert(new BoardDto(1000,"test","test","test",null));
		
		//exception
		String test = dao.test();
		int length = test.length();
		
		
		
		return test;
	}

}
