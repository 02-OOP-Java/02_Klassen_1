package com.cc.java;

public class Yard {

	public static void main(String[] args) {
		
		// Cat --> Klasse
		// cat --> Instanz / Objekt (Referenzvariable / Verweis auf Adresse)
		
		Cat cat1 = new Cat();		
		cat1.tellYourAddress();		
		System.out.println("Blick von aussen: " + cat1);
		
		System.out.println("-------------------------");
		
		Cat cat2 = new Cat();
		cat2.tellYourAddress();
		System.out.println("Blick von aussen: " + cat2);
	}

}
