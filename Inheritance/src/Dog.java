public class Dog extends Animal{
    private String earShape;
    private String tailShape;


    public Dog(){
        super("mutt ","big","57");
    }

    public Dog(String type,double weight){
        this(type, String.valueOf(weight),"perky","cured");
    }
    public Dog(String type,  String weight, String earShape, String tailShape) {
        super(type, weight);
        this.earShape = earShape;
        this.weight = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", weight='" + weight + '\'' +
                "} " + super.toString();
    }
}
