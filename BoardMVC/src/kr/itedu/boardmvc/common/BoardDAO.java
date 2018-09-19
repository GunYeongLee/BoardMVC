package kr.itedu.boardmvc.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.NamingException;

import kr.itedu.boardmvc.BoardVO;
import static kr.itedu.boardmvc.common.DBConnector.*;

public class BoardDAO {
	private static BoardDAO dao;

	private BoardDAO() {
	} // private 생성자

	public static BoardDAO getInstance() { // 싱글톤 패턴
		if (dao == null) {
			dao = new BoardDAO();
		}
		return dao;
	}

	public ArrayList<BoardVO> getBoardList(int btype) {
		ArrayList<BoardVO> result = new ArrayList<BoardVO>();
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = getConn();
			String query = String.format(" select bid, btitle " + " from c_table%d ORDER BY bid desc ", btype);
			ps = con.prepareStatement(query);
			rs = ps.executeQuery();
			while (rs.next()) {
				int bid = rs.getInt("bid");
				String btitle = rs.getString("btitle");

				BoardVO bv = new BoardVO();
				bv.setBid(bid);
				bv.setBtitle(btitle);
				result.add(bv);
			}
		} catch (SQLException e) {
			// TODO : 예외처리
		} catch (Exception e) {
			// TODO : 예외처리
		} finally {
			close(con, null, null);
		}

		return result;
	}

}