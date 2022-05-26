package com.oop.utils;

import com.oop.error.BlankException;
import com.oop.error.ValidationException;

public class ValidationUtil {
	// pake static method aja, lalu gunakan keyword throws 
	public static void validate(String username, String pw) throws ValidationException, NullPointerException { // Multiple Exception throw  
		if(username == null) throw new NullPointerException("Username Tidak Boleh Null");
		if(username.isEmpty()) throw new ValidationException("Username Harus Di Isi");
		if(pw == null) throw new NullPointerException("Password Nya Null");
		if(pw.isEmpty()) throw new ValidationException("Password Harus Di Isi");
	}

	// Runtime g wajib pake keyword throws 
	public static void validateRuntime(String username, String pw) {
		if(username == null) throw new NullPointerException("Username Tidak Boleh Null");
		if(username.isEmpty()) throw new BlankException("Username Harus Di Isi");
		if(pw == null) throw new NullPointerException("Password Nya Null");
		if(pw.isEmpty()) throw new BlankException("Password Harus Di Isi");
		
		// NullPointerException juga termasuk RuntimeException 
	}
}
