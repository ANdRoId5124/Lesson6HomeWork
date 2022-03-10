import java.util.Scanner;

public class Lesson5HM {
    static class CreditCard {
        long numberOfCard = (long)(Math.random() * 10000000L);
        double moneyOnCard = (int)(Math.random() * 10000);

        double plusMoney(double moneyOnCard) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Add money");
            double moneyPlus = scanner.nextDouble();
            this.moneyOnCard += moneyPlus;
            return moneyOnCard;
        }

        double minusMoney(double moneyOnCard){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Get money");
            double moneyMinus = scanner.nextDouble();
            this.moneyOnCard -= moneyMinus;
            return moneyOnCard;
        }
        void show(){
            System.out.println(numberOfCard + "\n" + moneyOnCard);
        }

    }

    public static void main(String[] args){
        CreditCard creditCard1 = new CreditCard();
        System.out.print("Credit card 1: ");
        creditCard1.show();
        System.out.println();
        CreditCard creditCard2 = new CreditCard();
        System.out.print("Credit card 2: ");
        creditCard2.show();
        System.out.println();
        CreditCard creditCard3 = new CreditCard();
        System.out.print("Credit card 3: ");
        creditCard3.show();
        System.out.println();

        creditCard1.plusMoney(creditCard1.moneyOnCard);
        creditCard1.show();
        creditCard2.plusMoney(creditCard2.moneyOnCard);
        creditCard2.show();
        creditCard3.minusMoney(creditCard3.moneyOnCard);
        creditCard3.show();



    }
}
