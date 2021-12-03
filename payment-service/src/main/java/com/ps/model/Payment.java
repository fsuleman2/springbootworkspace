package com.ps.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	@Id
	@GeneratedValue
	private int paymentId;
	private int customerId;
	private String customerName;
	private String customerPhone;
	private int orderId;
	private int productId;
	private String productName;
	private long cost;
	private String paymentStatus;

}
