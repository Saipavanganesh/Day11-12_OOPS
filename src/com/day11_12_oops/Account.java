package com.day11_12_oops;

import java.util.Scanner;

public class Account {
    public void accountWithdraw(){
        int totalAmount = 837421;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Total amount in your account is " + totalAmount);
        System.out.println("Enter the amount you want to withdraw");
        int withdrawAmount = sc.nextInt();
        if(withdrawAmount <= totalAmount){
            totalAmount = totalAmount-withdrawAmount;
            System.out.println("Amount Withdrawn...\nRemaining balance is " + totalAmount);
        }
        else{
            System.out.println("Insufficient funds. No amount deducted.");
            System.out.println("Remaining balance is " + totalAmount);
        }
    }
}
