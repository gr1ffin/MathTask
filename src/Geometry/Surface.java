package Geometry;
import java.util.Locale;
import java.util.Scanner;


public class Surface {
    public void surfaceMethod() {
        System.out.println("What object are you trying to find the surface area for?");
        System.out.println("- Rectangular Prism\n- Sphere\n- Cylinder\n- Triangular Prism\n- Pyramid");
        Scanner typeInput = new Scanner(System.in);
        String takeInput = typeInput.nextLine().toUpperCase(Locale.ROOT);
        if (takeInput.equals(("RECTANGULAR PRISM"))) {
            while (true) {
                Scanner numberInput = new Scanner(System.in);
                System.out.println("What is the length of the rectangular prism?");
                String length = numberInput.nextLine();
                System.out.println("What is the width of the rectangular prism?");
                String width = numberInput.nextLine();
                System.out.println("What is the height of the rectangular prism?");
                String height = numberInput.nextLine();
                System.out.println("Your selected values were \nHeight: " + height + "\nLength: " + length + "\nWidth: " + width + "\nIs that correct? (Y/N)");
                Scanner checkInput = new Scanner(System.in);
                String correctString = checkInput.nextLine().toUpperCase(Locale.ROOT);
                if (correctString.equals("Y")) {
                    System.out.println("The area of the rectangular prism is: " + 2 * (Integer.parseInt(length) * Integer.parseInt(height) * Integer.parseInt(width)));
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
        else if (takeInput.equals("SPHERE")) {

        }
        else if (takeInput.equals("CYLINDER")) {

        }
        else if (takeInput.equals("TRIANGULAR PRISM")) {

        }
        else if (takeInput.equals("PYRAMID")) {
            while (true) {
                Scanner numberInput = new Scanner(System.in);
                System.out.println("What is the base of the pyramid??");
                String base = numberInput.nextLine();
                System.out.println("What us the side length of the pyramid?");
                String side = numberInput.nextLine();
                System.out.println("Your selected values were \nBase: " + base + "\nSide: " + side + "\nIs that correct? (Y/N)");
                Scanner checkInput = new Scanner(System.in);
                String correctString = checkInput.nextLine().toUpperCase(Locale.ROOT);
                if (correctString.equals("Y")) {
                    System.out.println("The volume of the Pyramid is: " + Math.pow(Integer.parseInt(base), 2) + (2 * Integer.parseInt(base) * Integer.parseInt(side)));
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
        else {

        }
    }
}