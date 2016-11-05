package com.ru.jOS;

import java.io.File;

public class Commandls implements Command{

	public Commandls() {
		// TODO Auto-generated constructor stub
	}

	public int run(String[] args) {
		String dirName;
		if (args.length == 1) {
			//dirName = ".";
			//dirName = System.getProperty("user.dir");
			dirName = Handler.currentDir;
		} else dirName = args[1].charAt(0) == '/' ? args[1] : 
			Handler.currentDir + "/" + args[1];
		// System.out.println("displaying dir: " + dirName);
		File directory = new File(dirName);
		if (!directory.exists()) {
			System.err.println("cannot find: " + dirName);
			return 1;
		}
		File[] fList = directory.listFiles();
		if (fList.length != 0) {
			for (File f : fList) {
				System.out.print(f.getName() + "\t");
			}
			System.out.println();
		}
		return 0;
		// TODO Auto-generated method stub
		
	}
}
