package uits.jv1614.oop2;


public class B extends Flowers{
    
    public B (String name, int aLength, int HowManyStood, int number){
		super(name, aLength, HowManyStood, number);
    }
        
    @Override
	public String preparation(){
		return "Подровнять, выложить в коробку, закрепить бант";
	}
}
