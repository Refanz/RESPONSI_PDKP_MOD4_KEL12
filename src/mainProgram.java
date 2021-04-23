import java.util.Scanner;

public class mainProgram {

    static char[] ktr = {'0','1','2','3','4','5','6','7','8','9',',','.','+','a','b','c','d','e','f','g','h','i','j','k',
            'l','m','n','o','p','q','r','s','t','u'};

    static char [] kata = null;

    static Scanner input = new Scanner(System.in);

    static int geser = 0;

    static String str = "";

    static char [] kata2;


    static void enkripsi(char []kataEnkripsi, int geserKarakter){

        for(char c1 : kataEnkripsi ){

            for(int i = 0; i <=33; i++){

                if(c1 == ktr[i]){

                    i = i+(geserKarakter);

                    if(i >= 34){

                        i = i - 34;

                    }

                    c1 = ktr[i];
                    str = str + c1;

                }
            }
        }

        System.out.println("Hasil Enkripsi : "+ str);


    }


    public static void main(String[] args) {

         System.out.println("Masukkan kata yang akan dienkripsi daaan didekripsi : ");
         kata = input.next().toCharArray();

         System.out.println("Masukkan angka pergeseran huruf : ");
         geser = input.nextInt();

         enkripsi(kata,geser);

         char[] kata2 = str.toCharArray();

         fungsiDekripsi.dekripsi(kata2,geser);











    }




}
