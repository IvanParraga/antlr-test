package com.iparraga.antlrtest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import org.testng.annotations.Test;

import com.iparraga.antlrtest.GreetingsLoader;

public class GreetingsLoaderTest {

	@Test
	public void run() throws FileNotFoundException {
		Reader input = new FileReader("input.txt");
		GreetingsLoader loader = new GreetingsLoader(input);
		loader.run();
	}
}
