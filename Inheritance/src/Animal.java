public class Animal {

    private String type;
    String size;
    public String weight;
    public Animal(String type, String weight){

    }
    public Animal(String type, String size, String weight) {
        this.type = type;
        this.size = size;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", size='" + size + '\'' +
                ", weight='" + weight + '\'' +
                '}';
    }
    public void move(String speed){
        System.out.println(type + " moves " +speed);
    }

    public void makeNoise(){
        System.out.println(type+ "makes some kind of noise");
    }
}
