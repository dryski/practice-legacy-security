<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<body>
	<h1>회원가입</h1>
	<form action="/perform_register" method="POST" enctype="utf8">
		<div>
			아이디 : <input type="text" name="username" />
		</div>
		<div>
			비밀번호: <input type="password" name="password" />
		</div>
		<div>
			비밀번호확인: <input type="password" name="password-repeat" />
		</div>
		<div>
			이름 : <input type="text" name="name" />
		</div>
		<div>
			이메일: <input type="email" name="email" />
		</div>
		<button type="submit">submit</button>
	</form>
	<a href="/login">로그인하기</a>
</body>
</html>