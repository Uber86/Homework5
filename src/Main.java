public class Main {
    public static void main(String[] args) {

        // Задача №1
        byte clientOS =0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println(); // добавил на случаи если пользователь выберет цифру больше 3
        }

        // Задача №2
        short clientDeviceYear = 2016;
        if (clientDeviceYear < 2015 && clientOS == 1) { // для того чтоб не путаться clientOS уже задан в Задаче №1
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else { // можно было бы как в 1ой задаче написать
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задача №3
        short year = 1900;
        if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }


        // Задача №4
        short deliveryDistance = 100 ;
        String oneDay = "потребуется одни сутки";
        String twoDay = "потребуется двое суток";
        String threeDay = "потребуется трое суток";
        String non = "Доставка отсутствует";
        boolean term = deliveryDistance <=20;
        boolean term2 = deliveryDistance > 20 && deliveryDistance <= 60;
        boolean term3 = deliveryDistance > 60 && deliveryDistance <=100;
        if (term){
            System.out.println("Для доставки на растоянние: " + deliveryDistance + " км " + oneDay);
        } else if (term2) {
            System.out.println("Для доставки на растоянние: " + deliveryDistance + " км " + twoDay);
        } else if (term3) {
            System.out.println("Для доставки на растоянние: " + deliveryDistance + " км " + threeDay);
        }else{
            System.out.println(non);
        }

        // Задача №5
        int monthNumber = 9;
        switch (monthNumber) {
            case 1, 2, 12:
                System.out.println(monthNumber + " месяц cезон зимы.");
                break;
            case 3, 4, 5:
                System.out.println(monthNumber + " месяц cезон весны.");
                break;
            case 6, 7, 8:
                System.out.println(monthNumber + " месяц cезон лета.");
                break;
            case 9, 10, 11:
                System.out.println(monthNumber + " месяц cезон осени.");
                break;
            default:
                System.out.println("");
        }
    }
}