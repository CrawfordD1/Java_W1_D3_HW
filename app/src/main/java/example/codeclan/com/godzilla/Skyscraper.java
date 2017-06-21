package example.codeclan.com.godzilla;

/**
 * Created by user on 21/06/2017.
 */

public class Skyscraper extends HumanConstructs implements Destroyable {

    public Skyscraper(String type, int healthValue){
        super(type, healthValue);
    }

    public String destroy(){
            return "Kabooooooooom";

    }

}
