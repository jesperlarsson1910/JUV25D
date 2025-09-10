package JUV25D.PractiseUnits;

import java.util.Arrays;

public class Practise2 {

    static void task(int p){
        switch(p){
            case 1: q1();   break;
            case 2: q2();   break;
            case 3: q3();   break;
            case 4: q4();   break;
            case 5: q5();   break;
            case 6: q6();   break;
            case 7: q7();   break;
            case 8: q8();   break;
            case 9: q9();   break;
            case 10: q10(); break;
            case 11: q11(); break;
            case 12: q12(); break;
            case 13: q13(); break;
            case 14: q14(); break;

            default:
                throw new IllegalStateException("Unexpected value: " + p);
        }
    }

    static void q1(){
        for(int i = 0; i < 16; i++){
            System.out.println(i+1);
        }
    }

    static void q2(){
        int num = 65536;
        for(int numH = num; numH>2; numH = numH >> 1){
            System.out.println(numH);
        }
    }

    static void q3(){
        for(int i = 20; i>2; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static void q4(){
        StringBuilder allString = new StringBuilder();
        while(true){
            String input = System.console().readLine("Sträng: ");
            allString.append(input);
            if(input.equals(".")||input.isEmpty()){
                break;
            }
            else {
                System.out.println(allString.toString());
                allString.append(" ");
            }
        }
    }

    static void q5(){
        int num = Integer.parseInt(System.console().readLine("Nummer: "));
            if(num <= 2){
                System.out.println("Behöver ett nummer större än 2");
            }
            else{
                while(num>2){
                    System.out.println(num);
                    if(num%2==0){
                        num = num/2;
                    }
                    else{
                        num = (num*3)+1;
                    }
                }
            }


    }

    static void q6(){
        int hemligtTal = (int) (Math.random()*100);
        int gissningar = 0;

        while(true){
            int gissning = Integer.parseInt(System.console().readLine("Gissning: "));
            gissningar++;
            if(gissning>hemligtTal){
                System.out.println("För högt");
            }
            else if(gissning < hemligtTal){
                System.out.println("För lågt");
            }
            else{
                System.out.println("Du gissade rätt tal efter " + gissningar + " försök");
                break;
            }
        }
    }

    static void q7(){
        for(int y=0; y<5; y++) {
            for(int x=0; x<5; x++) {
                if( x == y )
                    System.out.println("#");
                else
                    System.out.println(".");
            }
            System.out.println("");
        }
    }

    static void q8(){
        int[] numArray = new int[5];
            for(int i=0; i<5; i++){
                numArray[i] = (i+1)*10;
            }
            for(int j=0; j<5; j++){
                System.out.println(numArray[j]);
            }
    }

    static void q9(){
        String message = "Hej Java!";
        int index = 0;

        while(index<message.length()){
            System.out.println(message.charAt(index));
            index++;
        }
    }

    static void q10(){
        int[] numbers = {5, 12, 8, 21, 3};
        int sum  = 0, biggest = numbers[0], smallest = numbers[0];
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
            if(numbers[i]>biggest){
                biggest = numbers[i];
            }
            else if(numbers[i]<smallest){
                smallest = numbers[i];
            }
        }
        System.out.println("Summa: " + sum);
        System.out.println("Störstaa: " + biggest);
        System.out.println("Minsta: " + smallest);
    }

    static void q11() {
        record book(String title, int pages){}

        String[] titles = {"A Tale of Two Cities", "Le Petit Prince", "O Alquimista", "Harry Potter and the Philosopher's Stone", "And Then There Were None", "紅樓夢", "The Hobbit", "Alice's Adventures in Wonderland"};
        int[] bookPages = {446, 100, 167, 223, 384, 284, 300, 234};

        book[] books = new book[titles.length];

        for(int i=0; i<titles.length; i++){
            books[i] = new book(titles[i], bookPages[i]);
        }

        book topBook = books[0];

        for(int i=0; i<books.length; i++){
            if(books[i].pages>topBook.pages) {
                topBook = books[i];
            }
        }

        for(int i=0; i<books.length; i++){
            System.out.println(books[i].title + " - " + books[i].pages + " pages");
        }

        System.out.println("The longest book is: " + topBook.title + " - " + topBook.pages  + " pages");
    }

    static void q12(){

    }

    static void q13(){

    }

    static void q14(){


    }
}
