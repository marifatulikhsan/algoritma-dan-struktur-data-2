//Marifatul Ikhsan_20090007_2D
package tugasmodul2;
public class nomer2 {
    public static void main(String[] args){
        int[][] A = {
            {1,2},
            {3,4},
            {5,6}
        };
        int[][] B = {
            {11,12},
            {13,14},
            {15,16}
        };
        int baris_a = A.length;
        int kolom_a = A[0].length;
        int[][] hasil = new int [baris_a][kolom_a];
        
        for(int i=0; i<baris_a; i++){
            for(int j=0; j<kolom_a; j++){
                hasil [i][j] = B[i][j] - A[i][j];
                System.out.print(hasil[i][j]+" ");
            }
            System.out.println();
        }
    }
    
}
