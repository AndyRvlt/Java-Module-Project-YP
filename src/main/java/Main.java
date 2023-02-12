

// dev branch for Y.Practicum
public class Main {


    public static void main(String[] args) {
        double endResalts;

        Menu menu = new Menu();
        Person person = new Person();

        person.person();
        menu.resalts();

        endResalts = menu.allPrice / person.allpersons;

        if (Math.floor(endResalts) == 1) {
            String endResaltsformat = String.format("%.2f", endResalts);
            System.out.println("Итог: " + endResaltsformat + "рубль");

        }
        else if (Math.floor(endResalts) == 2||Math.floor(endResalts)==3||Math.floor(endResalts) ==4) {
            String endResaltsformat = String.format("%.2f", endResalts);
            System.out.println("Итог: " + endResaltsformat + "рубля");
        }
        else if(endResalts >= 5) {
            String endResaltsformat = String.format("%.2f", endResalts);
            System.out.println("Итог: " + endResaltsformat + " рублей");
        }


    }

}




        // ваш код начнется здесь
        // вы не должны ограничиваться только классом Main и можете создавать свои классы по необходимости



