package com.lms.userservice.entity;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "customSequences")
public class CustomSequences {
	
	 @Id
	 private String id;
	 private BigDecimal seq;

}
