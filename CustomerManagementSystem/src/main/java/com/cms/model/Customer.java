package com.cms.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;

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
	@NotEmpty(message = "Customer Name Cannot be Empty") //javax package
	private String customerName;
	@NotEmpty(message = "Customer Name Cannot be Empty") //javax package
	private String customerCity;
	private Date dob;
	@Length(min=10,max=10, message="phone number must be of 10 Digit only")
	private String customerPhone;
	@Pattern(regexp ="[A-Za-z]{10}[0-9]{4}" ,message="Invalid password")
	private String customerPassword;

	
	
	

}
