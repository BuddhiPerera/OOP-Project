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
	<meta name='viewport' content='width=device-width, initial-scale=1.0'>
	<link rel='stylesheet' type='text/css' href='css/payment.css'>
	<script src="payment.js" type="text/javascript"> </script>
	<title>Payment Gateway</title>
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
			<form name="paymentForm" method="post" action="PaymentInsert" onsubmit="return checkCrdDigits();return checkCVV(); return false;">
				<h2 class='formHead'>Payment Gateway</h2>
				<% int customerID = (Integer)request.getAttribute("customerID");%>
				<p>
				Customer ID: 
				<input name="customerId" type="hidden" value="<%=customerID %>">
				<label name="lblCusId" id="lblCusId"><%=customerID %></label>
				</p>
				<% String serviceType = (String)request.getAttribute("serviceType");%>
				<p>
				Service Type: 
				<input name="serviceType" type="hidden" value="<%=serviceType %>">
				<label name="lblServiceType" id="lblServiceType"><%=serviceType %></label>
				</p>
				<% int reservID = (Integer)request.getAttribute("reservID");%>
				<p>
				Reservation ID:
				<input name="reservID" type="hidden" value="<%=reservID%>">
				<label name="lblReservID" id="lblReservID"><%=reservID %></label>
				</p>
				<% double price = (Double)request.getAttribute("price"); %>
				<p>
				Amount:
				<input name="price" type="hidden" value="<%=price %>">
				<label name="lblPrice" id="lblPrice"><%=price %></label>
				</p>
				<p>Card Type:
				<br><br>
				<input type="radio" name="visa" id="cardType" value="visa">
				<label for="visa">Visa</label>
				<input type="radio" name="master" id="cardType" value="master">
				<label for="master">Master Card</label>
				</p>
				<p>Card Holder's Name:</p>
				<input type="text" name="crdHolderName" size="60" height="20" class="intText" placeholder="Enter card holder's name" required>
				<p>Card Number:</p>
				<input type="text" name="crdNumber" size="60" class="intText" placeholder="Enter card number" required>
				<p>Expire Date:</p>
				<input type="date" name="expireDate" required>
				<p>Security Number:</p>
				<input type="text" name="securityNumber" size="30" class="intText" required>
				<br><br>
				<input type="submit" class="buttons" value="Pay">
				<br>
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