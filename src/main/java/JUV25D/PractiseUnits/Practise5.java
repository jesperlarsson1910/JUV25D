package JUV25D.PractiseUnits;

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

    }

    static void q6(){

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