//  Домашки урока 6 ("Условный оператор. Часть 2")
public class Main {
    public static void main(String[] args) {
//  ДЗ 1, 2
        {
            System.out.println();
            byte clientOS = 1;
            int clientDeviceYear = 2015;
            if (clientOS >= 0 && clientOS < 2)
                System.out.printf("Установите%s версию приложения для %s по ссылке...",
                        whatVer(clientDeviceYear), whatOS(clientOS));
            else System.out.println("Номер ОС может принимать только одно из двух значений: 0 или 1.");
        }

//  ДЗ 3
        {
            System.out.println();
            int year = 4000;
            System.out.println();
            System.out.printf("%d год %s.\n", year, isLeapYear(year));
        }

//  ДЗ 4
        {
            System.out.println();
            int deliveryDistance = 120;
            if (deliveryDistance < 0)
                System.out.println("Расстояние до клиента должно быть положительным.");
            else if (deliveryDistance == 0) System.out.println("Услуги курьера не требуются; " +
                    "клиент собирается забрать карту из отделения Банка.");
            else System.out.printf("Дней на доставку: %s.\n", deliveryTime(deliveryDistance));
        }

//  ДЗ 5
        {
            System.out.println();
            byte monthNumber = 5;
            if (monthNumber > 0 && monthNumber <= 12)
                System.out.printf("%d-й месяц года - %s. Это %s месяц.\n",
                        monthNumber, monthName(monthNumber), seasonName(monthNumber));
            else System.out.println(monthNumberError());
        }

        System.out.println();
    }

//  ДЗ1
    static String whatOS(byte clientOS) {
        switch (clientOS) {
            case 0: return "iOS";
            case 1: return "Andriod";
            default: return "";
        }
    }

//  ДЗ2
    static String whatVer(int phoneRelease) {
        if (phoneRelease < 2015) return " лёгкую";
        return "";
    }

//  ДЗ3
    static String isLeapYear(int year) {
        if (((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0) return "високосный";
        else return "невисокосный";
    }

//  ДЗ4
    static String deliveryTime(int deliveryDistance) {
        switch (delDistType(deliveryDistance)){
            case (1):
                return "один";
            case (2):
                return "два";
            case (3):
                return "три";
            default:
                return "более трёх";
        }
    }
    static byte delDistType(int deliveryDistance) {
        if (deliveryDistance > 0 && deliveryDistance <= 20) return 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) return 2;
        if (deliveryDistance > 60 && deliveryDistance <= 100) return 3;
        return 0;
    }

//  ДЗ5
    static String monthName(byte monthNumber) {
        switch (monthNumber) {
            case 1: return "Январь";
            case 2: return "Февраль";
            case 3: return "Март";
            case 4: return "Апрель";
            case 5: return "Май";
            case 6: return "Июнь";
            case 7: return "Июль";
            case 8: return "Август";
            case 9: return "Сентябрь";
            case 10: return "Октябрь";
            case 11: return "Ноябрь";
            case 12: return "Декабрь";
            default: return monthNumberError();
        }
    }
    static String seasonName(byte monthNumber) {
        switch (monthNumber) {
            case 12: case 1: case 2: return "зимний";
            case 3: case 4: case 5: return "весенний";
            case 6: case 7: case 8: return "летний";
            case 9: case 10: case 11: return "осенний";
            default: return monthNumberError();
        }
    }
    static String monthNumberError() {
            return "По грегорианскому календарю в году 12 месяцев; ни больше, ни меньше.";
        }

}