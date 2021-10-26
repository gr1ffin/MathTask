package Algebra;

import java.util.Locale;
import java.util.Scanner;

public class Algebra {
    public void algebraMethod() {
        System.out.println("Would you like to use a Calculator or Solve for a variable?");
        Scanner userInput = new Scanner(System.in);
        String takeInput = userInput.nextLine().toUpperCase(Locale.ROOT);
        if (takeInput.contains("SOLVE")) {
            Solve so = new Solve();
            so.solveMethod();
        }
        else if (takeInput.contains("CALCULATOR")) {
            Calculator ca = new Calculator();
            ca.calcMethod();
        }
        else {
            System.out.println("fail");
        }
    }
}
