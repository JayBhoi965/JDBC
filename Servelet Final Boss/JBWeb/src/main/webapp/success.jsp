<%@ include file="Header.jsp"%>

<%



%>

<div class="mainBody">

	<form action="login" method="post" class="login_cont">
		<div id="header_tbl">Log-in</div>
		<table class="login_Table">

			<tr>
				<td>Username</td>
				<td><input required class="user_pw" type="text" name="username"
					id="username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input required class="user_pw" type="password"
					name="password" id="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input id="submit_btn" value="Log-in" type="submit">
				</td>
			</tr>
		</table>
	</form>

</div>


<%@ include file="Footer.jsp"%>