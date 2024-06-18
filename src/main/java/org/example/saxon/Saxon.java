package org.example.saxon;

import org.example.soldier.Soldier;

public class Saxon extends Soldier {

    private String msg;

    public Saxon (int health, int strength){
        super(health,strength);
        this.msg = "";
    
    }

    public String getMsg() {
        return msg;
    }

        @Override
        public void receiveDamage (int damage){
         this.health -= damage;
         if (this.health > 0){
            msg ="A Saxon has received" + damage + "points of damage";
         } else {
             msg = "A Saxon has died in combat";
         }
        }
     
    }
