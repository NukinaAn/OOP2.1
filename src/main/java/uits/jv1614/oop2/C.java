package uits.jv1614.oop2;

public class C extends Flowers{
    
  public C (String name, int aLength, int HowManyStood, int number){
		super(name, aLength, HowManyStood, number );
    }
        
    @Override
	public String preparation(){
		return "Подровнять, завернуть, украсить бабочкой";
	}
}       
 
