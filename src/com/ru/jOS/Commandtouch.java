package com.ru.jOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Commandtouch implements Command {

	@Override
	public int run(String[] args) throws FileNotFoundException, IOException {
		for (int i = 1; i < args.length; i++) {
			String filename = args[i].charAt(0) == '/' ? args[i] :
				Handler.currentDir + "/" + args[i];
			File f = new File(filename);
			if (f.createNewFile()) {
				System.out.println("File \"" + filename + "\" created.");
			} else {
				System.out.println("cannot create file " + filename);
			}
		}
		return 0;
	}

}
