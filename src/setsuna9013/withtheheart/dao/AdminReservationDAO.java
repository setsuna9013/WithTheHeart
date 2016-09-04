package setsuna9013.withtheheart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import setsuna9013.withtheheart.dto.ReservationDTO;
import setsuna9013.withtheheart.util.DBConnector;


public class AdminReservationDAO {

	private ReservationDTO reservationDto = new ReservationDTO();


	public int update(boolean stock ,int userId) {
        int result = 0;
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql = "update reservation set stock=? where id=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setBoolean(1,stock);
            ps.setInt(2, userId);
            result = ps.executeUpdate();
            reservationDto.setStock(stock);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

	public ReservationDTO getReservationDto() {
		return reservationDto;
	}

	public void setReservationDto(ReservationDTO reservationDto) {
		this.reservationDto = reservationDto;
	}


}
