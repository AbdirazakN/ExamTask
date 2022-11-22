package task;

public class Boat extends Transport{
    public Boat(String name, int year, TransportType transportType) {
        super(name, year, transportType);
    }

    @Override
    void fuelConsumption() {
        System.out.println(getName()+" Транспорту "+getTransportType()+" тибине кирет жана ага куйуучу май колдонулбайт.");
    }

    @Override
    void copacity() {
        System.out.println(getName()+" транспортунда 6 орун бар.");
    }
}
