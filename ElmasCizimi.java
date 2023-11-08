package day01;

import java.util.Scanner;

public class ElmasCizimi {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int boyut;
        System.out.println("cizmek istediğiniz elmasın en uzun kenarını giriniz:");
        boyut = input.nextInt();

        for(int i=0;i<=boyut;i++){
            for(int j=0;j<(boyut-i);j++){
                System.out.print(" ");
            }
        for(int k=1;k<=(2 * i + 1);k++){
            System.out.print("*");
        }
            System.out.println(" ");
        }

        for(int i=boyut;i>=0;i--){
            for(int j=0;j<(boyut-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
