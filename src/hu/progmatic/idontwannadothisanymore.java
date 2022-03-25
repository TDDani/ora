package hu.progmatic;

import java.util.Arrays;

public class idontwannadothisanymore {
    public static void main(String[] args) {


        int[] homersekletek = {13, 41, 11, 21, 10, 50};
        String[] datumok = {"2022.01.01", "2022.01.02", "2022.01.03", "2022.01.04", "2022.01.05"};


        for(int i = 0; i<homersekletek.length; i++){
            for (int j = 0; j<homersekletek.length-1-i;j++){
                if(homersekletek[j]>homersekletek[j+1]) {
                    int kuya = homersekletek[j+1];
                    homersekletek[j+1] = homersekletek[j];
                    homersekletek[j] = kuya;

                    String datcsere = datumok[j];
                    datumok[j] = datumok[j+1];
                    datumok[j+1] = datcsere;
                }
            }
        }
        for(int i = 0; i < homersekletek.length-1; i++){
            System.out.println(datumok[i] + " " + homersekletek[i] + " fok");
        }

        System.out.println(Arrays.toString(homersekletek));

    }


}
