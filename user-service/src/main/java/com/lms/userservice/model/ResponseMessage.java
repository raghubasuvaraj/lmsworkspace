package com.lms.userservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class ResponseMessage implements Serializable {

	private static final long serialVersionUID = 1L;

	String messsage;
}
