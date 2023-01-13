package MasterCodingStart.BigO;

import java.sql.Array;

public class FindingNemoApp {

    public static void main(String[] args) {
        String nemo[] = {"nemo","Gill","bloat","bruce","Marlin","Squirt"};
        double startTime = System.nanoTime();
        for (int i = 0; i< nemo.length; i++ ){
            if (nemo[i] == "nemo"){
                System.out.println("nemo found!!");
                break;
            }
            else {
                System.out.println("Not Found!");
            }
        }
        double elapsedTime = System.nanoTime() - startTime;
        System.out.println("Elapsed time: " + elapsedTime+" nano seconds");
    }
    }
