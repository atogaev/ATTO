package org.example.controller;

import org.example.componentConteyner.ComponentConteyner;
import org.example.controllerServis.RegistrationServis;

import java.util.Scanner;

public class Controller {
    RegistrationServis registrationServis = new RegistrationServis();
    Scanner scanner = new Scanner(System.in);
    boolean t = true;
    boolean ans = false;

    public void Menu() {
        while (t) {
            ShowMenu();
            int n = ComponentConteyner.intscanner.nextInt();

            switch (n) {
                case 1 -> {
                    //
                    loginMenu();
                    if (ans) {
                        Usermenu();
                    }
                    System.err.println("Samthing is wrong");
                }
                case 2 ->
                    //
                        registrationServis.addUser();
                default -> System.err.println("WRONG NUMBER,MAZGI\uD83E\uDD2C\uD83E\uDD2C\uD83E\uDD2C");
            }

        }

    }

    public void ShowMenu() {
        System.out.println("""
                1. Login
                    Enter phone:
                    Enter passwd:
                2. Registration:
                    Enter name:
                    Enter surname:
                    Enter phone:
                    Enter passwd:""");
    }

    public void Usermenu() {
     int m = scanner.nextInt();
     while (t){
         userShowMenu();
         switch (m){
             case 1:
                 //
                 break;
             case 2:
                 //
                 break;
             case 3:
                 //
                 break;
         }
     }
    }
    public void userShowMenu(){
        System.out.println("""
                *** User  Menu **
                    (Card)
                    1. Add Card (number) - (cartani profile ga ulab qo'yamiz.) (added_date)
                        Enter Card Number:
                        (kiritilgan number database da bo'lishi kerak.)
                    2. Card List (number,exp_date,balance)
                    3. Card Change Status
                    4. Delete Card (visible_user = false,deleted_user)

                    4. ReFill (pul tashlash) (carta userga tegishli bo'lishi kerak.)
                        Enter card number:
                        Balance:
                        (Transaction with type 'ReFill')

                    (Transaction)
                    5. Transaction
                        CardNumber, Address, Amount,TransactionDate,Type (oxirgi birinchi ko'rinadi)
                    6. Make Payment (pul to'lash)
                        Enter cardNumber:
                        Enter terminal number:
                        (Transaction with type 'Payment')
                """);
    }

    public void loginMenu() {
        System.out.println("Enter phone");
        String phone = scanner.next();
        System.out.println("Enter password");
        String passwd = scanner.next();
        registrationServis.checkPhone(phone);
        ans = registrationServis.logIn(phone,passwd);

    }
}
