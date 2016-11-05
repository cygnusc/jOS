package com.ru.jOS;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Commandrm implements Command {

	@Override
	public int run(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		for (int i = 1; i < args.length; i++) {
			Path path = Paths.get(args[i].charAt(0) == '/' ? args[1] :
				Handler.currentDir + "/" + args[1]);
			try {
			    Files.delete(path);
			    System.out.println(path.toString() + " deleted.");
			} catch (NoSuchFileException x) {
			    System.err.format("%s: no such" + " file or directory%n", path);
			} catch (DirectoryNotEmptyException x) {
			    System.err.format("%s not empty%n", path);
			} catch (IOException x) {
			    // File permission problems are caught here.
			    System.err.println(x);
			}
		}
		return 0;
	}

}
