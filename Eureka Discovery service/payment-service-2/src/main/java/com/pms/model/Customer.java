package com.pms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Customer implements Serializable{
	@Id
	@GeneratedValue
	private int customerId;
	private String customerName;
	private String customerCity;
	private Date dob;
	private String customerPhone;
	private String customerPassword;
	private Long balance;

}
