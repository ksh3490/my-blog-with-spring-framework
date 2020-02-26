package com.ksh3490.myblog.board.dao;

import java.util.List;

import com.ksh3490.myblog.board.model.BoardVO;
import com.ksh3490.myblog.common.Pagination;

public interface BoardDAO {
	
	public List<BoardVO> getBoardList(Pagination pagination) throws Exception;
	public BoardVO getBoardContent(int bid) throws Exception;
	public int insertBoard(BoardVO boardVO) throws Exception;
	public int updateBoard(BoardVO boardVO) throws Exception;
	public int deleteBoard(int bid) throws Exception;
	public int updateViewCnt(int bid) throws Exception;
	public int getBoardListCnt() throws Exception;
	
	
}
