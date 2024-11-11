package com.learn.java8;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {

	public static void main(String[] args) {
	
		String pwd = "Bavana@838";
		
		Encoder en = Base64.getEncoder();
		
		// convert string to byte array
		byte[] bs = en.encode(pwd.getBytes());
		
		// byte array to string
		
		String string = new String(bs);
		
		System.out.println("Encoded password: "+ string);
		
		// Decoding
		
		Decoder dc = Base64.getDecoder();
		byte[] decode = dc.decode(string);
		
		String string2 = new String(decode);
		
		System.out.println("Decoded password :"+ string2);

	}

}
