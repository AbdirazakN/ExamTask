package task;

public class Helicopter extends Transport{
    public Helicopter(String name, int year, TransportType transportType) {
        super(name, year, transportType);
    }

    @Override
    void fuelConsumption() {
        System.out.println(getName()+" Транспорту "+getTransportType()+" тибине кирет жана ал куйуучу май менен иштейт.");
    }

    @Override
    void copacity() {
        System.out.println(getName()+" транспортунда 15 орун бар.");
    }
}
