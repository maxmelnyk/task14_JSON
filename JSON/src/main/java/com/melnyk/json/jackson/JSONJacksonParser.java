package com.melnyk.json.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.melnyk.model.Gem;
import java.io.File;
import java.util.Arrays;
import java.util.List;

public class JSONJacksonParser {
  private ObjectMapper objectMapper;

  public JSONJacksonParser() {
    this.objectMapper = new ObjectMapper();
  }

  public List<Gem> getGemList(File jsonFile) {
    Gem [] gems = new Gem[0];
    try{
      gems = objectMapper.readValue(jsonFile, Gem[].class);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return Arrays.asList(gems);
  }
}
