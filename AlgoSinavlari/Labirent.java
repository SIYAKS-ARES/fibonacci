package AlgoSinavlari;

public class Labirent {
    public static void yollari_yaz(char[][] labirent, int m, int z, char bul, char yol[][]){
        int n = labirent.length;
        if (m < 0 || z < 0 || z >= n || m >= n || labirent[m][z] == '0' || yol[m][z] != ' '){
            return;
        }
        yol[m][z] = '1';
        if (labirent[m][z] == bul){
            yol[m][z] = bul;
        }
        if ((m == n - 1 && z == n - 1) || (labirent[m][z] == bul)){
            System.out.println("Labirent Çözüldü!!!");
            for (int a = 0; a < n; a++){
                for (int b = 0; b < n; b++){
                    System.out.print(yol[a][b] + " ");
                }
                System.out.println();
            }
            System.out.println();

            yol[m][z] = '0';
            return;
        }
        yollari_yaz(labirent, n - 1, z, bul, yol);
        yollari_yaz(labirent, m, z - 1, bul, yol);
        yollari_yaz(labirent, m, z + 1, bul, yol);
        yollari_yaz(labirent, m + 1, z, bul, yol);
        yol[m][z] = ' ';
    }
    public static void main(String[] args){
        char[][] labirent = {
                {'1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
                {'0','1','1','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
                {'0','0','0','1','1','1','1','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','0','1','0','0','1','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','0','1','1','0','1','0','0','0','0','0','0','0','0','1','0','0','0','0'},
                {'0','0','0','0','1','0','0','1','0','0','0','0','0','0','0','1','1','1','0','0'},
                {'0','0','1','1','1','0','0','0','1','0','0','0','0','0','0','0','0','1','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','0','0','0','1','0','0'},
                {'0','0','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','1','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','0','0','0','0','0','1','0','0','0','0','0'},
                {'0','1','1','1','0','0','0','0','0','0','0','0','0','0','1','1','1','1','0','0'},
                {'0','0','0','1','1','1','1','0','0','0','0','0','0','0','1','0','0','1','0','0'},
                {'0','0','0','1','0','0','1','0','0','0','0','0','0','0','1','0','0','1','0','0'},
                {'0','0','0','1','1','0','1','1','1','1','1','1','1','1','1','0','0','1','0','0'},
                {'0','0','0','0','1','0','0','1','0','0','0','0','0','0','0','0','0','0','0','0'},
                {'0','0','1','1','1','0','0','1','1','1','1','1','1','1','1','0','0','0','0','0'},
                {'0','0','1','0','0','0','0','0','0','1','0','0','0','0','1','0','0','0','0','0'},
                {'0','0','1','1','0','0','0','0','0','1','1','0','0','0','1','1','1','9','0','0'},
                {'0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0','0'},
        };
        olumcul_kacis(labirent);
    }
    public static void olumcul_kacis(char[][] labirent){
        char[][] yol = {
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
                {' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' '},
        };
        yollari_yaz(labirent, 0, 0, '9', yol);
    }
}
