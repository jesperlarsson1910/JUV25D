package JUV25D.PractiseUnits;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Practise8 {

    static void task(int p) {
        switch (p) {
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

            default -> throw new IllegalStateException("Unexpected value: " + p);
        }
    }

    static String minKatt = "min katt har tre konkatenerade kanter";
    static String hands = "hands jumbled terrific old-fashioned grass highfalutin stupendous daughter feigned skirt modern truthful";

    static void q1() {
        System.out.println(Pattern.compile("kat").matcher(minKatt).find());
    }

    static void q2() {
        Matcher m = Pattern.compile("k(?:a[nt]|on)").matcher(minKatt);

        while (m.find()) {
            System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1));
        }

    }

    static void q3() {
        Matcher m = Pattern.compile("a.").matcher(minKatt);

        while (m.find()) {
            System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1) + " : " + m.group());
        }

    }

    static void q4() {
        Matcher m = Pattern.compile("[^t]\\s*t\\s*[^t]").matcher(minKatt);

        while (m.find()) {
            System.out.println("Pattern found from " + m.start() + " to " + (m.end() - 1) + " : " + m.group());
        }
    }

    static void q5() {
        Matcher m = Pattern.compile("as|od").matcher(hands);

        System.out.println("Pattern found " + m.results().count() + " times");

    }

    static void q6() {
        Matcher m = Pattern.compile("[ae][nds]").matcher(hands);

        System.out.println("Pattern found " + m.results().count() + " times");
    }

    static void q7() {
        Pattern starts = Pattern.compile("\\b[dh]");
        Pattern ends = Pattern.compile("s\\b");

        Matcher mS = starts.matcher(hands);
        Matcher mE = ends.matcher(hands);

        System.out.println(mS.results().count() + " starts and ends " + mE.results().count());
    }

    static void q8() {
        Matcher m = Pattern.compile("\\b.[aeiouyåäö]").matcher(hands);

        System.out.println("Pattern found " + m.results().count() + " times");
    }

    static void q9() {
        Matcher m = Pattern.compile("(\\w)\\1").matcher(hands);

        while (m.find()) {
            System.out.println("Pattern found " + m.start() + " to " + (m.end() - 1) + " : " + m.group());
        }
    }

    static void q10() {
        Matcher m = Pattern.compile("\\w{3}").matcher(hands);

        while (m.find()) {
            System.out.println("Pattern found " + m.start() + " to " + (m.end() - 1) + " : " + m.group());
        }
    }

    static void q11() {
        System.out.println(hands.replaceAll("l", "1").replaceAll("o", "0"));
    }

    static void q12() {
        Matcher m = Pattern.compile("\\b\\w{6}\\b").matcher(hands);

        System.out.println("Pattern found " + m.results().count() + " times");
    }

    static void q13() {
        Matcher m  = Pattern.compile("\\b.?[^ae].?\\b").matcher(hands);

        System.out.println("Pattern found " + m.results().count() + " times");
    }

    static void q14() {
        Pattern p = Pattern.compile("\\..*[a-z]");
        Matcher m = p.matcher(hands);

        System.out.println(m.replaceAll(s -> s.group().toUpperCase()));
    }
}

