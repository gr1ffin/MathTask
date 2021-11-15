import java.util.ArrayList;

public class AlgMethods {
    public static ArrayList<String> pastOperation = new ArrayList<>();
    public static double answer = 0;
    public static double inpA = 0;
    public static double inpB = 0;
    public static int pastGet = -1;
    public static String toSet;
    public static void calcMethod() {
        answer = switch (MathGUI.toDo) {
            case "+" -> inpA + inpB;
            case "-" -> inpA - inpB;
            case "*" -> inpA * inpB;
            case "/" -> inpA / inpB;
            case "^" -> Math.pow(inpA, inpB);
            case "sq" -> Math.sqrt(inpA);
            case "cu" -> Math.cbrt(inpA);
            default -> 0;
        };
        System.out.println(answer);
        pastOperation.add(String.valueOf(inpA) + MathGUI.toDo + String.valueOf(inpB) + " = " + String.valueOf(answer));
    }

    public static void pastAnswers() {
        toSet = String.valueOf(pastOperation.get(pastGet));
    }
}
