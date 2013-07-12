<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ include file="common/header.jsp" %>

	<div class="link">
		<h2>Update User</h2>
		<c:if test="${saved == 'success'}">
			<p class="success">User Updated Successfully</p>
		</c:if>
		<form:form modelAttribute="user" action="/aplikacja/update" method="post">
			<form:label path="userName">User Name</form:label><form:input path="userName" />
			<form:label path="imie">Imię</form:label><form:input path="imie" />
			<form:label path="lastName">Last Name</form:label><form:input path="lastName" />
			<form:label path="password">Password</form:label><form:password  path="password" />
			<button type="submit" id="save">Update User</button> <a href="/aplikacja/">Go Home</a>
		</form:form>
	</div>


<%@ include file="common/footer.jsp" %>
