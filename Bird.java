import java.io.Serializable;
public class Bird implements Pet, Serializable {
    private int happiness;
    private int hunger;
    private Color color;

    public Bird(Color color) {
        this.color = color;
        this.happiness = 1; 
        this.hunger = 1;
    }
    public void play() {
        System.out.println("The bird is flying happily");
        System.out.println("Happiness level increased");
        increaseHappiness();
        System.out.println("Hunger level increased");
        increaseHunger();
    }
    public void feed() {
        System.out.println("The bird is fed");
        decreaseHunger();
    }
    public void makeSound() {
        System.out.println("The bird chirps");
    }
    public Color getColor() {
        return color;
    }
    public Integer getHungerValue() {
        return hunger;
    }
    public Integer getHappinessValue() {
        return happiness;
    }

    private void increaseHappiness() {
        happiness ++;
    }

    private void decreaseHunger() {
        if (hunger > 0) {
            hunger --;
        }
    }

    private void increaseHunger() {
        hunger ++;
    }
}

