package edu.escuelaing.arep.nanosparkweb;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NanoSparkServer {

    private static NanoSparkServer _theInstance = new NanoSparkServer();
    private HttpServer hserver = new HttpServer();

    public static NanoSparkServer getInstance(){
        return _theInstance;
    }

    private Map<String, String> bodyMap = new HashMap();

    private  NanoSparkServer(){
        try {
            hserver.startServer();
        } catch (IOException e) {
            Logger.getLogger(NanoSparkServer.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void get(String path, String body) {
        bodyMap.put(path, body);
    }

    public String getValue(String path){
        return bodyMap.get(path);
    }
}
