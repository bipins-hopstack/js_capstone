package com.medicare.we.user.entity;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class Users {

	@Id
 String userId;
 String name;
 String emailId;
 String address;
 String userRole;

}
