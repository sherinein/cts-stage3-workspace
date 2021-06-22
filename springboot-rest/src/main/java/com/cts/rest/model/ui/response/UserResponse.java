package com.cts.rest.model.ui.response;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
	private int userId;
	private String name;
	private long mobileNumber;
}
