package com.mustafa.designpatterns;

import com.mustafa.designpatterns.builder.EndpointBuilder;
import com.mustafa.designpatterns.builder.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

/*    public static void main(String[] args) {
        Person person = new Person.Builder().name("Mustafa").surname("Karakaş").address("İstanbul").build();

        System.out.println(person.getName() + " " + person.getSurname() + " " + person.getAddress());

        person.setAddress("Türkiye");
        System.out.println(person.getName() + " " + person.getSurname() + " " + person.getAddress());
    }*/

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
