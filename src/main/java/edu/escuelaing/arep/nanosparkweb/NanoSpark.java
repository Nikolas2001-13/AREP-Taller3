package edu.escuelaing.arep.nanosparkweb;

public class NanoSpark {

    public static void get(String path, String body){
        NanoSparkServer nanosvr = NanoSparkServer.getInstance();
        nanosvr.get(path, body);
    }

}
