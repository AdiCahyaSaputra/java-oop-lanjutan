package com.oop.data;

public class Country {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
	
	// static inner class 
	public static class City {
		private String name;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}
		/* Error 
		public String getCountryName() {
			return Country.this.name; // Error karena inner class nya static 
		}
		*/
	}
}
