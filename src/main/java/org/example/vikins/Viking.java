package org.example.vikins;

import org.example.soldier.Soldier;

public class Viking extends Soldier  {

    public String name;
    public String msg;

    public Viking(int health, int strength, String name){
        super (health, strength);
        this.name = name;
        this.msg = "";    
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }


   @Override
   public void receiveDamage (int damage){
    this.health -= damage;
    if (this.health > 200){
       this.msg = this.name + " has received " + damage + " points of damage";
    } else {
        this.msg = this.name + "has died in act of combat";
    }
   }


   public String battleCry(){
    return "Odin Owns You All!";
   }
}
