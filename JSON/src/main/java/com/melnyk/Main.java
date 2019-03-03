package com.melnyk;

import com.github.fge.jsonschema.core.exceptions.ProcessingException;
import com.melnyk.comparator.CompareGems;
import com.melnyk.json.jackson.JSONJacksonParser;
import com.melnyk.json.validator.JSONNewValidator;
import com.melnyk.json.validator.JSONValidator;
import com.melnyk.model.Gem;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    File jsonFile = new File("src/main/resources/json/gem.json");
    File jsonSchemaFile = new File("src/main/resources/json/gemSchema.json");

    JSONValidator.validateSchema(jsonSchemaFile, jsonFile);
    try {
      JSONNewValidator.validate(jsonFile, jsonSchemaFile);
    } catch (IOException | ProcessingException e) {
      e.printStackTrace();
    }

    JSONJacksonParser parser = new JSONJacksonParser();

    printList(parser.getGemList(jsonFile));
  }

  private static void printList(List<Gem> gems) {
    Collections.sort(gems, new CompareGems());
    System.out.println("Jackson: sorted by value");
    for (Gem gem : gems) {
      System.out.println(gem);
    }
  }
}
