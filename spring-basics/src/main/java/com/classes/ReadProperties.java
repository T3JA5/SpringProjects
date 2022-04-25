package com.classes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ReadProperties {

	@Value("${external.service.url}")
	private String url;
	
	public String getUrl() {
		return url;
	}
	
}
