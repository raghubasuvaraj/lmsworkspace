package com.lms.userservice.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString


@Document(collection = "schools")
public class Schools {
	
	@Id
	private int id;
	private String schoolName;
	private String cityName;
	private String pocEmail;
	private int phoneNumber;
	private String website;
	private String signatoryName;
	private String signatoryRole;
	private String schoolType;

	
	

}
