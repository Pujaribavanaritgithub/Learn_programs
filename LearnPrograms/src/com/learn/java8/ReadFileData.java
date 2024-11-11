package com.learn.java8;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReadFileData {

	public static void main(String[] args) throws Exception {
		
		/*
		 * FileReader fr = new FileReader(new
		 * File("/LearnPrograms/src/com/learn/java8/greet.txt"));
		 * 
		 * BufferedReader br = new BufferedReader(fr);
		 * 
		 * 
		 * String line = br.readLine();
		 * 
		 * while (line!= null) { System.out.println(line);
		 * 
		 * line = br.readLine();
		 * 
		 * } br.close();
		 */
       
       
       String filename = "greet.txt";
       List<String> lines = new ArrayList<String>();
       
       try (Stream<String> stream = Files.lines(Paths.get(filename))){
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
	

}
