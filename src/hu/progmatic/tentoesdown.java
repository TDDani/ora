package hu.progmatic;

import java.util.Arrays;

public class tentoesdown {
    public static void main(String[] args) {
        int[] homersekletek = {11, 32, 11, 45, 42, 124, 56, 121, 11, 56, 12, 87, 32, 123, 44, 66, 53};
        System.out.println("HELLLO");

        for(int i = 0; i<homersekletek.length-1; i++){
            if(homersekletek[i]>homersekletek[i+1]){
                int switccc = homersekletek[i];
                homersekletek[i]=homersekletek[i+1];
                homersekletek[i+1]= switccc;
            }

        }

        System.out.println(Arrays.toString(homersekletek));
    }
}
