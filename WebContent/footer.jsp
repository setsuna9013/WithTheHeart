<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- css -->
<link rel="stylesheet" href="css/footer.css">
<!-- モーダルのcss -->
<link rel="stylesheet" href="css/modal.css">
<!-- jQuery基本呼び出し -->
<script src="js/jquery-3.0.0.min.js"></script>
<!-- モーダルウィンドウのjQuery -->
<script src="js/jquery.leanModal.min.js"></script>
<script src="js/Modal.js"></script>
<title>フッター</title>
</head>
<body>
<div class="footer">
<a rel="leanModal" href="#div787">管理者ログイン</a>
</div>

    <div id="div787">
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