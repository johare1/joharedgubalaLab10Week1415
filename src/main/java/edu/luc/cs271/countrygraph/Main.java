package edu.luc.cs271.countrygraph;

import java.util.*;
import org.jgrapht.*;
import org.jgrapht.graph.*;
import org.jgrapht.traverse.*;

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

    // print resulting graph
    System.out.print(myMap);

    final Iterator<String> breadthfirst = new BreadthFirstIterator<>(myMap, HU);

    while (breadthfirst.hasNext()) {

      final String country = breadthfirst.next();

      System.out.println("BreadthFirst - ");
      System.out.println(country);
    }
    
    final Iterator<String> breadthfirst2 = new BreadthFirstIterator<>(myMap, RO);

    while (breadthfirst2.hasNext()) {

      final String country = breadthfirst2.next();

      System.out.println("BreadthFirst2 - ");
      System.out.println(country);
    }

    final Iterator<String> closestfirst = new ClosestFirstIterator<>(myMap, HU);

    while (closestfirst.hasNext()) {

      final String country = closestfirst.next();

      System.out.println("ClosestFirst - ");
      System.out.println(country);
    }
    
    final Iterator<String> closestfirst2 = new ClosestFirstIterator<>(myMap, RO);

    while (closestfirst2.hasNext()) {

      final String country = closestfirst2.next();

      System.out.println("ClosestFirst2 - ");
      System.out.println(country);
    }

    final Iterator<String> depthfirst = new DepthFirstIterator<>(myMap, HU);

    while (depthfirst.hasNext()) {

      final String country = depthfirst.next();

      System.out.println("DepthFirst - ");
      System.out.println(country);
    }
    
    final Iterator<String> depthfirst2 = new DepthFirstIterator<>(myMap, RO);

    while (depthfirst2.hasNext()) {

      final String country = depthfirst2.next();

      System.out.println("DepthFirst2 - ");
      System.out.println(country);
    }
    
    
    final Iterator<String> randomwalk = new RandomWalkIterator<>(myMap, HU, false, 8);

    while (randomwalk.hasNext()) {

      final String country = randomwalk.next();

      System.out.println("RandomWalk - ");
      System.out.println(country);
      
      
    }
    
    final Iterator<String> randomwalk2 = new RandomWalkIterator<>(myMap, RO, false, 8);

    while (randomwalk2.hasNext()) {

      final String country = randomwalk2.next();

      System.out.println("RandomWalk2 - ");
      System.out.println(country);
      
      
    }
    
    
    GreedyColoring GCMap = new GreedyColoring(myMap);

    System.out.println(GCMap.getColoring());
    
    
  }
}
