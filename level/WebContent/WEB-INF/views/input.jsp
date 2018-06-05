<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>생산관리 등록</title>
</head>
<body>
	<h2>생산관리 등록화면</h2>
	<p>생산관리 등록화면</p>
	<form method="post">
		제품코드 <input type="text" name="code"/><br />
		제품이름 <input type="text" name="pname"/><br />
		제품원가 <input type="text" name="cost"/><br />
		목표수량 <input type="text" name="pnum"/><br />
		재고수량 <input type="text" name="jnum"/><br />
		출고가 <input type="text" name="sale"/><br />
		그룹이름 <select name="gcode">
			<option value="A">컴퓨터</option>
			<option value="B">냉장고</option>
			<option value="C">냉장소모품</option>
		</select><br />
		<input type="submit" value="등록"/>
		<input type="button" value="메인화면" id="main"/>
	</form>
</body>
<script>
	document.getElementById("main").addEventListener("click", function(){
		location.href = "./";
	})
</script>
</html>





