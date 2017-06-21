package example.codeclan.com.godzilla;

public abstract class HumanConstructs {

    private String type;
    int healthValue;

    public HumanConstructs(String type, int healthValue) {
        this.type = type;
        this.healthValue = healthValue;
    }

    public String getType() {
        return this.type;
    }

    public int getHealthValue() {
        return this.healthValue;
    }

    public abstract String destroy();


}
