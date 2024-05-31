import javax.management.monitor.Monitor;

public class composition {
    public void main(String[] args) {

        ComputerCase theCase = new ComputerCase("2208", "Dell",
                "240");
        Monitor theMonitor = new Monitor("27 inch Beast", "Acer",
                27, "2540 x 1440");
        Motherboard theMotherboard = new Motherboard("BJ-200", "ASUS",
                4, 6, "v2.44");
        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                theMonitor, theMotherboard, theCase);
        thePC.getMonitor().drawPixelAt(10, 10, "red");
        thePC.getMotherboard().loadProgram("WindowOS");
        thePC.getComputerCase().pressPowerButton();
    }
}
public class Product {
    private String model;
    private String manufacturer;
    private int width;
    private int height;
    private int depth;

    public Product(String model,String manufacturer){
        this.model=model;
        this.manufacturer=manufacturer;
    }
}

class Monitor extends Product{
    private int size;
    private String resolution;

    public Monitor(String model,String manufacturer){
        super(model,manufacturer);
    }
    public Monitor(String model,String manufacturer,int size,String resolution){
        super(model,manufacturer);
        this.resolution=resolution;
        this.size=size;
    }
    public void drawPixelAt(int x, int y, String color){
        System.out.println(String.format("Drawing pixel at %d ,%d in colour %s ",x,y,color));
    }
}

class Motherboard extends Product{

    private int ramSlots;
    private int cardSlots;
    private String bios;

    public Motherboard(String model, String manufacturer){
        super(model,manufacturer);
    }

    public Motherboard(String model,String manufacturer,int ramSlots , int cardSlots , String bios){
        super(model,manufacturer);
        this.bios=bios;
        this.cardSlots=cardSlots;
        this.ramSlots=ramSlots;
    }

    public void loadProgram(String programName){
        System.out.println("Program "+programName+ " is loading");
    }
}

class ComputerCase extends Product{
    private String powerSupply;

    public ComputerCase(String model, String manufacturer) {
        super(model, manufacturer);
    }

    public ComputerCase(String model, String manufacturer, String powerSupply) {
        super(model, manufacturer);
        this.powerSupply = powerSupply;
    }
    public void pressPowerButton(){
        System.out.println("Power Button pressed");
    }
}
    public class PersonalComputer extends Product{
        private Monitor monitor;
        private Motherboard motherboard;
        private ComputerCase computerCase;

        public PersonalComputer(String model, String manufacturer,
                                Monitor monitor, Motherboard motherboard, ComputerCase computerCase) {
            super(model, manufacturer);
            this.monitor = monitor;
            this.motherboard = motherboard;
            this.computerCase = computerCase;
        }

        public Monitor getMonitor() {
            return monitor;
        }

        public Motherboard getMotherboard() {
            return motherboard;
        }

        public ComputerCase getComputerCase() {
            return computerCase;
        }


}
