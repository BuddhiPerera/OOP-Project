/* 
 * IT19009896
 * Perera K.B.N
 * SLIIT
 */
package com.app.service;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

import com.app.model.Payment;

public interface IPaymentService {
	public Payment insertPayment(int id)throws ClassNotFoundException, SQLException, IOException, ParseException;
}
