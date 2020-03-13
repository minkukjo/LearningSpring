package me.harry.springbootgettingstarted.controller;

import me.harry.springbootgettingstarted.model.Hello;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class SampleController {

    @GetMapping("/hello")
    public Hello hello() {
        Hello hello = new Hello();
        hello.setPrefix("Hey,");
        hello.setName("harry");

        Link link = linkTo(methodOn(SampleController.class).hello()).withSelfRel();
        hello.add(link);


        return hello;
    }
}
