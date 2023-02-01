public class ex_4 {
    public static void main(String[] args) {
        int deliveryDistance = 60;
        int countDays = 0;

        if (deliveryDistance >= 100) {
            countDays = 0;
        } else if (deliveryDistance < 20) {
            countDays = 1;
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            countDays = 2;
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            countDays = 3;
        }

        if (countDays > 0) {
            System.out.println("Потребуется дней: " + countDays);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }
}