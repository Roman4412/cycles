public class Main {
    public static void main(String[] args) {
        // 1
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }
        System.out.println();
        // 2
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        System.out.println();
        // 3
        for (int i = 0; i < 17 ; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println();
        // 4
        for (int i = 10; i > -11 ; i--) {
            System.out.println(i);
        }
        System.out.println();
        // 5
        for (int i = 1904; i < 2097; i+=4) {
                System.out.println(i +" год является високосным");
        }
        System.out.println();
        // 6
        for (int i = 7; i < 99; i+=7) {
            System.out.println(i);
        }
        // 7
        for (int i = 1; i < 513; i *= 2) {
            System.out.println(i);
        }
        System.out.println();
        // 8
        int total = 0;
        int savePerMonth = 29_000;
        for (int i = 0; i < 12; i++) {
            total = total + savePerMonth;
        }
        System.out.println(total);
        System.out.println();
        // 9
        for (int i = 1; i < 13; i++) {
            total += total / 100;
            total += savePerMonth;
            System.out.println("Месяц " + i + ", суумма накоплений равна " + total + " рублей");
        }
        System.out.println();
        // 10
        for (int i = 1; i < 11; i++) {
            System.out.println(2 * i);
        }
    }
}