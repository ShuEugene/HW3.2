//  Домашки урока 6 ("Условный оператор. Часть 2")
public class Main {
    public static void main(String[] args) {
        System.out.println();
//  ДЗ 1
        byte clientOS = 2;
        if (clientOS >= 0 && clientOS < 2)
            System.out.printf("Установите версию приложения для %s по ссылке...", whatOS(clientOS));
        else System.out.println("Номер ОС может принимать только одно из двух значений: 0 или 1.");

        System.out.println();
    }

    static String whatOS(byte clientOS) {
        switch (clientOS) {
            case 0: return "iOS";
            case 1: return "Andriod";
            default: return "";
        }
    }
}