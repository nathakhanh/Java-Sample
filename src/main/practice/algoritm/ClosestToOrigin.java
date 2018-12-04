package main.practice.algoritm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClosestToOrigin {

  public static void main (String[] args) {
    System.out.println(nearestXsteakHouses(3, Arrays.asList(Arrays.asList(1,-3), Arrays.asList(1,2), Arrays.asList(3,4)), 1));
    System.out.println(nearestXsteakHouses(6, Arrays.asList(Arrays.asList(3,6), Arrays.asList(2,4), Arrays.asList(5,3), Arrays.asList(2,7), Arrays.asList(1,8), Arrays.asList(7,9)), 3));
  }

  static List<List<Integer>> nearestXsteakHouses(int totalSteakhouses, List<List<Integer>> allLocations, int numSteakhouses) {
    List<Double> distances = new ArrayList<>();
    Map<Double, List<Integer>> distanceMap = new HashMap<>();

    for (List<Integer> location : allLocations) {
      double distance = calDistance(location.get(0), location.get(1));
      distanceMap.put(distance, location);
      distances.add(distance);
    }

    Collections.sort(distances);

    List<List<Integer>> output = new ArrayList<>();

    for (int i = 0; i < numSteakhouses; i++) {
      output.add(distanceMap.get(distances.get(i)));
    }

    return output;
  }

  static double calDistance(int x, int y) {
    double distance = Math.sqrt((x * x) + (y * y));
    return distance;
  }


}
