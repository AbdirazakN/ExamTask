package task;

public abstract class Animal {

    private String name;
    private int livingTime;
    private int speed;
    private AnimalType animalType;

    public Animal(String name, int livingTime, int speed, AnimalType animalType) {
        if (name.length() > 3) {
            this.name = name;
        }
        this.livingTime = livingTime;
        this.speed = speed;
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLivingTime() {
        return livingTime;
    }

    public void setLivingTime(int livingTime) {
        this.livingTime = livingTime;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public AnimalType getAnimalType() {
        return animalType;
    }

    public void setAnimalType(AnimalType animalType) {
        this.animalType = animalType;
    }

    abstract void run();
    abstract void eat();
    abstract void live();
    abstract void fly();



    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", livingTime=" + livingTime +
                ", speed=" + speed +
                ", animalType=" + animalType +
                '}';
    }
}
