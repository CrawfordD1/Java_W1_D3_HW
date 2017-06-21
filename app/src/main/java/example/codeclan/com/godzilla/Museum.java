package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class Museum extends HumanConstructs implements Destroyable {

    public Museum(String type, int healthValue){
        super(type, healthValue);
    }


    public String destroy(){
            return "Oh No, The Art!";

    }
}
