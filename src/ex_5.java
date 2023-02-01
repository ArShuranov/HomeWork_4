import org.w3c.dom.ls.LSOutput;

public class ex_5 {
    public static void main(String[] args) {
        byte monthNumber = 2;
        String season = "";

        if (monthNumber > 0 && monthNumber < 13) {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    season = "Зима";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "Весна";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "Лето";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "Осень";
                    break;

            }
        } else {
            System.out.printf("Ошибка! Такого месяца не существует");
        }
        System.out.println(season);
    }
}