package JUV25D.PractiseUnits;

import javax.print.StreamPrintService;
import javax.swing.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Practise7 {

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

            default ->
                    throw new IllegalStateException("Unexpected value: " + p);
        }
    }

    static void q1(){
        var countries = countryList();
    }

    static void q2(){
        var countries = countryList();
        List<CountryStat> result = new ArrayList<>();

        result = countries.stream().filter(countryStat -> countries.indexOf(countryStat) == 0
                || countries.indexOf(countryStat) == countries.size()-1).toList();

        result.forEach(System.out::println);
    }

    static void q3(){
        var  countries = countryList();
        List<CountryStat> result = new ArrayList<>();

        result =  countries.stream().sorted(Comparator.comparing(c -> c.name)).toList();

        result.forEach(System.out::println);
    }

    static void q4(){
        var  countries = countryList();
        List<CountryStat> result = new ArrayList<>();

        result = countries.stream().sorted((c1, c2) -> Double.compare(c2.population, c1.population)).toList();

        result.forEach(System.out::println);
    }

    static void q5(){
        var  countries = countryList();

        System.out.println(countries.stream().sorted((c1, c2) -> Double.compare(c2.population, c1.population)).findFirst().get().population);


    }

    static void q6(){
        var  countries = countryList();
        double averageArea = countries.stream().mapToDouble(CountryStat::area).average().getAsDouble();
        System.out.println(averageArea);

        countries.stream().filter(c1 -> (double) c1.area() < averageArea ).toList().forEach(System.out::println);
    }

    static void q7(){
        var  countries = countryList();

        countries.stream().filter(c1 -> c1.population < 5).toList().forEach(System.out::println);
    }

    static void q8(){
        var  countries = countryList();

        int tenk = countries.stream().filter(c1 -> c1.population > 0.01).toList().size();
        System.out.println(tenk);
        int houndredk = countries.stream().filter(c1 -> c1.population > 0.1).toList().size();
        System.out.println(houndredk);
        int onem = countries.stream().filter(c1 -> c1.population > 1).toList().size();
        System.out.println(onem);
    }

    static void q9(){
        var  countries = countryList();

        countries.stream().filter(c1 -> c1.name.charAt(0) == c1.capital.charAt(0)).toList().forEach(System.out::println);
    }

    static void q10(){
        var  countries = countryList();

        countries.stream().filter(c1 -> c1.name.length() > c1.capital.length()).toList().forEach(System.out::println);
    }

    static void q11(){
        var  countries = countryList();
        List<CountryStat> result = new ArrayList<>();

        countries.stream().sorted((c1, c2) -> Double.compare(c2.population, c1.population)).limit(5).forEach(System.out::println);
    }

    static void q12(){
        var  countries = countryList();

        countries.stream().filter(c1 -> c1.population > 7).sorted(Comparator.comparing(c -> c.population)).limit(3).toList().forEach(System.out::println);
    }

    static void q13(){
        var  countries = countryList();

        countries.stream().filter(c1 -> c1.area > 500000).sorted(Comparator.comparing(c -> c.name)).limit(3).toList().forEach(System.out::println);
    }

    static void q14(){
        var  countries = countryList();

        countries.stream().collect(Collectors.groupingBy(c -> c.name.charAt(0), Collectors.counting())).forEach((letter, count) -> System.out.println("Countries starting with '" + letter + "': " + count));;
    }

    static void q15(){
        var  countries = countryList();
        countries.stream()
                .collect(Collectors.toMap(k -> (Math.floor(k.population)), v -> List.of("-" + v.name + "\n"), (v1, v2) -> Stream.concat(v1.stream(), v2.stream()).toList())).
                entrySet().stream().sorted(Map.Entry.comparingByKey()).
                forEach(m -> System.out.println("Countries with " + m.getKey() + "m population:\n" + m.getValue().stream().sorted().collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)));
    }

    static void q16(){
        var  countries = countryList();

        countries.stream().forEach(v -> System.out.println(v.name + ": " + (int) (v.population * 1000000)));

        countries.stream().sorted(Comparator.comparing(c -> (c.population * 1000000)/c.area)).forEach(c -> System.out.println(c.name + ": " + (int) (c.population * 1000000)/c.area + " people per km2"));
    }

    static void q17(){
        var countries = countryList();

        countries.stream().sorted(Comparator.comparing(c -> new StringBuilder(c.capital).reverse())).forEach(c -> System.out.println(c.name));
    }

    static void q18(){
        var  countries = countryList();

        double low = countries.stream().sorted(Comparator.comparing(CountryStat::area)).limit(6).mapToDouble(CountryStat::population).sum();
        double high = countries.stream().sorted(Comparator.comparing(CountryStat::area).reversed()).limit(3).mapToDouble(CountryStat::population).sum();
    }

    static void q19(){
        var  countries = countryList();

        double sumPop = countries.stream().filter(c -> c.name.length() == 7).mapToDouble(CountryStat::population).sum();
    }

    interface isFirstorLast<T> {
        boolean isFirstorLast(List<T> list, T object);
    }


    record CountryStat(
           String name,
           String capital,
           double population,
           int area
    ){};

    static List<CountryStat> countryList(){
        List<CountryStat> list = new ArrayList<>();

        list.add(new CountryStat("Sverige", "Stockholm", 10.07, 450295));
        list.add(new CountryStat("Norge", "Oslo", 5.27, 323802));
        list.add(new CountryStat("Island", "Reykjavik", 0.33, 102775));
        list.add(new CountryStat("Danmark", "Köpenhamn", 5.75, 42931));
        list.add(new CountryStat("Finland", "Helsinki", 5.51, 338424));
        list.add(new CountryStat("Belgien", "Bryssel", 11.30, 30528));
        list.add(new CountryStat("Tyskland", "Berlin", 82.18, 357168));
        list.add(new CountryStat("Frankrike", "Paris", 66.99, 640679));
        list.add(new CountryStat("Storbritannien", "London", 60.80, 209331));
        list.add(new CountryStat("Niue", "Alofi", 0.0016, 261));
        list.add(new CountryStat("Mongoliet", "Ulan Batar", 3.08, 1566000));
        list.add(new CountryStat("Polen", "Warszawa", 38.63, 312679));
        list.add(new CountryStat("Spanien", "Madrid", 46.5, 505990));
        list.add(new CountryStat("Portugal", "Lissabon", 10.31, 92212));
        list.add(new CountryStat("Italien", "Rom", 60.59, 301338));
        list.add(new CountryStat("Grekland", "Aten", 11.18, 131957));
        list.add(new CountryStat("Luxemburg", "Luxemburg", 0.58, 2586));
        list.add(new CountryStat("Liechtenstein", "Vaduz", 0.038, 160));

        return list;
    }
}
