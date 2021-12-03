package com.revature.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Cuser")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	private int uId;
	private String name;

}
