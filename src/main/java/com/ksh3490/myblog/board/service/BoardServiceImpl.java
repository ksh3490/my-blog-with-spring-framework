package com.ksh3490.myblog.board.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.ksh3490.myblog.board.dao.BoardDAO;
import com.ksh3490.myblog.board.model.BoardVO;
import com.ksh3490.myblog.common.Pagination;
import com.ksh3490.myblog.error.controller.NotFoundException;

@Service
public class BoardServiceImpl implements BoardService {
	
	@Inject
	private BoardDAO boardDAO;
	
	public List<BoardVO> getBoardList(Pagination pagination) throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.getBoardList(pagination);
	}

	@Override
	public void insertBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		boardDAO.insertBoard(boardVO);
	}
	
	
	@Transactional
	@Override
	public BoardVO getBoardContent(int bid) throws Exception {
		// TODO Auto-generated method stub
		BoardVO boardVO = new BoardVO();
		boardDAO.updateViewCnt(bid);
		boardVO = boardDAO.getBoardContent(bid);
		
		return boardVO;

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

	@Override
	public int getBoardListCnt() throws Exception {
		// TODO Auto-generated method stub
		return boardDAO.getBoardListCnt();
	}

}
