package setsuna9013.withtheheart.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import setsuna9013.withtheheart.dao.LoginDAO;
import setsuna9013.withtheheart.dto.LoginDTO;

/**
 * LoginUserAction ログイン画面からログインする為のクラス
 * @author YUYA TAKAHASHI
 * @since 2016/07/11
 * @version 1.0
 */
public class LoginAction extends ActionSupport implements SessionAware {

	/**
	 * シリアルバージョンID
	 */
	private static final long serialVersionUID = -1205223782823928735L;

	/**
	 * メールアドレス
	 */
	private String name;

	/**
	 * パスワード
	 */
	private String password;

	/**
	 * 結果
	 */
	private String result;

	/**
	 * セッション
	 */
	private Map<String, Object> session;

	/**
	 * メールアドレスとパスワードの照合を行い、DBに登録済みのユーザー情報を引き出し取得してくる
	 * 同時に取得してきたユーザーIDのログインフラグをtrueにアップデートをかけるメソッド
	 * @author YUYA TAKAHASHI
	 * @since 2016/07/11
	 * @return result 結果 データベースと照合し、データが存在したらsuccess、それ以外の時はerrorを返します
	 */
	public String execute() {
		try {
result = ERROR;
			LoginDAO dao = new LoginDAO();
			LoginDTO dto = new LoginDTO();

			if (dao.check(name, password)) {
				dto = dao.getLoginDto();

				session.put("name", dto.getName());
				session.put("password", dto.getPassword());
				session.remove("loginError");

			} else {
				session.put("loginError", "メールアドレス(id)またはパスワードが間違っています");
				result = ERROR;
				return result;
			}
			result = SUCCESS;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	/**
	 * メールアドレスの取得メソッド
	 * @author YUYA TAKAHASHI
	 * @since 2016/07/11
	 * @return メールアドレス
	 */
	public String getName() {
		return name;
	}

	/**
	 * メールアドレスの格納メソッド
	 * @author YUYA TAKAHASHI
	 * @since 2016/07/11
	 * @param メールアドレス
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * パスワードの取得メソッド
	 * @author YUYA TAKAHASHI
	 * @since 2016/07/11
	 * @return パスワード
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * パスワードの格納メソッド
	 * @author YUYA TAKAHASHI
	 * @since 2016/07/11
	 * @param  パスワード
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * セッション取得メソッド
	 * @author YUYA TAKAHASHI
	 * @since 2016/07/11
	 * @return セッション
	 */
	public Map<String, Object> getSession() {
		return session;
	}

	/**
	 * セッション格納メソッド
	 * @author YUYA TAKAHASHI
	 * @since 2016/07/11
	 * @param セッション
	 */
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
