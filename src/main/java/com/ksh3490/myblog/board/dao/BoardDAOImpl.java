package com.ksh3490.myblog.board.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.ksh3490.myblog.board.model.BoardVO;
import com.ksh3490.myblog.board.model.ReplyVO;
import com.ksh3490.myblog.common.Search;

@Repository
public class BoardDAOImpl implements BoardDAO {
	
	@Inject
	private SqlSession sqlSession;

	@Override
	public List<BoardVO> getBoardList(Search search) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("com.ksh3490.myblog.board.boardMapper.getBoardList", search);
	}

	@Override
	public BoardVO getBoardContent(int bid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("com.ksh3490.myblog.board.boardMapper.getBoardContent", bid);
	}

	@Override
	public int insertBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("com.ksh3490.myblog.board.boardMapper.insertBoard", boardVO);
	}

	@Override
	public int updateBoard(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update("com.ksh3490.myblog.board.boardMapper.updateBoard", boardVO);
	}

	@Override
	public int deleteBoard(int bid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("com.ksh3490.myblog.board.boardMapper.deleteBoard", bid);
	}

	@Override
	public int updateViewCnt(int bid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update("com.ksh3490.myblog.board.boardMapper.updateViewCnt", bid);
	}

	@Override
	public int getBoardListCnt(Search search) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne("com.ksh3490.myblog.board.boardMapper.getBoardListCnt", search);
	}

	@Override
	public List<ReplyVO> getReplyList(int bid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList("com.ksh3490.myblog.board.replyMapper.getReplyList", bid);
	}

	@Override
	public int saveReply(ReplyVO replyVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert("com.ksh3490.myblog.board.replyMapper.saveReply", replyVO);
	}

	@Override
	public int updateReply(ReplyVO replyVO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update("com.ksh3490.myblog.board.replyMapper.updateReply", replyVO);
	}

	@Override
	public int deleteReply(int rid) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete("com.ksh3490.myblog.board.replyMapper.deleteReply", rid);
	}

}
