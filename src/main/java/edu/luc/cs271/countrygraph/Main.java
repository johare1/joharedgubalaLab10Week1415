package edu.luc.cs271.countrygraph;

import java.util.*;


public class Main {

  public static void main(final String[] args) {

     final Graph<String, DefaultEdge> myMap = new SimpleGraph<>(DefaultEdge.class);


      
    final String HU = countryCodes.HU;
    final String UA = countryCodes.UA;
    final String SK = countryCodes.SK;
    final String AT = countryCodes.AT;
    final String HR = countryCodes.HR;
    final String RO = countryCodes.RO;
    final String RS = countryCodes.RS;

    myMap.addVertex(HU);
    myMap.addVertex(UA);
    myMap.addVertex(SK);
    myMap.addVertex(AT);
    myMap.addVertex(HR);
    myMap.addVertex(RO);
    myMap.addVertex(RS);

    myMap.addEdge(HU, UA);
    myMap.addEdge(HU, SK);
    myMap.addEdge(HU, AT);
    myMap.addEdge(HU, HR);
    myMap.addEdge(HU, RO);
    myMap.addEdge(SK, AT);
    myMap.addEdge(HR, RS);
    myMap.addEdge(RS, RO);
    


    myMap.addEdge(IL, IN);

    GeoGraph.addEdge(IL, KY);

    GeoGraph.addEdge(IL, MO);

    GeoGraph.addEdge(IL, WI);

    GeoGraph.addEdge(IL, IA);

    GeoGraph.addEdge(IN, KY);

    GeoGraph.addEdge(KY, MO);

    GeoGraph.addEdge(MO, IA);

    GeoGraph.addEdge(IA, WI);
     
     
     
     
  }
}
