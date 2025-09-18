package JUV25D.PractiseUnits;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Practise3 {

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
            case 13 -> q13();
            case 14 -> q14();
            case 15 -> q15();
            case 16 -> q16();
            case 17 -> q17();
            case 18 -> q18();
            case 19 -> q19();
            case 20 -> q20();

            default ->
                throw new IllegalStateException("Unexpected value: " + p);
        }
    }

    static void q1(){
        System.out.println(year("2021-11-02"));
    }

    static void q2(){
        System.out.println(daysBetween("2017-08-30", "2017-09-02"));
    }

    static void q3(){
        System.out.println(fToC(100));
    }

    static void q4(){
        System.out.println(sumAll(100));
    }

    static void q5(){
        System.out.println(reverseString(System.console().readLine("String: ")));
    }

    static void q6(){
        int n = (int) (Math.random()*1000)+1;
        if (isPrime(n)){
            System.out.println(n + " is a prime number");
        }
        else  {
            System.out.println(n + " is not a prime number");
        }
    }

    static void q7(){
        System.out.println(average(1));
        System.out.println(average(1,2));
        System.out.println(average(1,2,3));
        System.out.println(average(1,2,3,4));
        System.out.println(average(1,2,3,4,5));
    }

    static void q8(){
        System.out.println(factorial(10));
    }

    static void q9(){
        System.out.println(factorialRecursive(10));
    }

    static void q10(){
        System.out.println(fibonacciAtNRecursive(8));
        System.out.println(fibonacciAtN(8));
    }

    static void q11() {
        System.out.println(flipString("abcdef"));
    }

    static void q12(){
        String[] strings = {"a", "b", "c"};
        String[] stringsCopy = copyArray(strings);

        if (strings == stringsCopy) {
            System.out.println("We have failed to copy");
        }
        else if (Arrays.equals(strings, stringsCopy)) {
            System.out.println("We have successfully copied");
        }
        else {
            System.out.println("We have failed");
        }
    }

    static void q13(){
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int number = (int) (Math.random()*numbers.length);
        System.out.println(number + " > " + Arrays.toString(lessThan(numbers, number)));
        System.out.println(number + " > " + Arrays.toString(lessThanAlt(numbers, number)));
    }

    static void q14(){
        int length = Integer.parseInt(System.console().readLine("Array length: "));
        int[] numbers = intArray(length);
        String[] words = wordArray(length);


        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(bubbleSort(numbers)));
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(bubbleSort(words)));


    }

    static void q15(){
        String[] words = bubbleSort(wordArray(10));
        String[] words2 = bubbleSort(wordArray(10));
        System.out.println(Arrays.toString(merge(words, words2)));

        int[] numbers = bubbleSort(intArray(10));
        int[] numbers2 = bubbleSort(intArray(10));
        System.out.println(Arrays.toString(merge(numbers, numbers2)));
    }

    static void q16(){
        String[] words = wordArray(20);
        System.out.println(Arrays.toString(mergeSort(words)));

        int[] numbers = intArray(20);
        System.out.println(Arrays.toString(mergeSort(numbers)));
    }

    static void q17(){
        String str = System.console().readLine("Letter: ");

        try{
            if(isVowel(str)){
                System.out.println(str + " is a vowel");
            }
            else{
                System.out.println(str + " is not a vowel");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }

        char ch = System.console().readLine("Letter: ").charAt(0);

        try {
            if(isVowel(ch)){
                System.out.println(ch + " is a vowel");
            }
            else{
                System.out.println(ch + " is not a vowel");
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    static void q18(){

    }

    static void q19(){

    }

    static void q20(){

    }

    static int year (String date){

        return LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd")).getYear();
    }

    static long daysBetween (String start, String end){
        return 2 + LocalDate.parse(end, DateTimeFormatter.ofPattern("yyyy-MM-dd")).toEpochDay()
                - LocalDate.parse(start, DateTimeFormatter.ofPattern("yyyy-MM-dd")).toEpochDay();
    }

    static double fToC (double f){
        return (((f-32)*5)/9);
    }

    static int sumAll (int volume){
        int sum;
        for(sum = 0; volume > 0; volume--){
                    sum += volume;
                }
        return sum;
    }

    static String reverseString (String s){
        StringBuilder sb = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }

    static boolean isPrime (int n){
        if (n == 1) return true;
        else if (n%2==0) return false;
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    static double average (double a){
        return a;
    }

    static double average (double a, double b){
        return (a + b)/2;
    }

    static double average (double a, double b, double c){
        return (a + b + c)/3;
    }

    static double average (double a, double b, double c, double d){
        return (a + b + c + d)/4;
    }

    static double average (double a, double b, double c, double d, double e){
        return (a + b + c + d + e)/5;
    }

    static int factorial (int n){
        if (n == 0) return 1;
        for (int i = n-1; i > 0; i--){
            n *= i;
        }
        return n;
    }

    static int factorialRecursive(int n){
        if (n == 0) return 1;
        else return n * factorialRecursive(n-1);
    }

    static int fibonacciAtNRecursive (int n){
        if (n == 0) return 0;
        else if (n == 1) return 1;
        else {
            return fibonacciAtNRecursive(n - 1) + fibonacciAtNRecursive(n - 2);
        }
    }

    static int fibonacciAtN(int n){
        if (n <= 1) return n;
        else{
            int i = 1; int j = 1;
            for (int k = 1; k < n-1; k++){
                i += j;
                j = i-j;
            }
            return i;
        }
    }

    static String flipString (String s){
        if (s.isEmpty() || s.length() == 1) {
            return s;
        } else{
        return flipString(s.substring(1)) +  s.charAt(0);
        }
    }

    static <E> E[] copyArray(E[] array){
        return Arrays.copyOf(array, array.length);
    }

    //one loop only always returns an array of the same size as the input
    static int[] lessThan(int[] numbers, int largest){
        int[] result = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < largest){
                result[i] = numbers[i];
            }
        }
        return result;
    }

    // takes two loops so we can return a correctly sized array
    static int[] lessThanAlt(int[] numbers, int largest){
        int counter = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < largest){
                counter++;
            }
        }
        int[] result = new int[counter];
        counter = 0;
        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] < largest){
                result[i] = numbers[i];
                counter++;
            }
        }
        return result;
    }
    static int[] intArray (int length){
        int[] numbers = new int[length];
        String[] words = new String[length];

        for(int i = 0; i < numbers.length; i++){
            numbers[i] = (int) (Math.random()*i);
        }
        return numbers;
    }

    static String[] wordArray (int length){
        String[] words = new String[length];
        StringBuilder builder = new StringBuilder(5);
        Random random = new Random();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < 5; j++){
                builder.append((char) (random.nextInt(65,90)));
            }
            words[i] = builder.toString();
            builder.delete(0, builder.length());
        }
        return words;
    }


    static <E extends Comparable<E>> E[] bubbleSort (E[] array){
        for (int i = 0; i < array.length-1; i++){
            for (int x = 0; x < array.length - i - 1; x++){
                if(array[x].compareTo(array[x+1])>0){
                    E temp = array[x];
                    array[x] = array[x+1];
                    array[x+1] = temp;
                }
            }
        }
        return array;
    }

    static int[] bubbleSort (int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int x = 0; x < array.length - i - 1; x++) {
                if (array[x] > array[x+1]) {
                    int temp = array[x];
                    array[x] = array[x+1];
                    array[x+1] = temp;
                }
            }
        }
        return array;
    }

    static int[] merge (int[] array1, int[] array2){
        int[] mergedArray = new int[array1.length + array2.length];
        int left = array1.length; int right = array2.length;
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            }
            else {
                mergedArray[k++] = array2[j++];
            }
        }
        while (i < left) {
            mergedArray[k++] = array1[i++];
        }
        while (j < right) {
            mergedArray[k++] = array2[j++];
        }
        return mergedArray;
    }


    //Generic and supports arrays of different length
    static  <E extends Comparable<E>> E[] merge (E[] array1, E[] array2){
        E[] mergedArray = (E[])new Comparable[array1.length + array2.length];
        int left = array1.length; int right = array2.length;
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (array1[i].compareTo(array2[j]) <= 0) {
                mergedArray[k++] = array1[i++];
            }
            else {
                mergedArray[k++] = array2[j++];
            }
        }
        while (i < left) {
            mergedArray[k++] = array1[i++];
        }
        while (j < right) {
            mergedArray[k++] = array2[j++];
        }
        return mergedArray;
    }

    static int[] mergeSort (int[] input){
        if (input.length == 1){
            return input;
        }
        else {
            int middle = input.length/2;
            int[] left = new int[middle];
            int[] right = new int[input.length-middle];

            for (int i = 0; i < middle; i++){
                left[i] = input[i];
            }
            for (int i = middle; i < input.length; i++){
                right[i-middle] = input[i];
            }

            return merge(mergeSort(left), mergeSort(right));
        }
    }

    static <E extends Comparable<E>> E[] mergeSort (E[] input){
        if (input.length == 1){
            return input;
        }
        else {
            int middle = input.length/2;
            E[] left = (E[]) new Comparable[middle];
            E[] right = (E[]) new Comparable[input.length-middle];

            for (int i = 0; i < middle; i++){
                left[i] = input[i];
            }
            for (int i = middle; i < input.length; i++){
                right[i-middle] = input[i];
            }

            return merge(mergeSort(left), mergeSort(right));
        }
    }

    static boolean isVowel(char ch){
        if (!((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))){
            throw new IllegalArgumentException("Single latin letter expected");
        }
        char[] vowels = {'a','e','i','o','u'};
        for (char vowel : vowels){
            if (ch == vowel){
                return true;
            }
        }
        return false;
    }

    static boolean isVowel(String ch){
        if (ch.length() > 1
                || (ch.codePointCount(0, 0) >= 'a' && ch.codePointCount(0, 0) <= 'z')
                || (ch.codePointCount(0, 0) >= 'A' && ch.codePointCount(0, 0) <= 'Z')){
            throw new IllegalArgumentException("Single latin letter expected");
        }
        char[] vowels = {'a','e','i','o','u'};
        for (char vowel : vowels){
            if (ch.charAt(0) == (vowel)){
                return true;
            }
        }
        return false;
    }
}
