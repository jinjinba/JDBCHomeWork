package hairshop.run;

import java.util.List;

import hairshop.View.HairShopView;
import hairshop.controller.HairShopController;
import hairshop.model.dao.HairShopDAO;
import hairshop.model.vo.HairShop;

public class HairShopRun {
	public static void main(String[] args) {
		HairShopView hView = new HairShopView();
		HairShopController hCon = new HairShopController();
		HairShop hairShop = null;
		List<HairShop> hList = null;
		String guestId = "";
		String guestName = "";
		int result = 0;
		
		end:
		while (true) {
		int choice = hView.mainMenu();
		switch (choice) {
		case 0:
			break end;
		case 1:
			// 미용실 회원가입
			hairShop = hView.inputHairShop();
			result = hCon.registerHairShop(hairShop);
			if (result > 0) {
				//성공 메세지!
				hView.displaySuccess("회원가입이 완료되었습니다.");
			}else {
				hView.displayError("가입 실패하였습니다.");
			}
			break;
		case 2:
			// 미용실 로그인
			hairShop = hView.inputLoginInfo();
			result = hCon.checkInfo(hairShop);
			if(result > 0) {
				//로그인 성공
				hView.displaySuccess("로그인 성공");
			}else {
				hView.displayError("일치하는 정보가 존재하지 않습니다.");
			}
			break;
		case 3:
			// 미용실 예약 
			
			break;
		case 4:
			// 예약 취소

			break;
		case 5:
			// 회원 탈퇴
			guestId = hView.inputHairShopId("삭제");
			hCon.removeHairShop(guestId);
			if(result > 0) {
				hView.displaySuccess("회원탈퇴 성공 다시는 오지마라");
			} else {
				hView.displayError("회원탈퇴 실패~");
			}
			break;
		case 6:
			// 회원 조회
			hList = hCon.printAll();
			if(!hList.isEmpty()) {
				hView.showAll(hList);
			}else {
				hView.displayError("데이터가 존재하지 않습니다.");
			}
			break;
		}
	}
	}
}
