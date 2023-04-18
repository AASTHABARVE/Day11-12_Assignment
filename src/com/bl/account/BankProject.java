package com.bl.account;
import java.util.Scanner;


    class SavingAccount{
        static float balance = 0;

        public SavingAccount(float balance){
            this.balance = balance;
        }

        float debitBalance(float amount){
            if(balance >= amount){
                balance = balance-amount;
                System.out.println(amount + " is debited");}
            else{
                System.out.println("you have not sufficient amount");
            }
            return balance;
        }

        float creditBalance(float amount){
            balance = balance+amount;
            System.out.println(amount + " is credited");
            return balance;
        }
        float checkBalance(){
            return balance;
        }
    }

    public class BankProject {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            SavingAccount object = new SavingAccount(100.00f);
            System.out.println("opening balance = " +object.checkBalance());


            int temp = 1;
            while(temp != 0){
                System.out.println("1.credit 2.debit 3.balanceCheck 4.exit");
                System.out.print("enter the option:");
                int option = sc.nextInt();

                switch (option) {
                    case 1:
                        System.out.print("Enter the amount to credit:");
                        float amountCredit = sc.nextFloat();
                        object.creditBalance(amountCredit);
                        break;
                    case 2:
                        System.out.print("Enter the amount to debit:");
                        float amountDebit = sc.nextFloat();
                        object.debitBalance(amountDebit);
                        break;
                    case 3:
                        float balance = object.checkBalance();
                        System.out.println(balance);
                        break;
                    case 4:
                        System.out.println("closing balance is :" + SavingAccount.balance);
                        temp = 0;
                        break;
                    default:
                        System.out.println("!!!something went wrong !!!");
                        break;
                }
            }
        }
    }
