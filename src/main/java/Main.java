public class Main {
    public static void main(String[] args) {
        double endResalts;
        //    int endResaltsFormat;
        Menu menu = new Menu();
        Person person = new Person();
        person.person();
        menu.resalts();
        endResalts = menu.allPrice / person.allpersons;
        String endResaltsformat = String.format("%.2f", endResalts);
        int endResaltsFormat = (int) endResalts;


        switch (endResaltsFormat % 10) {
            case 1:
                System.out.println("Итог: " + endResaltsformat + "   рубль");
                break;
            case 2:
            case 3:
            case 4:
                System.out.println("Итог: " + endResaltsformat + "   рубля");
                break;
            default:
                System.out.println("Итог: " + endResaltsformat + "   рублей");
                break;

        }
    }
}