package JUV25D.PractiseUnits;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String key = "y";
        while (!key.equalsIgnoreCase("n")) {
            int p = Integer.parseInt(System.console().readLine("Practise: "));
            switch (p) {
                case 1 -> Practise1.task(askTask(1));
                case 2 -> Practise2.task(askTask(2));
                case 3 -> Practise3.task(askTask(3));

                default -> System.out.println("Wrong input");
            }

            key = System.console().readLine("%nContinue? y/n ");
        }
    }
    private static int askTask(int practise){
        return Integer.parseInt(System.console().readLine("Practise " + practise + " Task: "));
    }
}