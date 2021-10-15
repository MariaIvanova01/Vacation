package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyVacation = scan.nextDouble();
        double moneyOnHand = scan.nextDouble();
        scan.nextLine();
        String saveOrSpend = scan.nextLine();
        double saveOrSpendMoney = scan.nextDouble();
        int spendDays = 0;
        int allDays = 0;

        while (true){
            allDays ++;
            if (saveOrSpend.equals("spend")){
                spendDays++;
                moneyOnHand -= saveOrSpendMoney;
            }
            if (moneyOnHand < 0){
                moneyOnHand = 0;
            }
            if (spendDays == 5){
                System.out.println("You can't save the money.");
                System.out.printf("%d", spendDays);
                break;
            }
            if (saveOrSpend.equals("save")){
                moneyOnHand += saveOrSpendMoney;
                spendDays = 0;
            }
            if (moneyOnHand >= moneyVacation) {
                System.out.printf("You saved the money for %d days.", allDays);
                break;
            }

            scan.nextLine();
            saveOrSpend = scan.nextLine();
            saveOrSpendMoney = scan.nextDouble();
        }

    }
}
