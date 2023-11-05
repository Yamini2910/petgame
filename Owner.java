import java.io.Serializable;
import java.util.HashMap;
public class Owner implements Serializable {
    private HashMap<Integer, String> happinessLevels;
    private HashMap<Integer, String> hungerLevels;
    public Owner() {
        happinessLevels = new HashMap<>();
        happinessLevels.put(1, "Sad");
        happinessLevels.put(2, "Happy");
        happinessLevels.put(3, "Very Happy");
        hungerLevels = new HashMap<>();
        hungerLevels.put(1, "Very  Hungry");
        hungerLevels.put(2, "Hungry");
        hungerLevels.put(3, "Not  Hungry");
    }
     public String getHappinessLevel(int value) {
        return happinessLevels.getOrDefault(value, "Unknown");
    }

    public String getHungerLevel(int value) {
        return hungerLevels.getOrDefault(value, "Unknown");
    }

   
}

