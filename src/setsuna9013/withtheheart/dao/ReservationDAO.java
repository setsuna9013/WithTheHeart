package setsuna9013.withtheheart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import setsuna9013.withtheheart.dto.ReservationDTO;
import setsuna9013.withtheheart.util.DBConnector;

public class ReservationDAO {
	/**
	 * ユーザー一覧情報を格納するリスト
	 */
	private ArrayList<ReservationDTO> list = new ArrayList<ReservationDTO>();

	/**
	 * 画面にユーザー情報一覧を表示させる為のメソッド
	 *
	 * @return result データベースからのユーザー一覧情報を格納できたか否か
	 * @throws SQLException
	 */
	public ArrayList<ReservationDTO> getList(){
		DBConnector db = new DBConnector();
		Connection conn = db.getConnection();
		String sql = "SELECT * FROM reservation WHERE stock LIKE 0";
		//String sql = "select * from user";//全て表示
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
            while(rs.next()) {
            	ReservationDTO dto = new ReservationDTO();
            	dto.setStock(rs.getInt("stock"));
            	dto.setDaytime(rs.getString("daytime"));
            	list.add(dto);
             }
         }catch (SQLException e) {
        	 e.printStackTrace();
         }finally{
        	 try{
        		 conn.close();
 	         }catch (SQLException e){
 	        	 e.printStackTrace();
 	         }
 	     }
         return list;
	}

	/**
	 * リストを取得する為のメソッド
	 *
	 * @return list
	 */
	public ArrayList<ReservationDTO> getUserSelect() {
		return list;
	}

	/**
	 * リストを格納する為のメソッド
	 *
	 * @param list
	 */
	public void setList(ArrayList<ReservationDTO> list) {
		this.list = list;
	}
}
