import java.util.List;
import java.util.ArrayList;

public class Suite {
    private String suiteName;
    private int costPerNight;

    public Suite(String suitName, int cost){
        this.suiteName = suiteName;
        this.costPerNight = costPerNight;
    }

    public String getSuiteName(){
        return suiteName;
    }
    public void setCostPerNight(int costPerNight){
        this.costPerNight = costPerNight;
    }

    public int getCostPerNight() {
        return costPerNight;
    }
}