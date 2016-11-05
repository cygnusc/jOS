package com.ru.jOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Commandcd implements Command {

	@Override
	public int run(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		if (args.length == 1) {
			Handler.currentDir = System.getProperty("user.dir");
		} else {
			String dirName = args[1].charAt(0) == '/' ? args[1] :
				Handler.currentDir + "/" + args[1];
			File directory = new File(dirName);
			if (!directory.exists()) {
				System.err.println("cannot find: " + dirName);
				return 1;
			}
			Handler.currentDir = dirName;
		}
		return 0;
	}

}
