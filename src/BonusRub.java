public class BonusRub {

    public static void main(String[] args) {

        double account = 100.0;
        double getMoney = 300.0;
//        double getMoney = 1100.0; // проверка для 2 варианта
        int bonusRub = (int) getMoney / 100;
        if (getMoney < 1001) {
            bonusRub = 0;
        }
        account = account + getMoney + bonusRub;

        System.out.println("На вашем счету " + account + " руб.");

        System.out.println("Из них: " + bonusRub + " бонусных руб.");
    }
}