package Algebra;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {
    public void calcMethod() {
        while(true) {
            System.out.println("Here is how the calculator works. \nPut your first input, hit Enter. Then the sign (+,-,*,/,^, sq (square root)), hit Enter. Finally, the second input, hit Enter. \nExample: \n1\n+\n1\nInput:\n");
            Scanner userInput = new Scanner(System.in);
            double inputOne = Double.parseDouble(userInput.nextLine());
            String toDo = userInput.nextLine();
            double inputTwo = Double.parseDouble(userInput.nextLine());
            double answer = 0;
            if (toDo.equals("+")) {answer = inputOne + inputTwo;}
            else if (toDo.equals("-")) {answer = inputOne - inputTwo;}
            else if (toDo.equals("*")) {answer = inputOne * inputTwo;}
            else if (toDo.equals("/")) {answer = inputOne / inputTwo;}
            else if (toDo.equals("^")) {answer = Math.pow(inputOne, inputTwo);}
            else if (toDo.equals("sq")) {answer = Math.sqrt(inputOne);}
            System.out.println(answer);
            System.out.println("Would you like to: \n- Continue with the Current Problem\n- Do a new Problem \n- Quit");
            Scanner secondQuestion = new Scanner(System.in);
            String continueInput = secondQuestion.nextLine().toUpperCase(Locale.ROOT);
            if (continueInput.contains("CONTINUE")) {
                while(true) {
                    System.out.println("Operation first, then value. ");
                    Scanner newInput = new Scanner(System.in);
                    String continuedOp = newInput.nextLine();
                    double continuedInput = Double.parseDouble(newInput.nextLine());
                    if (continuedOp.equals("+")) {answer = answer + continuedInput;
                        System.out.println(answer);
                        Scanner continueAgain = new Scanner(System.in);
                        String continuePrompt = continueAgain.nextLine().toUpperCase(Locale.ROOT);
                        if (continuePrompt.contains("CONT")) { continue; }
                        else { break;}}
                    else if (continuedOp.equals("-")) {answer = answer - continuedInput;
                        System.out.println(answer);
                        Scanner continueAgain = new Scanner(System.in);
                        String continuePrompt = continueAgain.nextLine().toUpperCase(Locale.ROOT);
                        if (continuePrompt.contains("CONT")) { continue; }
                        else { break;}}
                    else if ((continuedOp.equals("*")) || (toDo.equals("x"))) {answer = answer * continuedInput;
                        System.out.println(answer);
                        Scanner continueAgain = new Scanner(System.in);
                        String continuePrompt = continueAgain.nextLine().toUpperCase(Locale.ROOT);
                        if (continuePrompt.contains("CONT")) { continue; }
                        else { break;}}
                    else if (continuedOp.equals("/")) {answer = answer / continuedInput;
                        System.out.println(answer);
                        Scanner continueAgain = new Scanner(System.in);
                        String continuePrompt = continueAgain.nextLine().toUpperCase(Locale.ROOT);
                        if (continuePrompt.contains("CONT")) { continue; }
                        else { break;}}
                    else if (continuedOp.equals("^")) {answer = Math.pow(answer, continuedInput);
                        System.out.println(answer);
                        Scanner continueAgain = new Scanner(System.in);
                        String continuePrompt = continueAgain.nextLine().toUpperCase(Locale.ROOT);
                        if (continuePrompt.contains("CONT")) { continue; }
                        else { break;}}
                    else if (continuedOp.equals("sq")) { answer = Math.sqrt(answer);
                        System.out.println(answer);
                        Scanner continueAgain = new Scanner(System.in);
                        String continuePrompt = continueAgain.nextLine().toUpperCase(Locale.ROOT);
                        if (continuePrompt.contains("CONT")) { continue; }
                        else { break;}}

                    else {continue;}
                }
            }
            else if (continueInput.contains("NEW")) {
                continue;
            }
            else if (continueInput.contains("QUIT")) {
                break;

            }
        }
    }
}
