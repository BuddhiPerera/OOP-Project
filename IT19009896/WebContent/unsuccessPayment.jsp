<!-
**
 * IT19009896
 * Perera K.B.N 
 *
 -->
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel='stylesheet' type='text/css' href='css/payment.css'>
<title>Unsuccessful Payment</title>
</head>
<body>
	<div class="headDiv">
		<table>
			<tr>
				<td class='logo'>
					<img src='images/logo.jpg' alt='logo-image'>
				</td>
				<td class='text'>
					<h2>Super Shine Motors</h2>
					<h3>The leading service station network <br> in Sri Lanka </h3>
				</td>
			</tr>
		</table>
	</div>
	<center>
	<div class="containerDiv">
		<form name= "unsuccessPay" method="post" action="enter.jsp">
			<h3> Unsuccessful Payment </h3>
			<p> Please try again later</p>
			<p> If the problem continues please contact us on our hot-lines: 011233455 / 0112443567
			<br> click back button to return home</p>
			<input type="button" class="buttons" value="Back">
		</form>
	</div>
	</center>
	<div class='foot'>
    	<footer>
        	<center>
            	<p>Call us : 011233455 / 0112443567 <br>
                Hotline open hours: week days 8.00 AM - 9.00 PM <br>
                e-mail : ssm@gmail.com</p>
       		</center>
    	</footer>
	</div>
</body>
</html>