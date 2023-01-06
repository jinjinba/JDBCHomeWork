package hairshop.model.vo;

import java.sql.Timestamp;

public class HairShop {

	private String guestId;
	private String guestName;
	private String guestPwd;
	private String guestGender;
	private int guestAge;
	private String guestEmail;
	private String guestPhone;
	private String guestAddress;
	private Timestamp guestDate;
	
	public HairShop() {}

	public HairShop(String guestId, String guestName, String guestPwd, String guestGender, int guestAge,
			String guestEmail, String guestPhone, String guestAddress) {
		super();
		this.guestId = guestId;
		this.guestName = guestName;
		this.guestPwd = guestPwd;
		this.guestGender = guestGender;
		this.guestAge = guestAge;
		this.guestEmail = guestEmail;
		this.guestPhone = guestPhone;
		this.guestAddress = guestAddress;
		this.guestDate = guestDate;
	}

	public String getGuestId() {
		return guestId;
	}

	public void setGuestId(String guestId) {
		this.guestId = guestId;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public String getGuestPwd() {
		return guestPwd;
	}

	public void setGuestPwd(String guestPwd) {
		this.guestPwd = guestPwd;
	}

	public String getGuestGender() {
		return guestGender;
	}

	public void setGuestGender(String guestGender) {
		this.guestGender = guestGender;
	}

	public int getGuestAge() {
		return guestAge;
	}

	public void setGuestAge(int guestAge) {
		this.guestAge = guestAge;
	}

	public String getGuestEmail() {
		return guestEmail;
	}

	public void setGuestEmail(String guestEmail) {
		this.guestEmail = guestEmail;
	}

	public String getGuestPhone() {
		return guestPhone;
	}

	public void setGuestPhone(String guestPhone) {
		this.guestPhone = guestPhone;
	}

	public String getGuestAddress() {
		return guestAddress;
	}

	public void setGuestAddress(String guestAddress) {
		this.guestAddress = guestAddress;
	}

	public Timestamp getGuestDate() {
		return guestDate;
	}

	public void setGuestDate(Timestamp guestDate) {
		this.guestDate = guestDate;
	}

	@Override
	public String toString() {
		return "HairShop [guestId=" + guestId + ", guestName=" + guestName + ", guestPwd=" + guestPwd + ", guestGender="
				+ guestGender + ", guestAge=" + guestAge + ", guestEmail=" + guestEmail + ", guestPhone=" + guestPhone
				+ ", guestAddress=" + guestAddress + ", guestDate=" + guestDate + "]";
	} 
	
	
	
}
