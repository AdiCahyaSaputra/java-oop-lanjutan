package com.oop.app;

public class EqualsMethod {
  public static void main(String[] args) {
  
    // tanda == bakalan membandingkan object nya bukan value nya ( karena String kan tipe data non primitif ) 
    String first = "Adi Cahya Saputra";
    System.out.println(first);

    String second = "Adi";
    second = second + " " + "Cahya Saputra";
    System.out.println(second);
    
    // false karena beda object 
    System.out.println(first == second);


    // tapi jika 
    String third = "Adi Cahya Saputra";
    System.out.println(third);
    
    // true karena java meng optimasi memori. jika string nya sama ya berarti object third bakal ngambil referensi dari object first 
    System.out.println(third == first);

    // Equals method 
    System.out.println(first.equals(second)); // True

  }
}
