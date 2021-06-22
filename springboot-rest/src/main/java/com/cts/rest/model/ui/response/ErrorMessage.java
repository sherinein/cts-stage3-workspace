package com.cts.rest.model.ui.response;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ErrorMessage {
	private Date date;
	private String errorMessageDescription;

}
