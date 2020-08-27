import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl eingeben: ");
        int num = sc.nextInt();

        boolean isInWorkingTime = (num >=8 && num <= 16) ? true : false;

        if (isInWorkingTime) {

            System.out.println("Liegt in der Arbeitszeit.");

            switch (num) {

                case 12, 13:
                    System.out.println("Es ist gerade Mittagspause.");

            }
        } else {

            System.out.println("Liegt nicht in der Arbeitszeit.");
        }

        sc.close();
    }
}
