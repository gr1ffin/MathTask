package Geometry;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Volume {
    public void volumeMethod() {
        System.out.println("What shape would you like to find the area for?");
        System.out.println("- Cube \n- Cylinder \n- Triangular Prism");
        Scanner takeInput = new Scanner(System.in);
        String volumeInput = takeInput.nextLine().toUpperCase(Locale.ROOT);
        if (volumeInput.equals("CUBE")) {
            while (true) {
                Scanner numberInput = new Scanner(System.in);
                System.out.println("What is the length of your object?");
                String length = numberInput.nextLine();
                System.out.println("What is the width of your object?");
                String width = numberInput.nextLine();
                System.out.println("What is the height of your object?");
                String height = numberInput.nextLine();
                System.out.println("Your selected values were \nHeight: " + height + "\nLength: " + length + "\nWidth: " + width + "\nIs that correct?");
                Scanner checkInput = new Scanner(System.in);
                String correctString = checkInput.nextLine().toUpperCase(Locale.ROOT);
                if (correctString.equals("Y")) {
                    System.out.println("The area of the cube/rectangle is: " + Integer.parseInt(length) * Integer.parseInt(width) * Integer.parseInt(height));
                    break;
                } else if (correctString.equals("N")) {
                    System.out.println("Ok, let's try again.");
                    continue;
                } else {
                    System.out.println("Invalid input, please try again.");
                    continue;
                }
            }
        }
        if (volumeInput.equals("CYLINDER")) {
            while (true) {
                Scanner numberInput = new Scanner(System.in);
                System.out.println("What is the radius of the base of your object?");
                String radius = numberInput.nextLine();
                System.out.println("What us the height of your object?");
                String height = numberInput.nextLine();
                System.out.println("Your selected values were \nRadius: " + radius + "\nHeight: " + height + "\nIs that correct?");
                Scanner checkInput = new Scanner(System.in);
                String correctString = checkInput.nextLine().toUpperCase(Locale.ROOT);
                if (correctString.equals("Y")) {
                    System.out.println("The area of the cylinder is: " + Math.pow(Integer.parseInt(radius), 2) * Integer.parseInt(height) * Math.PI);
                    break;
                } else if (correctString.equals("N")) {
                    System.out.println("Ok, let's try again.");
                    continue;
                } else {
                    System.out.println("Invalid input, please try again.");
                    continue;
                }

            }
        }
        if (volumeInput.equals("TRIANGULAR PRISM")) {
            while (true) {
                Scanner numberInput = new Scanner(System.in);
                System.out.println("What is the length of your object?");
                String length = numberInput.nextLine();
                System.out.println("What is the width of your object?");
                String width = numberInput.nextLine();
                System.out.println("What is the height of your object?");
                String height = numberInput.nextLine();
                System.out.println("Your selected values were \nHeight: " + height + "\nLength: " + length + "\nWidth: " + width + "\nIs that correct?");
                Scanner checkInput = new Scanner(System.in);
                String correctString = checkInput.nextLine().toUpperCase(Locale.ROOT);
                if (correctString.equals("Y")) {
                    System.out.println("The area of the triangular prism is: " + 0.5 * Integer.parseInt(length) * Integer.parseInt(height) * Integer.parseInt(width));
                    break;
                } else if (correctString.equals("N")) {
                    System.out.println("Ok, let's try again.");
                    continue;
                } else {
                    System.out.println("Invalid input, please try again.");
                    continue;
                }
            }
        }
    }
}

