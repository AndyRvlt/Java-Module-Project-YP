import java.util.Scanner;

class Menu {
    String allProduct = "";
    double allPrice;
    double priceProduct;
    Scanner scan = new Scanner(System.in);

    public void resalts() {
        while (true) {
            System.out.println("Введите название товара");
            String product = scan.next();
            if (product.equalsIgnoreCase("Завершить")) {
                System.out.println("Добавление товара завершено");
                break;
            }
            while (true) {
                System.out.println("Введите стоимость товара в формате 00,00");
                while (!scan.hasNextDouble()) {
                    scan.next();
                    System.out.println("Не верный формат ввода. Введите стоимость в цифрах формата 00,00");
                }
                while (true) {
                    priceProduct = scan.nextDouble();
                    if (priceProduct > 0) {
                        break;
                    } else if (priceProduct < 0) {
                        System.out.println("Вы ввели не верный формат стоимости");
                    } else {
                        System.out.println("Введите верный формат");
                    }
                }

                System.out.println("Товар добавлен в счет. \nТовар:  " + product + "   Цена:  " + priceProduct + "\nЕсли вы хотите продолжить выбор, то введите название товара \nЕсли выхотите завершить выбор товара, то введите команду \"Завершить\"");
                allProduct += product + "\n";
                allPrice = allPrice + priceProduct;
                break;
            }
        }
        System.out.println("Весь товар:" + "\n" + allProduct);
        System.out.println("Полная стоимость  " + allPrice);
    }
}








