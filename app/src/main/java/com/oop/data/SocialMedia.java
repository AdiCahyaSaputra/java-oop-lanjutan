package com.oop.data;

class SocialMedia {
	String name;
}

// final class ( udh g bisa di  inherit² in lagih ) karena udah final 
final class Facebook extends SocialMedia {

}

// Error 
/*
class FakeFB extends Facebook {

}
*/

// Final method ( g bisa di override di child class ) 
class Instagram extends SocialMedia {
	final void login(String username, String password) {

	}
} 

class FakeIG extends Instagram {
	// Error 
	/*
	void login(String username, String password) {

	}
	*/
}
