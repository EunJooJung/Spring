package com.mvc.ex01.model.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvc.ex01.model.dao.BoardDao;
import com.mvc.ex01.model.dao.BoardDaoImpl;
import com.mvc.ex01.model.dto.BoardDto;

@Service
public class BoardBizImpl implements BoardBiz {
	
	@Autowired
	private BoardDao dao = new BoardDaoImpl();

	@Override
	public List<BoardDto> selectList() {
		
		return dao.selectList();
	}

	@Override
	public BoardDto selectOne(int myno) {
		// TODO Auto-generated method stub
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
