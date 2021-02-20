package edu.escuelaing.arep.nanosparkweb;


import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;

import java.util.function.BiFunction;

public class NanoSpark {

    public static void get(String path, BiFunction<HttpRequest, HttpResponse, String> body){
        NanoSparkServer nanosvr = NanoSparkServer.getInstance();
        nanosvr.get(path, body);
    }

    public static void port(int port){
        NanoSparkServer server = NanoSparkServer.getInstance();
        server.port(port);
    }

    public static void startServer(){
        NanoSparkServer server = NanoSparkServer.getInstance();
        server.startServer();
    }
}
