/**
 * IT19009896
 * Perera K.B.N
 * java script file for the payment form validation
 *  
 */
function checkCrdDigits(){
	// variables
	var cardNo = document.getElementById("crdNumber").value;
	var example = /^[0-9]+\.?[0-9]*$/;
	if(cardNo.length != 16 && cardNo.match(example)){
		alert("Invalid card number");
		return false
	}
	return true;
}

function checkCVV(){
	var cvv = document.getElementById("securityNumber").value;
	if(cvv.lenght != 3){
		alert("Invalid CVV number");
		return false;
	}
	return true;
}