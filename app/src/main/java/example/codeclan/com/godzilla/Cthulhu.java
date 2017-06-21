package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class Cthulhu extends Kaiju implements Attack {

    public Cthulhu(String name, int healthValue, int destructiveForce){
        super(name, healthValue, destructiveForce);
    }

    public String roar(){
        return "Bleeerrgghghgh!";
    }


}
