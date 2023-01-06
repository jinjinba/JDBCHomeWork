package hairshop.controller;

import java.util.List;

import hairshop.model.dao.HairShopDAO;
import hairshop.model.vo.HairShop;

public class HairShopController {
	/**
	 * 회원 가입
	 * @param hairShop
	 * @return
	 */
	public int registerHairShop(HairShop hairShop) {
		HairShopDAO hDao = new HairShopDAO();
		int result = hDao.insertHairShop(hairShop);
		return result;
	}
	
	public int checkInfo(HairShop hairShop) {
		HairShopDAO hDao = new HairShopDAO();
		int result = hDao.checkLogin(hairShop);
		return result;
	}
	
	
	/**
	 * 회원탈퇴
	 * @param guestId
	 * @return
	 */
	public int removeHairShop(String guestId) {
		HairShopDAO hDao = new HairShopDAO();
		int result = hDao.deleteHairShop(guestId);
		return result;
	}
	
	
	/**
	 * 회원 전체 조회
	 * @return
	 */
	public List<HairShop> printAll() {
		HairShopDAO hDao = new HairShopDAO();
		List<HairShop> hList = hDao.selectAll();
		return hList;
	}
	
	
	
}
