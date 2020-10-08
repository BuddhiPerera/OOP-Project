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
<title>Index</title>
<link rel='stylesheet' type='text/css' href='css/payment.css'>
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
		<div class='containerDiv'>
			<form method="post" action="paymentServlet">
				Customer ID:<br><input type="text" name="customerID" class="intText" required/>
				<br><br>
				Service Type:<br><input type="text" name="serviceType" class="intText" required/>
				<br><br>
				Price:<br><input type="text" name="price" class="intText" required/>
				<br><br>
				Reservation ID:<br><input type="text" name="reservID" class="intText" required/>
				<br><br>
				<input type="submit" name="send" value="Send Details" class="buttons"/>
			</form>
		</div>
	</center>
	<br>
	<br>
	<br>
	<br>
	<br>
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