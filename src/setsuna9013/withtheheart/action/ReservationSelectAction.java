package setsuna9013.withtheheart.action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import setsuna9013.withtheheart.dao.ReservationDAO;
import setsuna9013.withtheheart.dto.ReservationDTO;

/**
 * GoReservationAction ブログ一覧へ遷移するためのクラス
 * @author RYO FURUSE
 * @version 1.0
 * @since 2016/07/19
 */
public class ReservationSelectAction extends ActionSupport{

    /**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -6738298908847610720L;

	/**
     * ブログ一覧
     */
    private ArrayList<ReservationDTO> list = new ArrayList<ReservationDTO>();

	/**
     * 実行メソッド
     * DAOにブログ一覧を渡してresultを返す
     * @author RYO FURUSE
     * @return result データが存在して値の取得に成功したらSUCCESS 失敗したらERROR
     */
    public String execute(){
        ReservationDAO dao = new ReservationDAO();
        list = dao.getList();
        return SUCCESS;
    }

    /**
     * 取得メソッド
     * ログインIDを取得
     * @author RYO FURUSE
     * @return loginId 取得するログインID
     */
    public ArrayList<ReservationDTO> getList() {
		return list;
	}

    /**
     * 格納メソッド
     * ログインIDをを格納
     * @author RYO FURUSE
     * @param loginId 格納するログインID
     */
	public void setList(ArrayList<ReservationDTO> list) {
		this.list = list;
	}
}
