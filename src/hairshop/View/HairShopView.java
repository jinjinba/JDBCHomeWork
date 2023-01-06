package hairshop.View;

import java.util.List;
import java.util.Scanner;

import hairshop.model.vo.HairShop;

public class HairShopView {
	/**
	 * 메뉴
	 * @return
	 */
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === === 기미용실에 오신걸 환영합니다. === === ===");
		System.out.println("1. 미용실 회원가입");     	
		System.out.println("2. 미용실 로그인");	
		System.out.println("3. 미용실 예약");	
		System.out.println("4. 미용실 예약 취소");				
		System.out.println("5. 미용실 회원 탈퇴");
		System.out.println("6. 미용실 회원 조회");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 : ");
		int choice = sc.nextInt();
		return choice;
	}
	/**
	 * 회원 가입
	 * @return
	 */
	public HairShop inputHairShop() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === === 회원가입 정보 입력 === === ===");
		System.out.print("아이디 : ");
		String guestId = sc.next();
		System.out.print("비밀번호 : ");
		String guestPwd = sc.next();
		System.out.print("이름 : ");
		String guestName = sc.next();
		System.out.print("성별 : ");
		String guestGender = sc.next();
		System.out.print("나이 : ");
		int guestAge = sc.nextInt();
		System.out.print("이메일 : ");
		String guestEmail = sc.next();
		System.out.print("전화번호 : ");
		sc.nextLine();
		String guestPhone = sc.nextLine();
		System.out.print("주소 : ");
		String guestAddress = sc.next();
		HairShop hairShop = 
				new HairShop(
						guestId
						, guestPwd
						, guestName
						, guestGender
						, guestAge
						, guestEmail
						, guestPhone
						, guestAddress);
		return hairShop;
	}
	
	public HairShop inputLoginInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === 로그인 === ===");
		System.out.print("아이디 : ");
		String guestId = sc.next();
		System.out.print("비밀번호 : ");
		String guestPwd = sc.next();
		HairShop hairShop = new HairShop();
		hairShop.setGuestId(guestId);
		hairShop.setGuestPwd(guestPwd);
		return hairShop;
	}
	
	public String inputHairShopId(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "할 아이디 입력 : ");
		String hId = sc.next();
		return hId;
	}
	
	/**
	 * 전체 회원 조회
	 * @param hList
	 */
	public void showAll(List<HairShop> hList) {
		System.out.println("=== === === 전체 회원 조회 결과 === === ===");
		for(HairShop hOne : hList) {
			System.out.print("아이디 : " + hOne.getGuestId());
			System.out.print(", 비밀번호 : " + hOne.getGuestPwd());
			System.out.print(", 이름 : " + hOne.getGuestName());
			System.out.print(", 성별 : " + hOne.getGuestGender());
			System.out.print(", 나이 : " + hOne.getGuestAge());
			System.out.print(", 이메일 : " + hOne.getGuestEmail());
			System.out.print(", 전화번호 : " + hOne.getGuestPhone());
			System.out.println(", 집 주소 : " + hOne.getGuestAddress());
			
		}
	}

	
	
	public void displaySuccess(String massage) {
		System.out.println(massage);
	}
	
	public void displayError(String message) {
		System.out.println("[조회 실패] : " + message);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
