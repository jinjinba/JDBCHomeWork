package hairshop.model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import hairshop.model.vo.HairShop;

public class HairShopDAO {
	private final String URL = "jdbc:oracle:thin:@localhost:1521:XE";
	private final String USER = "HW";
	private final String PASSWORD = "HW";
	private final String DRIVER_NAME = "oracle.jdbc.driver.OracleDriver";
	
	/**
	 * 회원가입
	 * @param hairshop
	 * @return
	 */
	public int insertHairShop(HairShop hairshop) {
		String sql = "INSERT INTO HAIRSHOP_GUEST VALUES(?,?,?,?,?,?,?,?,DEFAULT)";
		int result = 0;
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, hairshop.getGuestId());
			pstmt.setString(1, hairshop.getGuestPwd());
			pstmt.setString(1, hairshop.getGuestName());
			pstmt.setString(1, hairshop.getGuestGender());
			pstmt.setInt(1, hairshop.getGuestAge());
			pstmt.setString(1, hairshop.getGuestEmail());
			pstmt.setString(1, hairshop.getGuestPhone());
			pstmt.setString(1, hairshop.getGuestAddress());
			result = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int checkLogin(HairShop hairShop) {
		int result = 0;
		String query = "SELECT COUNT(*) AS H_COUNT FROM HAIRSHOP_GUEST WHERE GUEST_ID = ? AND GUEST_PWD = ?";
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement pstmt = conn.prepareStatement(query);
			pstmt.setString(1, hairShop.getGuestId());
			pstmt.setString(2, hairShop.getGuestPwd());
			ResultSet rset = pstmt.executeQuery();
			if(rset.next()) {
				result = rset.getInt("H_COUNT");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	/**
	 * 회원 전체 조회
	 * @return
	 */
	public List<HairShop> selectAll() {
		String sql = "SELECT * FROM HAIRSHOP_GUEST";
		HairShop hairshop = null;
		List<HairShop> hList = null;
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			Statement stmt = conn.createStatement();
			ResultSet rset = stmt.executeQuery(sql);
			hList = new ArrayList<HairShop>();
			while(rset.next()) {
				hairshop = new HairShop();
				hairshop.setGuestId(rset.getString("GUEST_ID"));
				hairshop.setGuestPwd(rset.getString("GUEST_PWD"));
				hairshop.setGuestName(rset.getString("GUEST_NAME"));
				hairshop.setGuestGender(rset.getString("GUEST_GENDER"));
				hairshop.setGuestAge(rset.getInt("GUEST_AGE"));
				hairshop.setGuestEmail(rset.getString("GUEST_EMAIL"));
				hairshop.setGuestPhone(rset.getString("GUEST_PHONE"));
				hairshop.setGuestAddress(rset.getString("GUEST_ADDRESS"));
				hairshop.setGuestDate(rset.getTimestamp("GUEST_DATE"));
				
				hList.add(hairshop);
			}
			conn.close();
			stmt.close();
			rset.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return hList;
	}
	
	/**
	 * 회원 탈퇴
	 * @param guestId
	 * @return
	 */
	public int deleteHairShop(String guestId) {
		String sql = "DELETE FROM HAIRSHOP_GUEST WHERE GUEST_ID = ?";
		int result = 0;
		try {
			Class.forName(DRIVER_NAME);
			Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, guestId);
			result = pstmt.executeUpdate();
			pstmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}
	
	
	
}













