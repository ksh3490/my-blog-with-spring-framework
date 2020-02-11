package com.ksh3490.myblog;

import java.util.List;

import javax.inject.Inject;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ksh3490.myblog.board.dao.BoardDAO;
import com.ksh3490.myblog.board.model.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
	"classpath:spring/root-context.xml",
	"classpath:spring/dataSource-context.xml"
	})
public class BoardDAOTest {
	private static final Logger logger = LoggerFactory.getLogger(BoardDAOTest.class);
	
	@Inject
	private BoardDAO boardDAO;
	
	@Test
	public void testGetBoardList() throws Exception{
		List<BoardVO> boardList = boardDAO.getBoardList();
		logger.info("\n Board List \n ");
		if(boardList.size() > 0) {
			for(BoardVO list : boardList) {
				logger.info(list.title);
			}
		}else {
			logger.info("데이터가 없습니다.");
		}
	}
	
	@Test @Ignore
	public void testGetBoardContent() throws Exception{
		BoardVO boardVO = boardDAO.getBoardContent(1);
		logger.info("\n Board List \n ");
		if(boardVO != null) {
			logger.info("글번호" + boardVO.getBid());
			logger.info("글제목" + boardVO.getTitle());
			logger.info("글내용" + boardVO.getContent());
			logger.info("글태그" + boardVO.getTag());
			logger.info("조회수" + boardVO.getView_cnt());
			logger.info("작성자" + boardVO.getReg_id());
			logger.info("작성일" + boardVO.getReg_dt());
			logger.info("수정일" + boardVO.getEdit_dt());
		}else {
			logger.info("데이터가 없습니다.");
		}
	}
	
}
