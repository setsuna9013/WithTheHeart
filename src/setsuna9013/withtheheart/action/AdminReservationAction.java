package setsuna9013.withtheheart.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import setsuna9013.withtheheart.dao.AdminReservationDAO;

public class AdminReservationAction extends ActionSupport implements SessionAware {

	private String stock;

	public String execute(){

		AdminReservationDAO adres = new AdminReservationDAO();
		adres.stock(stock);
	}

	@Override
	public void setSession(Map<String, Object> arg0) {

	}

}
