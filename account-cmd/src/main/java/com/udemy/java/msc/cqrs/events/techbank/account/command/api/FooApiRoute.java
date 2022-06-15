package com.udemy.java.msc.cqrs.events.techbank.account.command.api;


import lombok.NoArgsConstructor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.rest.RestBindingMode;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named
@NoArgsConstructor
@ApplicationScoped
public class FooApiRoute extends RouteBuilder {


  @Override
  public void configure() {

    restConfiguration().component("netty-http")
            .port(5000)
            .bindingMode(RestBindingMode.auto);


    rest("/say")
            .get("/hello/{language}")
            .to("direct:hi");


    from("direct:hi")
            .transform(simple("Hi ${header.language}"));

  }
}
