package com.Akif2;

public class Meowth extends Pokemon{
    private int damagePoint;
    private boolean cardUsed;
    public Meowth(){
        this("MOT698354","Meowth","Normal");
    }
    public Meowth(String id, String name ,String type){
        super(id,name,type,false);
        cardUsed = false;
        damagePoint = 40;
    }

    public void setDamagePoint(int damagePoint) {
        this.damagePoint = damagePoint;
    }

    public boolean isCardUsed() {
        return cardUsed;
    }

    @Override
    public void setCardUsed(boolean cardUsed) {
        this.cardUsed = cardUsed;
    }
    @Override
    public int showDamagePoint() {
        return damagePoint;
    }
}
