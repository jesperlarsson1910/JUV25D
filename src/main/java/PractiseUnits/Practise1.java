package PractiseUnits;

import java.io.Console;
import java.math.BigInteger;
import java.util.Random;

public class Practise1 {
    static void task(int p){
        switch(p){
            case 1: q1();
            case 2: q2();
            case 3: q3();
            case 4: q4();
            case 5: q5();
            case 6: q6();
            case 7: q7();
            case 8: q8();
            case 9: q9();
            case 10: q10();
            case 11: q11();
            case 12: q12();

                break;
            default:
                throw new IllegalStateException("Unexpected value: " + p);
        }
    }

    static void q1(){
        int x, y, z;

        x = 15;
        System.out.println(x);

        x = 10;
        y = x - 1;
        System.out.println(y);


        x = (int)120.954;
        y = x * 2;
        System.out.println(x + y);

        String s = "amm";
        s = "fäkt";
        System.out.println("An" + s + "a");

        String a = "an", b = "be", d= "do";
        System.out.println(a + b + a + d + b);

        x = 2; y = 4; z = 8;
        System.out.println( (x * y + z) / y - z + y / (x * z / x) );
    }

    static void q2(){
        BigInteger age = new  BigInteger("1000000000000000000000000000000000000000000000000000000000000000");
        double weight = Double.MAX_VALUE;
        String initial = "C";

        System.out.println("age: " + age +" Years\nweight: " + weight + " kg\ninitial: " + initial);
    }

    static void q3(){
        String name = System.console().readLine("Vad heter du: ");

        System.out.printf("Hej %s!", name);
    }

    static void q4(){
        double width = new Random().nextDouble(100);
        double height = new Random().nextDouble(100);
        double area = width * height;
        System.out.printf("Area of a rectangle with width %f and height %f is: %f", width,height,area);
    }

    static void q5(){
        int age = 17;
        if (age >= 18){
            System.out.println("Du är gammal nog att ta körkort!");
        }
        else{
            System.out.println("Du behöver vänta i " + (18-age) + " år till.");
        }
    }

    static void q6(){
        int x = Integer.parseInt(System.console().readLine("Första nummer: "));
        int y = Integer.parseInt(System.console().readLine("Andra nummer: "));

        if (x>y){
            System.out.println("Största nummer är: " + x + "%nMedelvärde är: " + (x+y)/2);
        }
        else if (x<y){
            System.out.println("Största nummer är: " + y + "%nMedelvärde är: " + (x+y)/2);
        }
        else{
            System.out.println("Angivna nummer är samma värde: " + x + "\nMedelvärde är: " + y);
        }
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
