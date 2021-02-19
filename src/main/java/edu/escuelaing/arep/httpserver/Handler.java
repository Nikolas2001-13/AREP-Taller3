package edu.escuelaing.arep.httpserver;

public interface Handler<T> {

    public T handle(String path);

}
