package edu.escuelaing.arep.nanosparkweb.demo;

import static edu.escuelaing.arep.nanosparkweb.NanoSpark.*;

public class NanoSparkWebDemo {

    public static void main(String[] args){
        get("/hello", "<!DOCTYPE html>\n"
                + "<html>\n"
                + "<head>\n"
                + "<meta charset=\"UTF-8\">\n"
                + "<title>Title of the document</title>\n"
                + "</head>\n"
                + "<body>\n"
                + "<h1>get from NanoSpark</h1>\n"
                + "</body>\n"
                + "</html>\n");
    }
}

