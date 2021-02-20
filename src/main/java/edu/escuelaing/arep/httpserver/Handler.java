package edu.escuelaing.arep.httpserver;

import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;

public interface Handler {

    public String handle(String path, HttpRequest req, HttpResponse res);

}
