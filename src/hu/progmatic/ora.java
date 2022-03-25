package hu.progmatic;

public class ora {
    public static void main(String[] args) {

    }
    public static void buborekol(int[] homersekletek, int korokszama) {
        for(int i = 0; i<homersekletek.length-korokszama-1; i++){
            if(homersekletek[i]>homersekletek[i+1]){
                int switccc = homersekletek[i];
                homersekletek[i]=homersekletek[i+1];
                homersekletek[i+1]= switccc;
            }

        }


    }
}
