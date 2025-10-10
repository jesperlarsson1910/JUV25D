package JUV25D.PractiseUnits;

import java.util.*;

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

            default ->
                    throw new IllegalStateException("Unexpected value: " + p);
        }
    }
    static void q1(){

    }

    static void q2(){
        List<Double> doubleList = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            doubleList.add(Math.random()*10.00);
        }
        for(double d:doubleList){
            System.out.println(d);
        }
    }

    static void q3(){
        Dictionary<String, Animal> dict = new Hashtable<>();

        Animal apa = new Animal("Banarne", 10); dict.put("Apa", apa);
        Animal anka = new Animal("Anders", 50); dict.put("Anka", anka);
        Animal katt = new Animal("Pelle", 30); dict.put("Katt", katt);
        Animal ko = new Animal("Mu", 30); dict.put("Ko", ko);
        Animal aelg = new Animal("Helge", 80); dict.put("Aelg", aelg);

    }

    static void q4(){
        String s = IO.readln("Input: ");
        int n = Integer.parseInt(s);

        Trio trioString = new Trio(s);
        Trio trioInt = new Trio(n);

        trioString.printClass();
        trioInt.printClass();
    }

    static void q5(){
        Trio trioVehicle = new Trio<>(new Car("Volvo"),new Boat("Stena"), new Bicycle("Kronan"));

        trioVehicle.printClass();
    }

    static void q6(){
        String[] sA = new String[3];
        for(int i = 0; i < sA.length; i++){
            sA[i] = IO.readln("Input " + (i+1) + ": ");
        }
        Stack myStack = new Stack();
        for(String s: sA){
            myStack.push(s);
        }
        for(int i = 0; i < 3; i++){
            System.out.println(myStack.pop());
            if(myStack.size() == 0){
                System.out.println("Stack is empty");
            }
        }
    }

    static void q7(){
        String[] sA = new String[5];
        for(int i = 0; i < sA.length; i++){
            sA[i] = IO.readln("Input " + (i+1) + ": ");
        }
        DLList dlList = new DLList();
        for(String s: sA){
            dlList.put(s);
        }
        System.out.println("Forward");
        DNode temp = dlList.getFirst();
        System.out.println(temp.object);
        for (int i = 0; i < dlList.getSize()-1; i++){
            temp = temp.getNext();
            System.out.println(temp.object);
        }
        System.out.println("Backward");
        temp = dlList.getLast();
        System.out.println(temp.object);
        for (int i = 0; i < dlList.getSize()-1; i++){
            temp = temp.getPrevious();
            System.out.println(temp.object);
        }
    }
}

class Safe {
    List<Iterable> content = new ArrayList<>();

    public <T extends Iterable> void store(T object){
        content.add(object);
    }

    public Object retrieve(){
        if(content.isEmpty())
            return null;
        Object retObject = content.get(0);
        content.remove(0);
        return retObject;
    }
}

class Trio<T>{
    public T one;
    public T two;
    public T three;

    public Trio(T object){
        this.one = object;
        this.two = object;
        this.three = object;
    }

    public Trio(Vehicle v1, Vehicle v2, Vehicle v3){
        this.one = (T) v1;
        this.two = (T) v2;
        this.three = (T) v3;
    }

    public void printClass(){
        System.out.println("one: " + one.getClass());
        System.out.println("two: " + two.getClass());
        System.out.println("three: " + three.getClass());
    }
}

class Stack<T>{
    private List<T> list;

    public int size(){
        return list.size();
    }

    public Stack(){
        list = new ArrayList<>();
    }

    public void push (T object){
        list.add(object);
    }

    public T pop(){
        if(!list.isEmpty()) {
            return list.remove(0);
        }
        return null;
    }
}

class DNode<T>{
    public DNode previous;
    public DNode next;
    public T object;

    public DNode(){
        previous = null;
        next = null;
        object = null;
    }

    public DNode (T object, DNode previous){
        this.object = object;
        this.previous = previous;
        next = null;
    }

    public DNode (T object, DNode previous, DNode next){
        this.object = object;
        this.previous = previous;
        this.next = next;
    }

    public void setNext(DNode next){
        this.next = next;
    }

    public void setPrevious(DNode previous){
        this.previous = previous;
    }

    public void setObject(T object){
        this.object = object;
    }

    public T getObject(){
        return object;
    }

    public DNode getPrevious(){
        return previous;
    }

    public DNode getNext(){
        return next;
    }
}

class DLList<T>{
    private int  size;
    private DNode<T> first;
    private DNode<T> last;

    public DLList(){
        first = null;
        last = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void put(T  object){
        if(size == 0){
            DNode temp = new DNode<>(object, null);
            first = last = temp;
            size++;
        }
        else{
            DNode temp = new DNode<>(object, get(size-1));
            last.setNext(temp);
            last = temp;
            size++;
        }

    }

    public T getObject(int index){
        if(index < 0 || index >= size)
            return null;

        else{
            DNode<T> temp = first;
            for(int i = 0; i < index; i++){
            temp = temp.next;}
            return temp.object;
        }
    }

    public T getFirstObject(){
        return first.object;
    }

    public T getLastObject(){
        return last.object;
    }

    public DNode get(int index){
        if(index < 0 || index >= size)
            return null;

        else{
            DNode<T> temp = first;
            for(int i = 0; i < index; i++){
                temp = temp.next;}
            return temp;
        }
    }

    public DNode getFirst(){
        return first;
    }

    public DNode getLast(){
        return last;
    }

    public void remove(int index){
        if(index < 0 || index >= size) {
            //
        }
        else if(index == 0){
            first = first.next;
            first.previous = null;
            size--;
        }
        else if(index == size - 1){
            last = last.previous;
            last.next = null;
            size--;
        }
        else{
            DNode<T> temp = first;
            for(int i = 0; i < index; i++){
                temp = temp.next;
            }
            temp.next = temp.previous;
            temp.previous.next = temp.next;
            temp.next.previous = temp.previous;
            size--;
        }
    }

    public void clear(){
        first = null;
        last = null;
        size = 0;
    }

    public T retrieve(int index){
        T temp =  getObject(index);
        remove(index);
        return temp;
    }

    public T retrieveFirst(){
        T temp = getFirstObject();
        remove(0);
        return temp;
    }
    public T retrieveLast(){
        T temp = getLastObject();
        remove(size - 1);
        return temp;
    }
}