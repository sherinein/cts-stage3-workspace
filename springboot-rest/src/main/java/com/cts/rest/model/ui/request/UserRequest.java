package com.cts.rest.model.ui.request;





import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
	
	private String name;
	private String email;
	private long mobileNumber;
	private String qualification;
}
