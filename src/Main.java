public class Main {
    public static void main(String[] args) {

        int summer = 2021;
        yearPrint(summer);
        int difference = 0;
        int baseYear = 2014;
        clientVersion(difference, baseYear);
        int distance = 95;
        extraDays(distance);
    }

    public static void yearPrint(int year) {

        // Задание 1

        System.out.println("Задача 1");

        if (year % 100 != 0 || year % 400 == 0 && year % 4 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

        // Задание 2

    public static void clientVersion(int clientOS1, int clientDevYear) {

        System.out.println("Задача 2");
        if (clientOS1 == 0 && clientDevYear >= 2015) {
            System.out.println("установите версию для IOS");
        }else if(clientOS1 == 0 && clientDevYear < 2015) {
            System.out.println(" установите lite версию для IOS");
        } else if(clientOS1 == 1 && clientDevYear >= 2015) {
            System.out.println("установите версию для Android");
        } else if (clientOS1 == 1 && clientDevYear < 2015){
            System.out.println("установите lite версию для Android");
        }
    }

    // Задание 3

    public static void extraDays(int deliveryDistance ) {
        System.out.println("Задача 3");

        if (deliveryDistance < 20) {
            System.out.println("потребуется 1 день ");
        } else if (deliveryDistance < 60) {
            System.out.println("потребуется 2 дня");
        }else {
            System.out.println("потребуется 3 дня");
        }

    }
}