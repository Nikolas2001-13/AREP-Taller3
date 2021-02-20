package edu.escuelaing.arep.httpserver;

import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface Handler {

    public String handle(String path, HttpRequest req, HttpResponse res);

}
