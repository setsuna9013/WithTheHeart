package setsuna9013.withtheheart.dto;
//ユーザー情報一覧を格納の処理
public class ReservationDTO {

	private String daytime;

	private boolean stock;

	public String getDaytime() {
		return daytime;
	}

	public void setDaytime(String daytime) {
		this.daytime = daytime;
	}

	public boolean ltStock() {
		return stock;
	}

	public void setStock(boolean stock) {
		this.stock = stock;
	}


}