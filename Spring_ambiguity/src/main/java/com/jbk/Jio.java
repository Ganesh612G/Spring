package com.jbk;

import org.springframework.stereotype.Component;

@Component("jio")
public class Jio implements Sim {

	@Override
	public String calling() {
		
		return "U Are Calling From Jio";
	}

}
