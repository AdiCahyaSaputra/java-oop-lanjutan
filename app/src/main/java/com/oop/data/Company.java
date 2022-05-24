package com.oop.data;

public class Company {
	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public class Employee {
		private String name;

		public void setName(String name) {
			this.name = name;
		}

		public String getName() {
			return this.name;
		}


		// getPrivate property and method from wrapper class 
		public String getCompanyName() {

			// selalu di awali dengan object company nya 
			return Company.this.name;
		}

	}
}
