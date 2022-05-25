package com.oop.data;

/**
 * Record Class 
 * class yg hanya berisikan data, dan dia 
 * sifat nya imutable ( g bisa di rubah lagi ) 
 *
 * isi nya cuma getter, equals, toString, hashCode,
 * dan otomatis dibikinin constructer 
 *
 * hanya bisa implements tidak bisa inheritence 
 *
 * fitur masih experimental 
 * */


// Constructer nya langsung disini btw  🔽 
public record LoginRequest(String username, String password) {
	// untuk getter, equals, toString, hashCode, etc udh otomatis btw 	
	
	// modifikasi isi constructer ( compact constructer  ) 
	public LoginRequest {
		System.out.println("Membuat Object Record dan menjalankan method constructer");
	}

	// constructer overloading 
	public LoginRequest(String username) {
		// wajib manggil constructer utama 
		this(username, "");
	}

	// method sendiri 
	public void sayHai() {
		// si username di constructer otomatis jadi field btw 
		System.out.println("Hai " + this.username);
	}
}
