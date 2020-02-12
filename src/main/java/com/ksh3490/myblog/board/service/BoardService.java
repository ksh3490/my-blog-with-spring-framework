package com.ksh3490.myblog.board.service;

import java.util.List;

import com.ksh3490.myblog.board.model.BoardVO;

public interface BoardService {
	public List<BoardVO> getBoardList() throws Exception;
	
}
