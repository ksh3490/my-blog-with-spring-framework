package com.ksh3490.myblog.board.dao;

import java.util.List;

import com.ksh3490.myblog.board.model.BoardVO;
import com.ksh3490.myblog.board.model.ReplyVO;
import com.ksh3490.myblog.common.Search;

public interface BoardDAO {
	
	public List<BoardVO> getBoardList(Search search) throws Exception;
	public BoardVO getBoardContent(int bid) throws Exception;
	public int insertBoard(BoardVO boardVO) throws Exception;
	public int updateBoard(BoardVO boardVO) throws Exception;
	public int deleteBoard(int bid) throws Exception;
	public int updateViewCnt(int bid) throws Exception;
	public int getBoardListCnt(Search search) throws Exception;
	
	// Reply DAO
	public List<ReplyVO> getReplyList(int bid) throws Exception;
	public int saveReply(ReplyVO replyVO) throws Exception;
	public int updateReply(ReplyVO replyVO) throws Exception;
	public int deleteReply(int rid) throws Exception;
	
}
