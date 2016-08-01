package setsuna9013.withtheheart.dto;
//ユーザー情報一覧を格納の処理
public class ReservationDTO {

	/**
	 * パスワード
	 */
	private String daytime;

	public String getDaytime() {
		return daytime;
	}

	public void setDaytime(String daytime) {
		this.daytime = daytime;
	}

	private int stock;

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}


}