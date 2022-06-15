package com.udemy.java.msc.cqrs.events.techbank.account.command;


import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;
import org.apache.camel.quarkus.main.CamelMainApplication;

/**
 * @author dougdb
 */
@QuarkusMain
public class CommandApplication {
  public static void main(String... args) {
    Quarkus.run(CamelMainApplication.class, args);
  }
}
