package hu.progmatic;

import java.util.Arrays;

public class orta {
    public static void main(String[] args) {
        int[] homersekletek = {13, 10, 1, 46, 32, 22, 83, 21};

        for(int i = 0; i<homersekletek.length; i++){
            for(int j = 0; j < homersekletek.length-i-1; j++){
                if(homersekletek[i]>homersekletek[i+1]){
                    int switccc = homersekletek[i];
                    homersekletek[i]=homersekletek[i+1];
                    homersekletek[i+1]= switccc;
                }
            }
        }
        System.out.println(Arrays.toString(homersekletek));

    }
}
