package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class Godzilla extends Kaiju implements Attack {

    public Godzilla(String name, int healthValue, int destructiveForce){
        super(name, healthValue, destructiveForce);
    }

    public String roar(){
        return "Roooooaooooaaaaaaaaar!!!";
    }


}
