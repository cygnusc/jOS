package com.ru.jOS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Handler {
	Handler(String[] args) {
		
	}
	
	void run ()  throws IOException {
		System.out.println("running...");
		String input = "";
		do {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			input = br.readLine();
			String[] cli = input.split(" ");
			if (cli[0].equals("exit")) break;
			if (cli[0].equals("ls")) {
				Commandls cmd = new Commandls();
				cmd.run(cli);
			} else if (cli[0].equals("pwd")) {
				System.out.println(System.getProperty("user.dir"));
			} else if (cli[0].equals("cat")) {
				Commandcat cat = new Commandcat();
				cat.run(cli);
			} else {
				System.out.println("command \"" + cli[0] + "\" not found.");
			}
		} while (true);
	}

}
