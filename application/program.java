package application;
import java.util.Scanner;

import entities.Rent;

public class program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many rooms will be rented?");
        int n = sc.nextInt();
        System.out.println();

        Rent[] vect = new Rent[10];

        for(int i=1;i<=n;i++){
            System.out.println("Rent #"+i);
            System.out.print("Name:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Email:");
            String email = sc.next();
            System.out.print("Room:");
            int RoomNumber= sc.nextInt();

            vect[RoomNumber]= new Rent(name,email);
            System.out.println();
        }

        System.out.println("Busy rooms:");
        for(int i=1;i<10;i++){
            if (vect[i]!=null) {
                System.out.println(i+":"+vect[i]);
            }
        }

        sc.close();
    }

}