<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- css -->
<link rel="stylesheet" href="css/header.css">
<link rel="stylesheet" href="css/modal.css">
<script src="js/jquery.leanModal.min.js"></script>
<title>ヘッダー</title>
</head>
<body>
<div class="header">
<ul>
<li><a href="access.jsp">アクセス</a></li>
<li><a href="contact.jsp">お問い合わせ</a></li>
<li><a href="<s:url action="ReservationSelectAction"/>">空き状況</a></li>
<li><a href="top.jsp">スタジオ概要</a></li>
<li><a href="top.jsp">トップ</a></li>
</ul>
</div>
</body>
</html>