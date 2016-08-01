<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>予約フォーム</title>
</head>
<body>
	<s:iterator value="list">
		<table id="reservation">
			<tr class="thead">
				<th>予約時間</th>
				<th>承認</th>
			</tr>
			<tr>
				<td><s:property value="daytime"></s:property></td>
				<td><s:submit name="stock" type="button" value="承認"/></td>
			</tr>
		</table>
	</s:iterator>

</body>
</html>