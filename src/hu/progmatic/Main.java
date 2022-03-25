package hu.progmatic;

public class Main {

    public static void main(String[] args) {


        int[] plastic = {11, 22, 53, 11, 10, 457, 100, 48};
        int ref = 1;

        boolean kur = (boolean) wasthereHigher(plastic,ref);
        if(kur==true){
            System.out.println("Volt melegebb");
        }else{
            System.out.println("Nem volt melegebb");
        }

    }

    public static boolean wasthereHigher(int[] varoshomerekletek, int ref){
        boolean voltemelegebb = false;

        for(int i = 0; i<varoshomerekletek.length; i++){
            if(varoshomerekletek[i]>ref){
                voltemelegebb = true;
                break;
            }
        }
        return voltemelegebb;
    }
}
