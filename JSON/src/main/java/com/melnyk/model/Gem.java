package com.melnyk.model;

public class Gem {

  private int number;
  private String name;
  private String preciousness;
  private String origin;
  private VisualParameters visualParameters;
  private int value;

  public Gem() {
  }

  public Gem(int number, String name, String preciousness, String origin,
      VisualParameters visualParameters, int value) {
    this.number = number;
    this.name = name;
    this.preciousness = preciousness;
    this.origin = origin;
    this.visualParameters = visualParameters;
    this.value = value;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPreciousness() {
    return preciousness;
  }

  public void setPreciousness(String preciousness) {
    this.preciousness = preciousness;
  }

  public String getOrigin() {
    return origin;
  }

  public void setOrigin(String origin) {
    this.origin = origin;
  }

  public VisualParameters getVisualParameters() {
    return visualParameters;
  }

  public void setVisualParameters(VisualParameters visualParameters) {
    this.visualParameters = visualParameters;
  }

  public int getValue() {
    return value;
  }

  public void setValue(int value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return "Gem{" +
        "number=" + number +
        ", name='" + name + '\'' +
        ", preciousness=" + preciousness +
        ", origin='" + origin + '\'' +
        ", visualParameters=" + visualParameters +
        ", value=" + value +
        '}';
  }
}
