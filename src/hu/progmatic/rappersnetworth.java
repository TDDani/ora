package hu.progmatic;

import java.util.Arrays;

public class rappersnetworth {
    public static void main(String[] args) {
        String[] rapname1 = {"Lil Peep", "Lil Skies", "XXXTENTACION", "Hella Sketchy", "Lil Tracy"};
        int[] rapname = {11331, 15455, 553, 1110, 40};
        int secx = 0;

        for (int i = 0; i < rapname1.length; i++) {
            for (int j = 0; j < rapname1.length - 1 - i; j++) {


                if (rapname[j] > rapname[j + 1]) {
                    int gecis = rapname[j + 1];
                    rapname[j+1] = rapname[j];
                    rapname[j] = gecis;
                    System.out.println(rapname1[secx] + " -nek " + rapname[j] + " dollárja van");
                    secx++;





                }
            }
            secx++;
        }
    }
}
