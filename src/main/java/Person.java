import java.util.Scanner;

class Person {
    Scanner scanner = new Scanner(System.in);
    int allpersons;

    public void person() {
        while (true) {
            System.out.println("На скольких человек необходимо разделить счёт");
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("Не верный формат ввода.\nВведите количесво человек цифрами.");
            }

            int allperson = scanner.nextInt();
            if (allperson > 1) {
                System.out.println("Счет необходимо разделить на " + allperson);
                allpersons = allperson;
                break;
            } else if (allperson < 1) {
                System.out.println("Некорректное значение для подсчёта. \nВеедите количество человек");
            } else if (allperson == 1) {
                System.out.println("Нет смысла ничего считать и делить.\nВеедите количество человек");
            }

        }
    }
}
