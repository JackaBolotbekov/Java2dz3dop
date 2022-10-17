package com.company;
import java.util.Scanner;
import java.io.*;


class Card{

    public String name;
    public double balance, balanceA, balanceD;
    public int menu;
    Scanner sc = new Scanner(System.in);


    Card(){
        name = "";
        balance = 0;
    }

    public void info(){
        System.out.print("\nCard holder: "+name);
        System.out.print("\nBalance on card: "+balance);
        System.exit(0);
        //mainmenu();
    }

    public double update (){
        Scanner sc = new Scanner(System.in);
        System.out.print("Updating balance for: "+name+"\nAdd balance: ");
        balanceA = sc.nextDouble();
        balance = balance + balanceA;
        System.out.print("Balance of card holder "+name+" successfully changed to "+balance);

        return  balance;
    }

    public double decrease (){
        System.out.print("Updating balance for: "+name+"\nDec balance: ");
        balanceD = sc.nextDouble();
        if(balanceD>balance){System.out.print("You make a mistake.\nPlease, try again.\n"); decrease();}else{
            balance = balance - balanceD;
            System.out.print("Balance of card holder "+name+" successfully changed to "+balance);}

        return  balance;
    }

    public double currency(double usd){
        return balance = balance / usd;
    }

    public int mainmenu(){
        System.out.print("\nFor continue work with system input:\n");
        System.out.print("0 - For exit\n1 - For get information\n2 - For update balance\n3 - For the decrease balance.\n4 - For the currency conversion.\n");
        System.out.print("5 - Cash withdrawal\n");
        return menu = sc.nextInt();
    }
}

public class Task3{
    public static void main(String[] args) throws IOException{

        Card c = new Card();
        Scanner sc = new Scanner(System.in);
        BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
        String input;

        do{
            System.out.print("\nWelcome to the program!\nInput 'yes' to continue work and 'exit', to exit in the program: ");
            input = inp.readLine();
            if(input.equals("exit") || input.equals("Exit")){System.out.print("You came out of the program!");
                System.exit(0);}
        } while (!input.equals("yes") && !input.equals("Yes"));


        System.out.print("\n\nEnter the name of the card holder: ");
        c.name = inp.readLine();
        System.out.print("Enter the start balance (optional): ");
        do{
            c.balance = sc.nextDouble();
            if(c.equals(""))c.balance=0;
        }
        while(c.equals(""));

        c.mainmenu();

        switch(c.menu){

            case 0:System.out.print("You came out of the program!");System.exit(0);break;
            case 1:c.info(); break;
            case 2:c.update();break;
            case 3:c.decrease();break;
            case 4:c.currency(10300); System.out.print("You balance in USD: "+c.balance);break;
            case 5:System.out.print("Menu for Card");break;
            default: System.out.print("Error!\nSession close.\n");

        }

    }

}