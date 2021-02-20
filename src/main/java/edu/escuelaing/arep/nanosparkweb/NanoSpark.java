package edu.escuelaing.arep.nanosparkweb;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

import java.util.function.BiFunction;

public class NanoSpark {

    /**
     * obtiene el path y el body
     * @param path string
     * @param body bifunction
     */
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
