package org.example.war;

import java.util.ArrayList;

import org.example.saxon.Saxon;
import org.example.vikins.Viking;


public class War {

private ArrayList<Viking> vikingArmy;
private ArrayList<Saxon> saxonArmy;

public War(){
    this.vikingArmy = new ArrayList<>();
    this.saxonArmy = new ArrayList<>();
}

public void addViking(Viking viking){
 this.vikingArmy.add(viking);


}
public void addSaxon(Saxon saxon){
    this.saxonArmy.add(saxon);
   
}

   public String vikingAttack(){
    return "";
   
   }
   public String saxonAttack(){
    return "";
   
   }
   public String showStatus(){
    return "";
   
   }


}
