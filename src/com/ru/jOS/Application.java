package com.ru.jOS;

import java.io.IOException;

public class Application {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
		System.out.println("Welcome to jOS");
		Handler h = new Handler(args);
		h.run();
		System.out.println("Bye");
	}

}
