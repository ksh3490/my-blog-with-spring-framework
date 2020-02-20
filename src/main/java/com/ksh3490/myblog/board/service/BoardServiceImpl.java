package com.ksh3490.myblog.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.ksh3490.myblog.board.dao.BoardDAO;
import com.ksh3490.myblog.board.model.BoardVO;
import com.ksh3490.myblog.error.controller.NotFoundException;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO boardDAO;
	
	public List<BoardVO> getBoardList() throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.getBoardList();
	}

	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.insertBoard(boardVO);
	}

	@Override
	public BoardVO getBoardContent(int bid) throws Exception {
		// TODO Auto-generated method stub
		BoardVO boardVO = new BoardVO();
		boardDAO.updateViewCnt(bid);
		// return boardDAO.getBoardContent(bid);
		
		// To test exception handle
		try {
			boardVO.setBid(bid);
			boardVO.setCate_cd("1111111111111111111111111111111111111");
			boardDAO.updateBoard(boardVO);
		}catch(RuntimeException e){
			throw new NotFoundException();
		}
		return boardVO;
		// To test exception handle
	}

	@Override
	public void updateBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.updateBoard(boardVO);
		
	}

	@Override
	public void deleteBoard(int bid) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.deleteBoard(bid);
	}

}
