package task;

public abstract class Transport {
    private String name;
    private int year;
    private TransportType transportType;

    public Transport(String name, int year, TransportType transportType) {
        this.name = name;
        this.year = year;
        this.transportType = transportType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        if (getYear() > 2018) {
            return year;
        }else {
            System.out.println("Транспорт эски!");
        }
        return 0;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    abstract void fuelConsumption();
    abstract void copacity();

    @Override
    public String toString() {
        return "Transport{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", transportType=" + transportType +
                '}';
    }
}
