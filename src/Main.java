import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        holder();




    }


    public static void holder() {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name?");
        System.out.println(scan.nextLine());
        balance();
        System.out.println("your balance is " +balance());
        overdraft();
        System.out.println("your overdraft is" +overdraft());
    }

    public static double balance() {

        double balance = 100;
        double amount;
        return balance;

    }

    public static double overdraft(){
        return 0;

    }

    public static void accountNumber(){

    }

    public static void pinNumber(){

    }
}
