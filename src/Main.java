public class Main {
    public static void main(String[] args) {

/* Task 1 */  System.out.println("*** Task 1 ***");

        for (int a = 1; a <= 12 ; a++) {
            System.out.println(a);
        }

/* Task 2 */  System.out.println("*** Task 2 ***");

        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }

/* Task 3 */  System.out.println("*** Task 3 ***");

        for (int c = 0; c <= 17; c = c + 2) {
            System.out.println(c);
        }

/* Task 4 */  System.out.println("*** Task 4 ***");

        for (int d = 10; d >= -10; d--) {
            System.out.println(d);
        }

/* Task 5 */  System.out.println("*** Task 5 ***");

        for (int e = 1904; e <= 2096; e = e + 4) {
            System.out.println(e + " год является високосным");
        }

/* Task 6 */  System.out.println("*** Task 6 ***");

        for (int f = 7; f <= 98; f = f + 7) {
            System.out.println(f);
        }

/* Task 7 */  System.out.println("*** Task 7 ***");

        for (int g = 1; g < 513; g = g * 2) {
            System.out.println(g);
        }

/* Task 8 */  System.out.println("*** Task 8 ***");

        int cash = 29000;
        int savings = 0;
        for (int m = 1; m <= 12; m++) {
            savings = savings + cash;
            System.out.println("Месяц " + m + " - сумма накоплений равна " + savings + " рублей");
        }

/* Task 9 */  System.out.println("*** Task 9 ***");

        int deposit = 0;
        for (int m = 1; m <= 12; m++) {
            deposit = deposit + deposit/100;
            deposit = deposit + cash;
            System.out.println("Месяц " + m + " - сумма накоплений равна " + deposit + " рублей");
        }

/* Task 10 */  System.out.println("*** Task 10 ***");

        for (int h = 1; h < 11; h++) {
            System.out.println("2 * " + h + " = " + (2 * h));
        }
    }
}