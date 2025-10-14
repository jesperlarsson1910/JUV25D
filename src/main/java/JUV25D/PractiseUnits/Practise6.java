package JUV25D.PractiseUnits;

import java.util.*;

public class Practise6 {


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

            default ->
                    throw new IllegalStateException("Unexpected value: " + p);
        }
    }

    static void q1(){
        List<String> names = Arrays.asList("Adam", "Bert", "Carl", "Dennis", "Edvin");

        names.remove("Edvin");
        names.add("Erik");

        for(String name : names){
            System.out.println(name);
        }
        System.out.println(names.getFirst());
        System.out.println(names.getLast());

    }

    static void q2(){
        Set<String> words = Set.of(IO.readln("Input: ").split(" "));

        System.out.println(words.size());
    }

    static void q3(){
        Map<String, String> phonebook = Map.of("Adam", "040416052", "Bert", "0732788479", "Carl", "08393856");

        for (Map.Entry<String, String> entry : phonebook.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println(phonebook.get(IO.readln("Namn: ")));


    }

    static void q4(){
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            numbers.add((int) (Math.random()*100));
        }

        Collections.sort(numbers);
        System.out.println(numbers);

        //Treeset

    }

    static void q5(){
        List<String> words = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            words.add(IO.readln("Input: "));
        }
        System.out.println(words);
        Iterator<String> iterator = words.iterator();
        while(iterator.hasNext()){
            String s = iterator.next();
            if(s.length() < 4){
                iterator.remove();
            }
        }
        System.out.println(words);
    }

    static void q6(){
        Map<String, Integer> map = new HashMap<>();

        String[] ipsum = loremIpsum();
        for(String str : ipsum){
            str = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();
            if(map.containsKey(str)){
                map.replace(str, map.get(str)+1);
            }
            else{
                map.put(str, 1);
            }
        }

        System.out.println(map);
    }

    static void q7(){
        List<String> names = new ArrayList<>();
        names.add("Jacob");
        names.add("Evelyn");
        names.add("Julie");
        names.add("Nec");
        names.add("Peter");
        names.add("Sus");
        names.add("Sussex");

        String name = IO.readln("Name: ");

        if(names.contains(name)){
            System.out.println(name + " is present in list");
        }
        else{
            System.out.println(name + " is not present in list");
        }

        TreeSet<String> set = new TreeSet<>(names);
        TreeMap<String, Boolean> map = new TreeMap<>();

        boolean setB = set.contains(name);
        boolean mapB = map.containsKey(name);
    }

    static void q8(){
        Map<String, Integer> map = new HashMap<>();
        map.put("Jacob", 1);
        map.put("Evelyn", 2);
        map.put("Julie", 3);
        map.put("Nec", 4);

        System.out.println(map.getOrDefault("Jacob", 0));
        System.out.println(map.getOrDefault("Boris", 0));
    }

    static void q9(){
        List<String> ipsum = Arrays.stream(loremIpsum()).toList();
        Map<Integer, List<String>> map = new HashMap<>();

        for(int i = 0; i < ipsum.size(); i++){
            map.putIfAbsent(ipsum.get(i).length(), new ArrayList<>());
            map.get(ipsum.get(i).length()).add(ipsum.get(i));
        }

        for(Map.Entry<Integer, List<String>> entry : map.entrySet()){
            System.out.println("Length: " + entry.getKey() + ": #" + entry.getValue().size());
        }

    }

    static String[] loremIpsum(){
        String lorem = "\n" +
                "\n" +
                "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam a ipsum molestie, posuere augue ut, facilisis libero. Nunc venenatis, augue et elementum vehicula, neque est gravida ex, in egestas eros odio id metus. Etiam ultrices sed diam ac pretium. Suspendisse in dignissim enim. Nullam ornare mi sed metus suscipit imperdiet. Morbi nibh lacus, cursus vitae tortor sit amet, tincidunt convallis mauris. Nullam volutpat in ante vel tempus.\n" +
                "\n" +
                "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Maecenas et elementum magna. Morbi malesuada consequat nisi vel faucibus. Vivamus mattis posuere justo, quis vehicula tortor imperdiet in. In hac habitasse platea dictumst. Nam eu rhoncus arcu, in ultrices diam. In consequat porta lectus, a ultrices arcu semper sit amet. Class aptent taciti sociosqu ad litora torquent per conubia nostra, per inceptos himenaeos. Curabitur justo lectus, molestie eu ligula quis, luctus placerat erat.\n" +
                "\n" +
                "Proin quam velit, ultrices et viverra eu, eleifend vel turpis. Nullam in consectetur nisl, a fringilla augue. Sed facilisis nunc nibh, ac eleifend tellus laoreet nec. Quisque aliquam purus massa, a sagittis mauris venenatis sed. Donec sit amet euismod lacus. Mauris ac leo quis risus ultrices congue quis commodo tortor. Curabitur ornare lorem non dui ullamcorper efficitur. Mauris malesuada consectetur imperdiet. Sed nec iaculis massa. In tellus metus, tristique eu nulla eget, bibendum suscipit arcu. Praesent mollis enim vitae iaculis tristique. Mauris iaculis dui eu urna blandit, sit amet porttitor nunc viverra.\n" +
                "\n" +
                "Proin hendrerit sem risus, quis faucibus quam consectetur id. Cras aliquam, tellus vitae condimentum dignissim, ante est elementum lectus, vel pulvinar nunc tortor eu lectus. Proin vel erat non justo elementum porta vitae porttitor mauris. Nullam ullamcorper quam nibh, eu pretium quam commodo eu. Quisque malesuada dolor et nisi ullamcorper tempor. Maecenas tincidunt est et placerat gravida. In hac habitasse platea dictumst. Maecenas ultricies metus et risus eleifend sodales. Nam non suscipit justo.\n" +
                "\n" +
                "Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Fusce urna dolor, tristique eu aliquam id, feugiat vitae tellus. Aliquam id dolor est. Ut velit ex, vestibulum a volutpat ut, tincidunt vel turpis. Sed a tincidunt odio. Vivamus vehicula leo ultricies dignissim tristique. Quisque vitae scelerisque erat, eu condimentum lectus. Ut et nibh facilisis, iaculis lorem sit amet, elementum lectus. Suspendisse potenti.";

        return lorem.replaceAll("\\p{Punct}", "").split(" ");
    }
}


