package JUV25D.PractiseUnits;

import java.math.BigInteger;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Random;

public class Practise1 {

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

        if (x!=y){
            System.out.println("Största nummer är: " + Math.max(x,y) + "\nMedelvärde är: " + (double)(x+y)/2);
        }
        else{
            System.out.println("Angivna nummer är samma värde: " + x + "\nMedelvärde är: " + y);
        }
    }

    static void q7(){
        NumberFormat nf = NumberFormat.getInstance(Locale.GERMAN); nf.setMaximumFractionDigits(2);

        while(true){
            double netto = 0;
            try {
                netto = nf.parse(System.console().readLine("Ange Summa: ")).doubleValue();
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            if(netto>0){
                while(true) {
                    int moms = Integer.parseInt(System.console().readLine("Ange Moms: ").replaceAll("[^\\d.]", ""));
                    if (moms == 6) { //for formating, one number need two tabs
                        System.out.println("Brutto summa: " + nf.format(netto - (netto/100) * moms) +
                                " kr\nMoms " + moms + "%\t\t: " + nf.format((netto/100) * moms) +
                                " kr\nTotal\t\t: " + nf.format(netto) + " kr");
                        break;
                    }
                    else if (moms == 12 || moms == 25) {
                        System.out.println("Brutto summa: " + nf.format(netto - (netto / 100) * moms) +
                                " kr\nMoms " + moms + "%\t: " + nf.format((netto / 100) * moms) +
                                " kr\nTotal\t\t: " + nf.format(netto) + " kr");
                        break;
                    }
                    else {
                        System.out.println("Ange en korrekt momssats (6%, 12% eller 25%)");
                    }
                }
                break;
            }
            else{
                System.out.println("Ange ett positivt nummer");
            }
        }
    }

    static void q8(){
        double grade = 42;
        double attendance = 11;
            if (grade>=70.0 && attendance>=80.0){
                System.out.println("Grattis! Du har klarat kursen.");
            }
            else {
                System.out.println("Tyvärr, du måste göra om kursen.");
            }
    }

    static void q9(){
        char grade = 'B';

        switch (grade) {
            case 'A': System.out.println("Utmärkt!"); break;
            case 'B': System.out.println("Bra Jobbat!"); break;
            case 'C', 'D' : System.out.println("Godkänt"); break;

            default: System.out.println("Underkänt."); break;
        }

    }

    static void q10(){
        calculateAverage(100, 50, 0);
    }

    static void q11(){
        for (int x = 1; x < 3; x++) {
            int a = x;
            if (a > 1)
                System.out.println("a > 1 (första)");
            a--;
            if (a > 1) {
                System.out.println("a > 1 (andra)");
            } else {
                System.out.println("a <= 1");
            }
        }
    }

    static void q12(){
        final char c = 'q';
        switch( c ) {
            case 'a':
                System.out.println("variable is 'a'");
                break;
            case 'b':
                System.out.println("variable is 'b'");
                break;
            default:
                System.out.println("variable is another letter");
                break;
        }
    }

    static double calculateAverage(double num1, double num2, double num3){
        double averageResult = (num1 + num2 + num3) / 3.0;
        if (averageResult > 90.0) {
            System.out.println("Mycket bra jobbat!");}
        else if (averageResult>=70 && averageResult<=90.0) {
            System.out.println("Bra jobbat!");
        }
        else{
            System.out.println("Öva lite mer");
        }
        return averageResult;
    }

}
