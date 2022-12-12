import java.util.Scanner;

public class XOX {

    public static void main(String[] args) {
        char[][] oyunTahtasi={{'1', '2', '3'}, {'4', '5', '6'}, {'7', '8', '9'}};
        int tur=0;
        XOX hehe=new XOX();/* metotlari kullanmak icin gecerli sinifimizden nesne tanimladim*/
       oyunTahtasiGuncel(oyunTahtasi);
        String bilgiMesaji="XOX Oyununa hosgeldiniz.\n" +
                "Oyun iki kisiliktir: Ilk oyuncu 'X', ikinci oyuncu 'O'yu oynamaktadir.\n" +
                "Oyuna baslamak icin konum giriniz(1-9):";

        System.out.println(bilgiMesaji);
        Scanner oyuncu=new Scanner(System.in);

        kontrol:
        for(int i=0;i<9;i++){
        if(tur%2==0){
            int oyuncuOynadi=oyuncu.nextInt();
            hehe.ilkOyuncuOynadi(oyuncuOynadi,oyunTahtasi);
            oyunTahtasiGuncel(oyunTahtasi);
            if(hehe.birinciOyuncuKazandi(oyunTahtasi)==true|| hehe.ikinciOyuncuKazandi(oyunTahtasi)==true){
                if(hehe.birinciOyuncuKazandi(oyunTahtasi)==true){
                    System.out.println("Birinci Oyuncu Kazandi!!!");
                }
                else {
                    System.out.println("Ikinci Oyuncu Kazandi!!!");
                }
               break kontrol;
            }
            if(i==8){}else{System.out.println("Siradaki oyuncu");}

            tur++;
        }
        else{
            int oyuncuOynadi=oyuncu.nextInt();
            hehe.ikinciOyuncuOynadi(oyuncuOynadi,oyunTahtasi);
            oyunTahtasiGuncel(oyunTahtasi);

            if(hehe.birinciOyuncuKazandi(oyunTahtasi)==true|| hehe.ikinciOyuncuKazandi(oyunTahtasi)==true){
                if(hehe.birinciOyuncuKazandi(oyunTahtasi)==true){
                    System.out.println("Birinci Oyuncu Kazandi!!!");
                }
                else {
                    System.out.println("Ikinci Oyuncu Kazandi!!!");
                }
                break kontrol;
            }
            if(i==8){}else{System.out.println("Siradaki oyuncu");}
            tur++;
        }}
        if(hehe.birinciOyuncuKazandi(oyunTahtasi)==false && hehe.ikinciOyuncuKazandi(oyunTahtasi)==false){
            System.out.println("Oyun Berabere!!!");
            System.out.println("Oynadiginiz icin tesekkurler :)");

        }
        else {
            System.out.println("Oynadiginiz icin tesekkurler :)");

        }
    }

    public void ilkOyuncuOynadi(int pozisyon, char[][] oyunTahtasi){
        if (pozisyon==1){oyunTahtasi[0][0] = 'X';}
        else if (pozisyon==2) {oyunTahtasi[0][1] = 'X';}
        else if (pozisyon==3) {oyunTahtasi[0][2] = 'X';}
        else if (pozisyon==4) {oyunTahtasi[1][0] = 'X';}
        else if (pozisyon==5) {oyunTahtasi[1][1] = 'X';}
        else if (pozisyon==6) {oyunTahtasi[1][2] = 'X';}
        else if (pozisyon==7) {oyunTahtasi[2][0] = 'X';}
        else if (pozisyon==8) {oyunTahtasi[2][1] = 'X';}
        else if (pozisyon==9) {oyunTahtasi[2][2] = 'X';}
        else{
            System.out.println("Hatali konum girisi yapildi");
        }
    }
    public void ikinciOyuncuOynadi(int pozisyon, char[][] oyunTahtasi){
        if (pozisyon==1){oyunTahtasi[0][0] = 'O';}
        else if (pozisyon==2) {oyunTahtasi[0][1] = 'O';}
        else if (pozisyon==3) {oyunTahtasi[0][2] = 'O';}
        else if (pozisyon==4) {oyunTahtasi[1][0] = 'O';}
        else if (pozisyon==5) {oyunTahtasi[1][1] = 'O';}
        else if (pozisyon==6) {oyunTahtasi[1][2] = 'O';}
        else if (pozisyon==7) {oyunTahtasi[2][0] = 'O';}
        else if (pozisyon==8) {oyunTahtasi[2][1] = 'O';}
        else if (pozisyon==9) {oyunTahtasi[2][2] = 'O';}
        else{
            System.out.println("Hatali konum girisi yapildi");
        }

    }

    public static void oyunTahtasiGuncel(char[][] oyunTahtasi) {
        System.out.println(oyunTahtasi[0][0] + "|" +  oyunTahtasi[0][1] + "|" +  oyunTahtasi[0][2] );
        System.out.println("-+-+-");
        System.out.println(oyunTahtasi[1][0] + "|" +  oyunTahtasi[1][1] + "|" +  oyunTahtasi[1][2] );
        System.out.println("-+-+-");
        System.out.println(oyunTahtasi[2][0] + "|" +  oyunTahtasi[2][1] + "|" +  oyunTahtasi[2][2] );
    }
    public boolean birinciOyuncuKazandi(char[][] oyunTahtasi ){
        char isaret='X';
        if ((oyunTahtasi[0][0] == isaret && oyunTahtasi [0][1] == isaret && oyunTahtasi [0][2] == isaret) ||
                (oyunTahtasi[1][0] == isaret && oyunTahtasi [1][1] == isaret && oyunTahtasi [1][2] == isaret) ||
                (oyunTahtasi[2][0] == isaret && oyunTahtasi [2][1] == isaret && oyunTahtasi [2][2] == isaret) ||

                (oyunTahtasi[0][0] == isaret && oyunTahtasi [1][0] == isaret && oyunTahtasi [2][0] == isaret) ||
                (oyunTahtasi[0][1] == isaret && oyunTahtasi [1][1] == isaret && oyunTahtasi [2][1] == isaret) ||
                (oyunTahtasi[0][2] == isaret && oyunTahtasi [1][2] == isaret && oyunTahtasi [2][2] == isaret) ||

                (oyunTahtasi[0][0] == isaret && oyunTahtasi [1][1] == isaret && oyunTahtasi [2][2] == isaret) ||
                (oyunTahtasi[0][2] == isaret && oyunTahtasi [1][1] == isaret && oyunTahtasi [2][0] == isaret) ) {

return true;


        }else {
            return false;
        }

    }
    public boolean ikinciOyuncuKazandi(char[][] oyunTahtasi ){
        char isaret='O';
        if ((oyunTahtasi[0][0] == isaret && oyunTahtasi [0][1] == isaret && oyunTahtasi [0][2] == isaret) ||
                (oyunTahtasi[1][0] == isaret && oyunTahtasi [1][1] == isaret && oyunTahtasi [1][2] == isaret) ||
                (oyunTahtasi[2][0] == isaret && oyunTahtasi [2][1] == isaret && oyunTahtasi [2][2] == isaret) ||

                (oyunTahtasi[0][0] == isaret && oyunTahtasi [1][0] == isaret && oyunTahtasi [2][0] == isaret) ||
                (oyunTahtasi[0][1] == isaret && oyunTahtasi [1][1] == isaret && oyunTahtasi [2][1] == isaret) ||
                (oyunTahtasi[0][2] == isaret && oyunTahtasi [1][2] == isaret && oyunTahtasi [2][2] == isaret) ||

                (oyunTahtasi[0][0] == isaret && oyunTahtasi [1][1] == isaret && oyunTahtasi [2][2] == isaret) ||
                (oyunTahtasi[0][2] == isaret && oyunTahtasi [1][1] == isaret && oyunTahtasi [2][0] == isaret) ) {

return true;


        }else {
            return false;
        }

    }






}


