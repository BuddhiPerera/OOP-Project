/* 
 * IT19009896
 * Perera K.B.N
 * SLIIT
 */
package com.app.model;

import java.util.Date;

public class Payment {
	// defining variables
	private int id;
	private float amount;
	private String date;
	private int customerid;
	private int reservid;
	
	//constructor
	public Payment(int id, float amount, String date, int customerid, int reservid) {
		super();
		this.id = id;
		this.amount = amount;
		this.date = date;
		this.customerid = customerid;
		this.reservid = reservid;
	}
	//getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getCustomerid() {
		return customerid;
	}

	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}

	public int getReservid() {
		return reservid;
	}

	public void setReservid(int reservid) {
		this.reservid = reservid;
	}
}
