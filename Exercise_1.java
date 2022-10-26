package DZ_2;

import java.util.Scanner;

public class Exercise_1 {
    public static void main(String[] args) {
        System.out.print("Enter the float number: ");
        float number = returnFloat();
        System.out.println(number);
    }

    private static float returnFloat() {
        float returnNumber = 0;
        boolean check = true;
        try (Scanner sc = new Scanner(System.in)) {
            while (check) {
                String number = sc.nextLine();
                if (number == null) {
                    throw new RuntimeException("Number is null");
                }
                try {
                    returnNumber = Float.parseFloat(number);
                    check = false;
                } catch (NumberFormatException ex) {
                    System.out.println("Input isn't correct " + ex.getMessage());
                }

            }
        }
        return returnNumber;
    }
}