package JUV25D.PractiseUnits;

public class Practise4 {

    static void task(int p){
        switch(p){
            case 1 -> q1();
            case 2 -> q2();
            case 3 -> q3();
            case 4 -> q4();
            case 5 -> q5();
            case 6 -> q6();
            case 7 -> q7();
            case 8 -> q8();
            case 9 -> q9();
            case 10 -> q10();
            case 11 -> q11();
            case 12 -> q12();

            default ->
                    throw new IllegalStateException("Unexpected value: " + p);
        }
    }

    static Animalum q1(){
        Animalum pet = new Animalum(System.console().readLine("Species: "),
                System.console().readLine("Name: "),
                Integer.parseInt(System.console().readLine("Age: ")));
        return pet;
    }

    static void q2(){
        Animalum pet = q1();
        System.out.println("Name: " + pet.name + "\nSpecies: " + pet.species + "\nAge: "  + pet.age);
    }

    static void q3(){
        Animalum pet = q1();
        Animalum theLegend = new Animalum();
    }

    static void q4(){
        Car myCar = new Car();
        myCar.setModel(System.console().readLine("Model: "));
        myCar.setColor(System.console().readLine("Color: "));
        myCar.setPrice(Integer.parseInt(System.console().readLine("Price: ")));

        System.out.println("Model: " + myCar.getModel() + "\nColor: " + myCar.getColor() + "\nPrice: " +  myCar.getPrice());
    }

    static void q5(){
        Car myCar = new Car();
        Car myOtherCar = new Car("Delorean", "Silver", 1000);
    }

    static void q6(){
        Car myCar = new Car("Delorean", "Silver", 1000);
        myCar.halfPrice();
    }

    static void q7(){
        Counter counter = new Counter();
        for (int i = 0; i < 10; i++) {
            counter.increment();
        }
        System.out.println("Counter: " + counter.value());
    }

    static void q8(){
        Counter[] counters = new Counter[10];
        for (int i = 0; i < 10; i++) {
            counters[i] = new Counter(i);
        }
        for (int i = 0; i < 10; i++) {
            counters[i].print();
        }
    }

    static void q9(){
        Semaphore sem1 = Semaphore.request();
        Semaphore sem2 = Semaphore.request();
        Semaphore sem3 = Semaphore.request();

        if(sem3!=null){
            System.out.println("Semaphore request successful there are " + Semaphore.available() + " available");
        }
        else{
            System.out.println("Semaphore request failed there are " + Semaphore.available() + " available");
        }
        sem1.release();
        sem2.release();
        sem3 = Semaphore.request();

        if(sem3!=null){
            System.out.println("Semaphore request successful there are " + Semaphore.available() + " available");
        }
        else{
            System.out.println("Semaphore request failed there are " + Semaphore.available() + " available");
        }

    }

    static void q10(){
        q12();
    }

    static void q11(){
        q12();
    }

    static void q12(){
        PancakeRecipe pancake = new PancakeRecipe(20, 20, 12, 100, 100);
        pancake.makePancakes();
    }

}

class Animalum {
    public String species;
    public String name;
    public int age;

    public Animalum() {
        this.species = "Bearded Dragon";
        this.name = "Dovhkiin";
        this.age = 10;
    }

    public Animalum(String species, String name, int age) {
        this.species = species;
        this.name = name;
        this.age = age;
    }
}

class Car {
    private String model;
    private String color;
    private double price;

    public Car() {

    }

    public Car(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    void setModel(String model) {
        this.model = model;
    }

    void setColor(String color) {
        this.color = color;
    }

    void setPrice(int price) {
        this.price = price;
    }

    String getModel() {
        return this.model;
    }

    String getColor() {
        return this.color;
    }

    double getPrice() {
        return this.price;
    }

    void halfPrice() {
        this.price *= 0.5;
    }

}

class Counter{
    private int counter;
    static int numberOfCounters = 0;

    public Counter(int counter) {
        this.counter = counter;
        numberOfCounters++;
    }

    public Counter() {
        this.counter = 0;
        numberOfCounters++;
    }

    public int value() {
        return this.counter;
    }

    public void print(){
        System.out.println("Value: " + this.counter + "\nNumber of counters: " + numberOfCounters);
    }

    public void increment() {
        this.counter++;
    }

    public void decrement() {
        this.counter--;
    }
}
//very basic semaphore with no concurrent functionality
class Semaphore{
    private static int available = 2;

    private Semaphore (){

    }

    public static Semaphore request(){
        if (available > 0){
            available--;
            return new Semaphore();
        }
        return null;
    }

    public void release(){
        available++;
    }

    public static int available(){
        return available;
    }

}

class PancakeRecipe {
    public static double flour;
    public static double milk;
    public static double egg;
    public static double salt;
    public static double butter;

    public PancakeRecipe(double flour, double milk, double egg, double salt, double butter) {
        PancakeRecipe.flour = flour;
        PancakeRecipe.milk = milk;
        PancakeRecipe.egg = egg;
        PancakeRecipe.salt = salt;
        PancakeRecipe.butter = butter;
    }

    public boolean canMakePancakes(){
        if(flour>=3 && milk>=6 && egg>=3 && salt>=1.5 && butter>=3 ){
            return true;
        }
        else {
            return false;
        }
    }

    public void makePancakes(){
        if(canMakePancakes()){
            flour -= 3; milk -= 6; egg -= 3; salt -= 1.5; butter -= 3;
            System.out.println("Pancakes getting cooked");
            makePancakes();
        }
        else {
            System.out.println("Not enough ingredients left");
        }
    }
}