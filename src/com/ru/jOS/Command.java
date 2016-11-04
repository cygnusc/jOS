package com.ru.jOS;

import java.io.FileNotFoundException;
import java.io.IOException;

public interface Command {
	public int run(String[] args) throws FileNotFoundException, IOException;
}
