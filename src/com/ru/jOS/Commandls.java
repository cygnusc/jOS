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
			dirName = System.getProperty("user.dir");
		} else dirName = args[1];
		File directory = new File(dirName);
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
