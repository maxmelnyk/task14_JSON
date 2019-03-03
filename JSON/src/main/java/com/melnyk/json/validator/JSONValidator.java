package com.melnyk.json.validator;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import org.everit.json.schema.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JSONValidator {

  public static boolean validateSchema(File schema, File json) {
    try (InputStream jsonInput = new FileInputStream(json);
        InputStream schemaInput = new FileInputStream(schema)) {
      JSONObject schemaObj = new JSONObject(new JSONTokener(schemaInput));
      JSONArray jsonArray = new JSONArray(new JSONTokener(jsonInput));

      Schema schemaCheck = SchemaLoader.builder().schemaJson(schemaObj)
          .draftV7Support().build().load().build();
      schemaCheck.validate(jsonArray);
    } catch (IOException e) {
      e.printStackTrace();
    }
    return true;
  }
}
