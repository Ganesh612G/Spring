package com.jbk;

import org.springframework.stereotype.Component;

@Component("air")
public class Airtel implements Sim {

	@Override
	public String calling() {
		
		return "U Are Calling From Airtel";
	}

}
