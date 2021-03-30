//Marifatul Ikhsan_20090007_2D
package tugasmodul2;
public class nomer3 {
    public static void main(String[] args) {
        int[][] matriks_a = {
            {1,2,3},
            {4,5,6}
        };
        int[][] matriks_b = {
            {11,12},
            {13,14},
            {15,16}
        };
        
        int baris_a = matriks_a.length;
        int kolom_a = matriks_a[0].length;
        int baris_b = matriks_b.length;
        int kolom_b = matriks_b[0].length;
        int[][] Hasilkali = new int[baris_a][kolom_b];
        
        for (int i=0; i<baris_a; i++){
            for (int j=0; j<kolom_b; j++){
                for (int k=0; k<kolom_a; k++){
                        Hasilkali[i][j] = Hasilkali[i][j] + (matriks_a[i][k]*matriks_b[k][j]);
            }
        }
    }
    for (int[] x: Hasilkali){
    for (int y: x){
        System.out.print(y+" ");
    }
    System.out.println();
}
    }
}
