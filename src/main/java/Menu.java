import java.util.Scanner;

class Menu {
    String allProduct= "";
    double allPrice;

    Scanner scan = new Scanner(System.in);

    public void resalts() {

             while (true) {
                System.out.println("Введите название товара");
                String product = scan.next();
                 if (product.equalsIgnoreCase("Завершить")) {
                     System.out.println("Добавление товара завершено");
                     break;
            }
            System.out.println("Введите стоимость товара в формате 00,00");
            double priceProduct = scan.nextDouble();
             if (priceProduct<0 ){
                 System.out.println("Не коректно введена стоимость товара. \nВведите стоимость товара в формате 00,00");
                 priceProduct = scan.nextDouble();
             }




            System.out.println("Товар добавлен в счет. \nТовар:  " + product + "   Цена:  " + priceProduct + "\nЕсли вы хотите продолжить выбор, то введите название товара \nЕсли выхотите завершить выбор товара, то введите команду \"Завершить\"");
            allProduct=allProduct + product+"\n";
            allPrice=allPrice+priceProduct;

                  }

        System.out.println("Весь товар:" +"\n" + allProduct);
        System.out.println("Полная стоимость  " + allPrice);

    }
  }








