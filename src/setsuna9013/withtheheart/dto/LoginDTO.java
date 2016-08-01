package setsuna9013.withtheheart.dto;

import java.util.Map;

/**
 * LoginDTO ユーザー情報を格納するクラス
 * @author YUYA TAKAHASHI
 * @version 1.0
 * @since 2016/07/11
 */
public class LoginDTO {

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * 名前
	 */
	private String name;

	/**
	 * セッション
	 */
	private Map<String,Object> session;

	/**
	 * 名前取得メソッド
	 * @author YUYA TAKAHASHI
	 * @since 2016/07/11
	 * @return name 名前
	 */
	public String getName() {
		return name;
	}
	/**
	 * 名前格納メソッド
	 * @author YUYA TAKAHASHI
	 * @since 2016/07/11
	 * @param name 名前
	 */

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * パスワードの取得メソッド
	 * @author YUYA TAKAHASHI
	 * @since 2016/07/11
	 * @return password パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワード格納メソッド
	 * @author YUYA TAKAHASHI
	 * @since 2016/07/11
	 * @param password パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * セッション取得メソッド
	 * @author YUYA TAKAHASHI
	 * @since 2016/07/11
	 * @return session セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納メソッド
	 * @author YUYA TAKAHASHI
	 * @since 2016/07/11
	 * @param session セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}