package com.melnyk.comparator;

import com.melnyk.model.Gem;
import java.util.Comparator;

public class CompareGems implements Comparator<Gem> {

  public int compare(Gem o1, Gem o2) {
    return Integer.compare(o1.getValue(), o2.getValue());
  }
}
