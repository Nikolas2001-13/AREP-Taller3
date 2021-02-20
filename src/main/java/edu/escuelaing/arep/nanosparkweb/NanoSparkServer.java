package edu.escuelaing.arep.nanosparkweb;

import edu.escuelaing.arep.httpserver.Handler;
import edu.escuelaing.arep.httpserver.HttpServer;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class NanoSparkServer implements Handler {

    private int httpPort;
    private static NanoSparkServer _theInstance = new NanoSparkServer();
    private HttpServer hserver = new HttpServer();
    Map<String, BiFunction<HttpRequest, HttpResponse, String>> functions = new HashMap();

    private NanoSparkServer(){
        hserver.registerHandler(this, "/");
    }

    public static NanoSparkServer getInstance(){
        return _theInstance;
    }

    private Map<String, BiFunction<HttpRequest, HttpResponse, String>> bodyMap = new HashMap();

    /**
     * Corre el servidor
     */
    void startServer(){
        try {
            hserver.startServer(httpPort);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * asigna el puerto del servidor
     * @param serverPort int
     */
    public void port(int serverPort) {
        this.httpPort = serverPort;
    }

    /**
     * obtiene el path
     * @param path string
     * @param body bifunction
     */
    public void get(String path, BiFunction<HttpRequest, HttpResponse, String> body) {

        bodyMap.put(path, body);
    }

    public BiFunction<HttpRequest, HttpResponse, String> getValue(String path){
        return bodyMap.get(path);
    }

    @Override
    public String handle(String path, HttpRequest req, HttpResponse res) {
        if (functions.containsKey(path)) {
            return httpHeader() + functions.get(path).apply(req , res);
        }
        return null;
    }

    private String httpHeader() {
        return "HTTP/1.1 200 OK\r\n" + "Content-Type: text/html\r\n" + "\r\n";
    }
}
