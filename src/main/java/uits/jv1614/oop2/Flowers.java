package uits.jv1614.oop2;


public abstract class Flowers {
    private String name;
    private int aLength;
    private int Value;
    private int HowManyStood;
    private int number;
    private FlowersList a = FlowersList.Flwrs;
    private enum FlowersList {Flwrs, Роза, Лилия, Тюльпан, Ромашка, Пион}
	
                	
public Flowers(String name, int aLength, int HowManyStood, int number) {
    this.name = name;
    this.aLength = aLength;
    this.HowManyStood = HowManyStood;
    this.number = number;
}
	
    abstract String preparation();
       
    int getValue() {
	switch (a.valueOf(name)){
            case Роза:
                Value = 40; 
            break;
            case Лилия: 
                Value = 28; 
            break;
            case Тюльпан: 
                Value = 35; 
            break;
            case Ромашка: 
                Value = 20; 
            break;
            case Пион: 
                Value = 30; 
            break;
                
	default: 
                Value = 0; 
                System.out.println("Цветок не найден");
		}
		return Value;
	}

    int getaLength() {
        return aLength;
    }
        
    String getName() {
        return name;
    }
    
    int getHowManyStood(){
        return HowManyStood;
    }
    int getnumber(){
        return number;
    }
}
     
  