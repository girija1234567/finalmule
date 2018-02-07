package com.main;

public class HelloService implements IHelloService {

	@Override
	public String hiService(String name) {
		
		return "hello"+name+":)";
	}

}
