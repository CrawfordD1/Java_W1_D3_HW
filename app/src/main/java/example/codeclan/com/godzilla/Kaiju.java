package example.codeclan.com.godzilla;

import static android.R.attr.value;

public abstract class Kaiju {

    private String name;
    private int healthValue;
    private int force;

    public Kaiju(String name, int healthValue, int destructiveForce) {
        this.name = name;
        this.healthValue = healthValue;
        this.force =  destructiveForce;
    }


    public String getName() {
        return this.name;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public int getDestructiveForce(){
        return this.force;
    }

    public String attack(HumanConstructs construct){
        construct.healthValue -= this.getDestructiveForce();
        if (construct.getHealthValue() <= 0){
            return (this.name + " has done " + this.getDestructiveForce() + " damage!" + "-" + construct.destroy());
        }
        return (this.name + " has done " + this.getDestructiveForce() + " damage!" );

    }

}