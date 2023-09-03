package com.mustafa.designpatterns.creationalPatterns.builderPattern;

public class BuilderMain {

    public static void main(String[] args) {
        EndpointBuilder eb = new EndpointBuilder("http://localhost:3000");

        eb
                .append("api")
                .append("v1")
                .append("user")
                .appendParam("id", "61")
                .appendParam("username", "Mustafa");

        String url = eb.build();

        System.out.println("Final url = " + url);
    }
}
