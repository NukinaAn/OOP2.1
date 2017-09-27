package uits.jv1614.oop2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Bouquet {
    private String name; 
    private String Components;
    List<Flowers> bouquet;
    
public Bouquet(){
    
   bouquet = new ArrayList<>();
}

public Bouquet(String name, Flowers...Components){ // если я правильно помню, то "..." означает что мы будем что то присваивать
    this.name = name;
    bouquet = new ArrayList<>();
    this.bouquet.addAll(Arrays.asList(Components));
}
    public Bouquet setname(String name) { // обьясни, пожалуйста, почему именно так построили? возвращаем в Bouquet?
        this.name = name;
        return this;
    }
    public String getname() {
        return name;
    }

    public Bouquet setComponents(Flowers f) {
	this.bouquet.add(f);
	return this;
    }
    public String getComponents() {
        return Components;
    } 
    
private int compositionValue(){ // просчитываем стоимость букета
    int f = 0;
    for(Flowers c: bouquet){
        f += Math.round((int) c.getnumber() * c.getValue()); 
    }
        return f;
}  

public class Comp implements Comparator<Flowers> { 
  @Override
	public int compare(Flowers one, Flowers two) {
          if (one.getHowManyStood() == two.getHowManyStood()){
		return 0;
          }else if (one.getHowManyStood() > two.getHowManyStood()){
                return 1;
            }else if (one.getHowManyStood() < two.getHowManyStood()){
		return -1;
            }
        return 0;
	}

}


@Override
    public String toString() {
    bouquet.sort(new Comp());
    int cost = this.compositionValue();
    String s = "Букет " + this.getname()+ ": \n";
    String smin = "";
        for (Flowers f : bouquet) {
            if (f.getaLength()> 35 && f.getaLength() <= 40){ // здесь я пытаюсь найти цветок по диапазону, но мне это не удается, что я делаю не так?
            System.out.println(f.toString()); 
            }
            s = s + f.getname() + "  " + f.getnumber() + " штук(и) " + f.preparation()+ "\n";
            
        }
	return s + "Стоимость " + cost + " грн " + (char) 13
				+"___________________"+ (char) 13
				+"Цветок в букете по заданному диапазону: "
                                 ;
				
	 
    }
}

