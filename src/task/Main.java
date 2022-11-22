package task;

public class Main {
    public static void main(String[] args) {

        // 1.         Класстар
        //1.         Animal(абстракт класс) - String name , int livingTime(канча жылдан бери жашайт), int speed, AnimalType animalType;
        //2.         Eagle(sub класс) ;
        //3.         Horse(sub класс);
        //4.         Tiger(sub класс);
        //5.         AnimalType(Enum) - DOMESTIC_ANIMAL, WILD_ANIMAL, BIRD;
        //6.         Transport(абстракт класс) - String name, int year, TransportType transportType;
        //7.         Boat(sub класс);
        //8.         Bus(sub класс);
        //9.         Helicopter(sub класс);
        //10.       TransportType(Enum) - ROAD_TRANSPORT, AIR_TRANSPORT, WATER_TRANSPORT;
        //11.       Person(класс) - String name, int age, Animal [] animal, Transport [] transport;
        //12.       AnimalInterface(interface) - void run(), void eat(String food), LocalDate live();
        //13.       Flyable(interface) - void fly();
        //14.       TransportInterface (interface) - void fuelConsumption(String fuel, int litr), void capacity(int place);
        //2.         Getter&Setter, Constructor
        //1.         Жаныбарларга ат берип жатканда аттыры 3 тамгадан жогору болуусу керек;
        //2.         Транспортторго берилген аттар консольдон чыкканда бардыгы чон тамга менен чыксын;
        //3.         Транспорттордун жылы 2018-жылдан жогору болуусу керек, болбосо «Транспорт эски деп чыксын»;
        //4.         Адамдардын жашы терс сан болбошу керек;
        //3.         Методдор
        //1.         run() методу кайсыл жаныбар канча ылдамдыкта чуркай аларын корсотсун;
        //2.         eat() методу кайсыл жаныбар кандай тамак жейт экенин чыгарсын;
        //3.         live() методу кайсыл жаныбар канчанчы жылдан бери жашаганын санап чыгарсын.
        //4.         fly() методу кайсыл жаныбар жана транспорт уча турганын корсотсун;
        //5.         fuelConsumption() методу кайсыл транспорт кандай жана канча куйуучу май сарптайт чыгарсын;
        //6.         capacity() методу кайсыл транспортто канча орун бар экенин чыгарсын;
        //4.         Результат
        //1.         Мейнге 3 метод тузунуз
        //2.         1-метод:  method1(Animal[] animals, Transport[]transports,String name);
        //      3 Person тузунуз: Asan, Uson, Adyl
        //       Asan: 1 Tiger, 1 Horse, 1 Eagle, 2 Bus, 1 Helicopter
        //       Uson: 1 Tiger, 2 Horse, 1 Bus, 1 Helicopter, 1 Boat
        //       Adyl: 1 Tiger, 2 Eagle, 1 Helicopter, 1 Boat
        //       Консольдон кимдин аты жазылса ошого таандык маалымат чыксын ;
        //3.         2-метод: method2(Animal[] animals);
        //      Жанбарларга оздоруно тийиштуу методдорун консольго чыгарыныз
        //      3 массив тузуп(Tiger,Eagle,Horse), ар бир жаныбарды animals массивинен алып оздорунун массивине салып, консольго чыгарыныз.
        //4.         3-метод: method3(Transport[] transports);
        //      Транспортторго оздоруно тийиштуу методдорун консольго чыгарыныз
        //      3 массив тузуп(Bus,Helicopter,Boat), ар бир транспортту transports массивинен алып оздорунун массивине салып, консольго чыгарыныз.

    Animal[] animals = {new Eagle("Algyr",4,140,AnimalType.BIRD),
                        new Horse("Champion",6,120,AnimalType.DOMESTIC_ANIMAL),
                        new Tiger("Jolbors",10,135,AnimalType.WILD_ANIMAL)
    };

    Transport[] transports = {new Boat("Lodka",2015,TransportType.WATER_TRANSPORT),
                              new Helicopter("Vert",2022,TransportType.AIR_TRANSPORT),
                                      new Bus("Bus",2012,TransportType.ROAD_TRANSPORT)
    };

    Person person1 = new Person("Asan",20,new Animal[]{new Eagle("Algyr",4,140,AnimalType.BIRD)},new Transport[]{new Boat("Lodka",2015,TransportType.WATER_TRANSPORT)});
    Person person2 = new Person("Uson",20,new Animal[]{new Eagle("Algyr",4,140,AnimalType.BIRD)},new Transport[]{new Boat("Lodka",2015,TransportType.WATER_TRANSPORT)});
    Person person3 = new Person("Adyl",20,new Animal[]{new Eagle("Algyr",4,140,AnimalType.BIRD)},new Transport[]{new Boat("Lodka",2015,TransportType.WATER_TRANSPORT)});

    method1(animals,transports,"Asan");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    method2(animals);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~");
    method3(transports);
    }

    public static void method1(Animal[] animals,Transport[] transports, String name){
        if (name == "Asan"){
            Person person1 = new Person("Asan",20,new Animal[]{new Eagle("Algyr",4,140,AnimalType.BIRD)},new Transport[]{new Boat("Lodka",2015,TransportType.WATER_TRANSPORT)});
            System.out.println(person1);
        } else if (name == "Uson") {
            Person person2 = new Person("Uson",20,new Animal[]{new Eagle("Algyr",4,140,AnimalType.BIRD)},new Transport[]{new Boat("Lodka",2015,TransportType.WATER_TRANSPORT)});
        } else if (name == "Adyl") {
            Person person3 = new Person("Adyl",20,new Animal[]{new Eagle("Algyr",4,140,AnimalType.BIRD)},new Transport[]{new Boat("Lodka",2015,TransportType.WATER_TRANSPORT)});
        }else {
            System.out.println("Мындай объект жок!");
        }
    }

    public static void method2(Animal[] animals){
        for (Animal animal:animals) {
            animal.run();
            animal.eat();
            animal.fly();
            animal.live();
        }
        
    }

    public static void method3(Transport[] transports){
        for (Transport transport:transports) {
            transport.copacity();
            transport.fuelConsumption();

        }
    }
}