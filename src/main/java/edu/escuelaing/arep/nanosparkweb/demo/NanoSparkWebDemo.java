package edu.escuelaing.arep.nanosparkweb.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import static edu.escuelaing.arep.nanosparkweb.NanoSpark.*;

public class NanoSparkWebDemo {

    public static void main(String[] args) throws IOException{
        port(getPort());
        String main = getFile("index.html");
        get("", (req, resp) -> main);
        String img = getFile("img.html");
        get("img", (req , resp) -> img);
        String css = getFile("style.css");
        get("css", (req, resp) -> css);
        String js = getFile("app.js");
        get("js", (req, resp) -> js);
        startServer();
    }

    /**
     * Obtiene el puerto por el cual va a correr
     * @return puerto
     */
    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 35000;
    }

    /**
     * Obtiene el documento que el usuario requiere
     * @param name tipo String
     * @return String
     * @throws IOException
     */
    static String getFile(String name) throws IOException {
        File htmlPage = new File(System.getProperty("user.dir"),"src/main/resources/public/"+name);
        FileReader reader = new FileReader(htmlPage);
        BufferedReader bufferedReader = new BufferedReader(reader);
        StringBuffer stringBuffer = new StringBuffer();
        String line;
        while((line = bufferedReader.readLine())!=null){
            stringBuffer.append(line);
            stringBuffer.append("\n");
        }
        reader.close();
        return stringBuffer.toString();
    }
}

