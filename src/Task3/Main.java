package Task3;

import java.util.Date;

public class Main {
        public static void main(String[] args) {
            int dogovorNumber = 444;
            Date date = new Date();
            String[] list = new String[5];
            for (int i = 1; i < 5; i++) {
                list[i] = "Список товаров " + i;
            }
            Dogovor dogovor1 = new Dogovor(dogovorNumber, date, list);
            Act act1 = Conversion.conversionFromDogovorToAct(dogovor1);
            System.out.println("Акт № " + act1.getActNumber() + " , Дата: " + act1.getDate().toString());
            for (String act : act1.getActList() ) {
                System.out.println(act);
            }
        }
}