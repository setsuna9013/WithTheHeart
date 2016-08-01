<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>管理者ログイン</title>
</head>
<body>
    <div>
        <s:form action="LoginAction">
            <table class="login">
                <tr>
                    <td><s:textfield label="名前" name="name" maxlength="16"
                        title="例：taro" placeholder="名前" required="required" /></td>
                </tr>
                <tr>
                    <td><s:password label="パスワード" name="password" maxlength="16"
                            pattern="^([a-zA-Z0-9]{4,16})$" title="半角英数字4文字から16文字を使用してください。"
                            placeholder="パスワード" required="required" /></td>
                </tr>
            </table>
            <br>
            <input type="submit" class="button" value="ログイン" />
        </s:form>
    </div>

</body>
</html>