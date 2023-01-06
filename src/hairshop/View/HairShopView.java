package hairshop.View;

import java.util.List;
import java.util.Scanner;

import hairshop.model.vo.HairShop;

public class HairShopView {
	/**
	 * �޴�
	 * @return
	 */
	public int mainMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === === ��̿�ǿ� ���Ű� ȯ���մϴ�. === === ===");
		System.out.println("1. �̿�� ȸ������");     	
		System.out.println("2. �̿�� �α���");	
		System.out.println("3. �̿�� ����");	
		System.out.println("4. �̿�� ���� ���");				
		System.out.println("5. �̿�� ȸ�� Ż��");
		System.out.println("6. �̿�� ȸ�� ��ȸ");
		System.out.println("0. ����");
		System.out.print("�޴� ���� : ");
		int choice = sc.nextInt();
		return choice;
	}
	/**
	 * ȸ�� ����
	 * @return
	 */
	public HairShop inputHairShop() {
		Scanner sc = new Scanner(System.in);
		System.out.println("=== === === ȸ������ ���� �Է� === === ===");
		System.out.print("���̵� : ");
		String guestId = sc.next();
		System.out.print("��й�ȣ : ");
		String guestPwd = sc.next();
		System.out.print("�̸� : ");
		String guestName = sc.next();
		System.out.print("���� : ");
		String guestGender = sc.next();
		System.out.print("���� : ");
		int guestAge = sc.nextInt();
		System.out.print("�̸��� : ");
		String guestEmail = sc.next();
		System.out.print("��ȭ��ȣ : ");
		sc.nextLine();
		String guestPhone = sc.nextLine();
		System.out.print("�ּ� : ");
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
		System.out.println("=== === �α��� === ===");
		System.out.print("���̵� : ");
		String guestId = sc.next();
		System.out.print("��й�ȣ : ");
		String guestPwd = sc.next();
		HairShop hairShop = new HairShop();
		hairShop.setGuestId(guestId);
		hairShop.setGuestPwd(guestPwd);
		return hairShop;
	}
	
	public String inputHairShopId(String category) {
		Scanner sc = new Scanner(System.in);
		System.out.print(category + "�� ���̵� �Է� : ");
		String hId = sc.next();
		return hId;
	}
	
	/**
	 * ��ü ȸ�� ��ȸ
	 * @param hList
	 */
	public void showAll(List<HairShop> hList) {
		System.out.println("=== === === ��ü ȸ�� ��ȸ ��� === === ===");
		for(HairShop hOne : hList) {
			System.out.print("���̵� : " + hOne.getGuestId());
			System.out.print(", ��й�ȣ : " + hOne.getGuestPwd());
			System.out.print(", �̸� : " + hOne.getGuestName());
			System.out.print(", ���� : " + hOne.getGuestGender());
			System.out.print(", ���� : " + hOne.getGuestAge());
			System.out.print(", �̸��� : " + hOne.getGuestEmail());
			System.out.print(", ��ȭ��ȣ : " + hOne.getGuestPhone());
			System.out.println(", �� �ּ� : " + hOne.getGuestAddress());
			
		}
	}

	
	
	public void displaySuccess(String massage) {
		System.out.println(massage);
	}
	
	public void displayError(String message) {
		System.out.println("[��ȸ ����] : " + message);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
