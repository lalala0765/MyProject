<%@ page contentType="text/html; charset=UTF-8"%>
<html>
<head>
<title>게시글 쓰기</title>
</head>
<body>
	게시글 쓰기 입력 폼 :
	<form method="post">
		<input type="hidden" name="parentId" value="abcd" /> <!-- 파라미터라서 String타입으로 들어온다. -->
		제목 : <input type="text" name="title" /><br />
		내용 :
		<textarea name="content"></textarea>
		<br /> <input type="submit" />
	</form>
</body> 
</html>