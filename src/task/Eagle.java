package task;

public class Eagle extends Animal{
    public Eagle(String name, int livingTime, int speed, AnimalType animalType) {
        super(name, livingTime, speed, animalType);
    }

    @Override
    void run() {
        System.out.println(getName()+" Жаныбары саатына "+getSpeed()+"км/с чуркай алат.");
    }

    @Override
    void eat() {
        System.out.println(getName()+" Бул жаныбар эт жейт");
    }

    @Override
    void live() {
        System.out.println(" Бул жаныбар "+getLivingTime()+" жылдан бери жашайт");
    }

    @Override
    void fly() {
        System.out.println(" Бул жаныбар уча алат");
    }
}
