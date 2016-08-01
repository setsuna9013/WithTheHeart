package setsuna9013.withtheheart.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import setsuna9013.withtheheart.dto.LoginDTO;
import setsuna9013.withtheheart.util.DBConnector;

/**
 * LoginDAO DBに接続しユーザー情報を取得するためのクラス
 *
 * @author YUYA TAKAHASHI
 * @version 1.0
 * @since 2016/07/11
 */
public class LoginDAO {

    /**
     * レスポンス
     */
    private boolean res;

    /**
     * PrepareStatement
     */
    private PreparedStatement ps;

    /**
     * ResultSet
     */
    private ResultSet rs;

    /**
     * LoginのDTO
     */
    private LoginDTO loginDto = new LoginDTO();

	/**
     * 入力された情報とDBのユーザー情報にある情報を照合し情報を取得するメソッド
     *
     * @author YUYA TAKAHASHI
     * @since 2016/07/11
     * @param password パスワード
     * @param email メールアドレス
     * @return result 結果
     * @throws Exception 例外処理
     */
    public boolean check(String name, String password) throws Exception {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		res=false;

        String sql = "SELECT * FROM admin WHERE name = ? AND password = ?";
        ps = con.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, password);
        rs = ps.executeQuery();
       while (rs.next()) {
            res = true;
            loginDto.setName(rs.getString("name"));
            loginDto.setPassword(rs.getString("password"));
                   }

        con.close();
        return res;
            }

    /**
     * LoginDTOを取得するメソッド
     * @author YUYA TAKAHASHI
     * @since 2016/07/11
     * @return logindto
     */
    public LoginDTO getLoginDto() {
        return loginDto;
    }

    /**
     * LoginDTOに格納するメソッド
     *
     * @author YUYA TAKAHASHI
     * @since 2016/07/11
     * @return logindto
     */
    public void setLogindto(LoginDTO loginDto) {
        this.loginDto=loginDto;
    }
}