package uits.jv1614.oop2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Bouquet {
    private String name; 
    private String Components;
    List<Flowers> bouquet;
    
public Bouquet(){
    
   bouquet = new ArrayList<Flowers>();
}

public Bouquet(String name, Flowers...Components){ // если я правильно помню, то "..." означает что мы будем что то присваивать
    this.name = name;
    bouquet = new ArrayList<Flowers>();
        for (Flowers f : Components) {
           this.bouquet.add(f);
        }
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

// Comp НЕ РАБОТАЕТ ЧЕГО ТО(((( И МОЖЕШЬ ПОДРОБНЕЙ РАССКАЗАТЬ КАК, КОГДА И ДЛЯ ЧЕГО ПРИМЕНЯЕТСЯ  hashCode() ?!!! В ДАННОЙ СИТУАЦИИ
// МНЕ НУЖНО СДЕЛАТЬ СОРТИРОВКУ цветов в букете на основе уровня свежести(private int HowManyStood;)

//public class Comp implements Comparator<Flowers> { 
  //  @Override
//	public int compare(Flowers one, Flowers two) {
    //        if (one.getHowManyStood() == two.getHowManyStood()){
	//	return 0;
     //       }else if (one.getClass().hashCode() > two.getClass().hashCode()){
      //          return 1;
       //     }else if (one.getClass().hashCode() < two.getClass().hashCode()){
	//	return -1;
        //    }
	//	return 0;
	//}

//}

@Override
    public String toString() {
   // bouquet.sort(new Comp());
    int cost = this.compositionValue();
    String s = "Букет " + this.getname()+ ": \n";
        for (Flowers f : bouquet) {
            s = s + f.getName() + "  " + f.getnumber() + " штук " + f.preparation()+ "\n";
	}
	return s + "Стоимость " + cost + " грн";
		
    }
}

