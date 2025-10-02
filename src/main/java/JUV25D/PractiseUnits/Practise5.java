package JUV25D.PractiseUnits;

import java.util.ArrayList;

public class Practise5 {

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

    static void q1(){
        Animal animal = new Animal("Lasse", 96);
        Animal lizard  = new Lizard("Lasse", 96);

        if(animal.equals(lizard)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }

    static void q2(){
        Animal per = new  Lizard("Per", 82);

        per.eat();
        per.sleep();
    }

    static void q3(){
        Animal ola = new  Lizard("Ola", 4);

        ola.eat();
    }

    static void q4(){

    }

    static void q5(){
        //Vehicle vehicle = new Vehicle("Vehicle maker");
        Bicycle bicycle = new Bicycle("Bicycle maker");
        Car car = new Car("Car maker");
        Boat boat = new Boat("Boat maker");
        Motorboat motorboat = new Motorboat("Motorboat maker");
        Sailboat sailboat = new Sailboat("Sailboat maker");

        //vehicle.goTo("Vehicle shop");
        bicycle.goTo("Bicycle shop");
        car.goTo("Car shop");
        boat.goTo("Boat shop");
        motorboat.goTo("Motorboat shop");
        sailboat.goTo("Sailboat shop");
    }

    static void q6(){
        q5();
    }

    static void q7(){

    }

    static void q8(){

    }

    static void q9(){

    }

    static void q10(){

    }

    static void q11(){

    }

    static void q12(){
        ArrayList<Noisemaker> noisemakers = new ArrayList<Noisemaker>();

        Snake snake = new Snake("Slang", 2); noisemakers.add(snake);
        Dog dog = new Dog("Hasse", 5);  noisemakers.add(dog);
        Robot robot = new Robot();  noisemakers.add(robot);

        for( Noisemaker n : noisemakers ){
            n.makeNoise();
        }

    }

}

class Animal {

    private  String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void  eat(){
        System.out.println(name + " is eating");
    }
    public void sleep(){
        System.out.println(name + " is sleeping");
    }
}

class Reptile extends Animal{
    private String name;
    private int age;

    public Reptile(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }
}

class Lizard extends Reptile{
    private String name;
    private int age;

    public Lizard(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public void eat(){
        System.out.println(name + " is snacking");
        super.eat();
    }
}

class Snake extends Reptile implements Noisemaker{
    private String name;
    private int age;

    public Snake(String name, int age) {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public void makeNoise(){
        System.out.println(name + " is making noise");
    }
}

class Mammal extends Animal
{
    private String name;
    private int age;

    public Mammal(String name, int age)
    {
        super(name, age);
    }
}

class Dog extends Mammal implements Noisemaker{
    private String name;
    private int age;

    public Dog(String name, int age)
    {
        super(name, age);
        this.name = name;
        this.age = age;
    }

    public void makeNoise(){
        System.out.println(name + " is making noise");
    }
}

class Cat extends Mammal {
    private String name;
    private int age;

    public Cat(String name, int age)
    {
        super(name, age);
    }
}

abstract class Vehicle {
    private final String manufacturer;

    public Vehicle(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public void goTo(String destination){
        System.out.println("Färdas till " + destination);
    }
}

class Bicycle extends Vehicle {

    public Bicycle(String manufacturer){
        super(manufacturer);
    }

    public void goTo(String destination){
        System.out.println("Färdas med Bicycle till " + destination);
    }
}

class Car extends Vehicle {

    public Car(String manufacturer){
        super(manufacturer);
    }

    public void goTo(String destination){
        System.out.println("Färdas med Car till " + destination);
    }
}

class Boat extends Vehicle {

    public Boat(String manufacturer){
        super(manufacturer);
    }

    public void goTo(String destination){
        System.out.println("Färdas med Boat till " + destination);
    }
}

class Motorboat extends Boat {

    public Motorboat(String manufacturer){
        super(manufacturer);
    }

    public void goTo(String destination){
        System.out.println("Färdas med Motorboat till " + destination);
    }
}

class Sailboat extends Boat {

    public Sailboat(String manufacturer){
        super(manufacturer);
    }

    public void goTo(String destination){
        System.out.println("Färdas med Sailboat till " + destination);
    }
}

class Robot implements Noisemaker{

    public void makeNoise(){
        System.out.println("The robot is making noise");
    }
}

abstract class AbstractClass{

    abstract void abstractMethod();

}

class AbstractSubClass extends AbstractClass{
    @Override
    public void abstractMethod() {
        System.out.println("Very abstract");
    }
}

interface Noisemaker{

    void makeNoise();
}