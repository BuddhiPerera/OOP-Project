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
import com.app.util.PaymentUtil;
import com.app.util.CommonConstants;
import com.app.util.QueryUtil;

public interface IPaymentServiceImpl extends IPaymentService {
	public static void insertPayment(Payment pay, int id)throws ClassNotFoundException, SQLException, IOException, ParseException {

		String sql = "insert into payment (id, amount, date, customerid, reservid) values (0,'"+pay.getAmount()+"',NOW(),'"+pay.getCustomerid()+"','"+pay.getReservid()+"')";
		QueryUtil.IUDRunner(sql);
	}	
}
