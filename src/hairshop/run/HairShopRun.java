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
			// �̿�� ȸ������
			hairShop = hView.inputHairShop();
			result = hCon.registerHairShop(hairShop);
			if (result > 0) {
				//���� �޼���!
				hView.displaySuccess("ȸ�������� �Ϸ�Ǿ����ϴ�.");
			}else {
				hView.displayError("���� �����Ͽ����ϴ�.");
			}
			break;
		case 2:
			// �̿�� �α���
			hairShop = hView.inputLoginInfo();
			result = hCon.checkInfo(hairShop);
			if(result > 0) {
				//�α��� ����
				hView.displaySuccess("�α��� ����");
			}else {
				hView.displayError("��ġ�ϴ� ������ �������� �ʽ��ϴ�.");
			}
			break;
		case 3:
			// �̿�� ���� 
			
			break;
		case 4:
			// ���� ���

			break;
		case 5:
			// ȸ�� Ż��
			guestId = hView.inputHairShopId("����");
			hCon.removeHairShop(guestId);
			if(result > 0) {
				hView.displaySuccess("ȸ��Ż�� ���� �ٽô� ��������");
			} else {
				hView.displayError("ȸ��Ż�� ����~");
			}
			break;
		case 6:
			// ȸ�� ��ȸ
			hList = hCon.printAll();
			if(!hList.isEmpty()) {
				hView.showAll(hList);
			}else {
				hView.displayError("�����Ͱ� �������� �ʽ��ϴ�.");
			}
			break;
		}
	}
	}
}
