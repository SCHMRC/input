package it.marcoschiavo.input;

import java.io.*;

public class Console {

	public Console() {}
	
	
	public BufferedReader keybord() {
		InputStreamReader k = new InputStreamReader(System.in);
		return new BufferedReader(k);
	}

}
