import java.io.Serializable;
public class Fish implements Pet, Serializable {
    private int happiness;
    private int hunger;
    private Color color;
    public Fish(Color color) {
        this.color = color;
        this.happiness = 1; 
        this.hunger = 1;
    }
    public void play() {
        System.out.println("The fish is swimming playfully");
        System.out.println("Happiness level increased");
        increaseHappiness();
        System.out.println("Hunger level increased");
        increaseHunger();
    }
    public void feed() {
        System.out.println("The fish is fed");
        decreaseHunger();
    }
    public void makeSound() {
        System.out.println("The fish makes bubbling sound");
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

