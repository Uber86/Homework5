public class Main {
    public static void main(String[] args) {

        // Задача №1
        byte clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println(); // добавил на случаи если пользователь выберет цифру больше 3
        }

        // Задача №2
        short clientDeviceYear = 2015;
        if (clientDeviceYear >= 2015 && clientOS == 1) { // для того чтоб не путаться clientOS уже задан в Задаче №1
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else { // можно было бы как в 1ой задаче написать
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задача №3
        short year = 1;
        if (year % 100 == 0){
            if (year % 400 == 0 ){
                System.out.println(year + " год является високосным");
            }
        }else if (year % 4 == 0 && year >= 1584 ){
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }

        // Задача №4

        short deliveryDistance = 20 ;
        String oneDay = "Потребуется одни сутки";
        String twoDay = "Потребуется двое суток";
        String threeDay = "Потребуется трое суток";
        String non = "Доставка отсутствует";
        boolean term = deliveryDistance <=20;
        boolean term2 = deliveryDistance > 20 && deliveryDistance <= 60;
        boolean term3 = deliveryDistance > 60 && deliveryDistance <=100;
        if (term){
            System.out.println(oneDay);
        } else if (term2) {
            System.out.println(twoDay);
        } else if (term3) {
            System.out.println(threeDay);
        }else{
            System.out.println(non);
        }

        // Задача №5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сезон зимы.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон весны.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон лета.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон осени.");
                break;
            default:
                System.out.println("");
        }
    }
}