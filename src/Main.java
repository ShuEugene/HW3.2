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
            System.out.printf("%d год %s.", year, isLeapYear(year));
        }

    System.out.println();
    }

    static String whatOS(byte clientOS) {
        switch (clientOS) {
            case 0: return "iOS";
            case 1: return "Andriod";
            default: return "";
        }
    }

    static String whatVer(int phoneRelease) {
        if (phoneRelease < 2015) return " лёгкую";
        return "";
    }

    static String isLeapYear(int year) {
        if (((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0) return "високосный";
        else return "невисокосный";
    }
}