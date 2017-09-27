package uits.jv1614.oop2;

public class App {
    public static void main(String[] args){
    Bouquet bouquet1 = new Bouquet("Свадебный", new C("Пион", 49, 3, 15), new C("Роза", 50, 2, 4), new C("Роза", 50, 1, 2));
	System.out.println( bouquet1);
	System.out.println();
	System.out.println();
		
   Bouquet bouquet2 = new Bouquet("Подарочный", new B("Лилия", 35, 3, 5), new C("Лилия", 33, 2, 4));
	System.out.println( bouquet2);
	System.out.println();
	System.out.println();
        
    Bouquet  bouquet3 = new Bouquet("Дружеский", new B("Тюльпан", 45, 1, 6), new C("Тюльпан", 47, 2, 9));
	System.out.println( bouquet3);
	System.out.println();
	System.out.println();
    }
}
    

    

