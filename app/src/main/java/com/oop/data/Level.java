package com.oop.data;

/**
 * Enum Class 
 * berisi data yg terbatas ( misal jenis kelamin, level, etc ) 
 * enum class otomatis extend ke java.lang.enum jadi g bisa extend lagi ke kelas lain
 * tapi masih bisa pake implements kok 
 * */

public enum Level {
	// tambahin titik koma jika ada code lagi di bawah data enum nya 
	// btw klo ada constructer, maka init nya di data enum nya  
	PREMIUM("Sangat GG"), VIP("GG"), BASE("Missqueen");
	private String desc;
	
	// constructer di enum ( tpi g bisa public ) 
	Level(String desc) {
		this.desc = desc;
	}

	public String getDesc() {
		return this.desc;
	}
}
