<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
<title>게시글 쓰기</title>
</head>
<body>
	게시글 등록됨:<br>
	제목: ${command.title	}<br>
	내용: ${command.content } <!-- 어노테이션 안쓸 경우 newArticleCommand.content이런식으로 쓴다. -->
</body>
</html>