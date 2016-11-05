package com.ru.jOS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Commandcat implements Command {

	@Override
	public int run(String[] args) throws IOException {
		// TODO Auto-generated method stub
		if (args.length == 1) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String input;
			do {
				input = br.readLine();
				System.out.println(input);
			} while (!input.equals(""));
		} else {
			for (int i = 1; i < args.length; i++) {
				BufferedReader br = new BufferedReader(
						new FileReader(args[i].charAt(0) == '/' ? args[i] :
								Handler.currentDir + "/" + args[i]));
				String line;
				while((line = br.readLine()) != null)
				{
				    System.out.println(line);
				}
				br.close();
			}
		}
		return 0;
	}

}
