<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/modal.css">
<script src="js/jquery.leanModal.min.js"></script>
<title>ヘッダー</title>
</head>
<body>
<div class="header">
<a href="top.jsp">HOME</a>
<a href="reservation.jsp">空き時間確認</a>
<a href="<s:url action="ReservationSelectAction"/>">空き時間確認</a>
</div>
</body>
</html>