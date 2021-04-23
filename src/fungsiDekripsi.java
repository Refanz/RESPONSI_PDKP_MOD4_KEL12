public class fungsiDekripsi {

    static char[] ktr = {'0','1','2','3','4','5','6','7','8','9',',','.','+','a','b','c','d','e','f','g','h','i','j','k',
            'l','m','n','o','p','q','r','s','t','u'};

    static String str = "";

    static char[] ktr2;

    static void dekripsi(char []kataDekripsi, int geserKarakter){

        for(char c1 : kataDekripsi ){

            for(int i = 0; i <=33; i++){

                if(c1 == ktr[i]){

                    i = i-(geserKarakter);

                    if(i <= -1){

                        i = i + 34;

                    }

                    c1 = ktr[i];
                    str = str + c1;

                }
            }
        }

        System.out.println("Hasil Dekripsi : "+ str);






    }


}