package tugaspratikum3;

import java.util.Scanner;

public class nomer1sequential {
    public static void main (String[]args){
        System.out.println("***** SEQUENTIAL SEARCH *****"+"\n");
        int data [] = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20 };
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan data yang di cari: ");
        int key = scan.nextInt();
        
        //menampilkan data array
        System.out.print("isi data adalah: ");
        for (int i = 0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        System.out.println("");
        for (int i = 0; i<= data.length; i++){
            if (key == data [i]){
                System.out.print("data "+key+" berada pada indeks ke : "+i);
                break;
            }
        }
        System.out.println("\n");
        System.out.println("Marifatul Ikhsan");
    }
}
