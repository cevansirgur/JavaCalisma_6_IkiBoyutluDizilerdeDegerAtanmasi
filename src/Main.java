public class Main {

    public static void main(String[] args) {
        double sayi[][] = {
                .{1299.0,1071.0,1923.0,1453.0}//1.satir
                .{5.71,6.22,6.32,10.71}//2.satir
                .{1.0,2.0,3.0,4.7}//3.satir
        };
        System.out.println(sayi[0][0]);
        System.out.println(sayi[1][0]);
        System.out.println(sayi[2][0]);
        System.out.println(sayi[3][0]);

        for (int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                System.out.print("  "+sayi[i][j]);
            }
            System.out.println();
        }
    }
}
