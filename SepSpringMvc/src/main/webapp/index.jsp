<%@ page contentType="text/html; charset=UTF-8" %>

<html>

<body>
<a href="hello.do">hello.do</a><br />
<a href="article/newArticle.do">파라미터 값 저장하기</a><br />
<a href="order/order.do">list에 파라미터 값 저장하기</a> <br />
<a href="search/internal.do?query=abc&p=10">@RequestParam1</a> <br />
<a href="search/external.do">@RequestParam2</a> <br />
<a href="cookie/make.do">쿠키 생성</a>
<a href="cookie/view.do">쿠키 보기</a> <br />
<a href="header/check.do">헤더</a><br />
<a href="search/main.do">@ModelAttribute로 모델 생성</a>
</body>
</html>