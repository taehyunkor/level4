<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>생산관리</title>
</head>
<body>
	<h2>생산관리 시스템</h2>
	<fieldset>
		<legend>생산관리 메인메뉴</legend>
		<input type="button" value="제품입력" id="input" />
		<input type="button" value="제품조회" id="read" />
		<input type="button" value="우선생산제품" id="fast" />
		<input type="button" value="이익순위" id="rank" />
		<input type="button" value="그룹별재고수량" id="group" />
	</fieldset>
</body>

<script>
	document.getElementById("input").addEventListener("click", function(){
		location.href="input";
	});
	
	document.getElementById("read").addEventListener("click", function(){
		location.href="search";
	});
	
	document.getElementById("fast").addEventListener("click", function(){
		location.href="fast";
	});
	
</script>

</html>



