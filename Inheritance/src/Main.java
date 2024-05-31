public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("generic animal ","huge","500 kg");
        doAnimalStuff(animal,"sloww");
        Dog dog = new Dog();
        doAnimalStuff(dog , "fast");
    }
    public static void doAnimalStuff(Animal animal,String speed){

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("___________________");
    }
}