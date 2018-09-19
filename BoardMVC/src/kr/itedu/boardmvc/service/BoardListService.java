package kr.itedu.boardmvc.service;

import static kr.itedu.boardmvc.common.DBConnector.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import kr.itedu.boardmvc.BoardVO;
import kr.itedu.boardmvc.common.BoardDAO;


public class BoardListService {
	public ArrayList<BoardVO> getBoardList(int btype){
		ArrayList<BoardVO> result = null;
		BoardDAO dao = BoardDAO.getInstance();
		result = dao.getBoardList(btype);
		
		for(BoardVO vo : result) {
			System.out.printf("bid : %d\n" , vo.getBid());
			System.out.printf("btitle : %s\n" , vo.getBtitle());
			System.out.printf("bcontent : %s\n" , vo.getBcontent());
			System.out.printf("bregdate : %s\n" , vo.getBregdate());
			System.out.println("--------------");
		}
		return result;
	}
}
