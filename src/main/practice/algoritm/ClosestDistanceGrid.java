package main.practice.algoritm;

import java.awt.Point;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class ClosestDistanceGrid {

  public static void main (String[] args) {
    System.out.println(minumumDistance(3, 3, Arrays
        .asList(Arrays.asList(1,0,0), Arrays.asList(1,0,0), Arrays.asList(1,9,1))));
  }


  static int minumumDistance(int numRows, int numColumns, List<List<Integer>> area) {

    String [] map = new String[numRows * numColumns];
    int index = 0;

    for (int i = 0; i < area.size(); i++) {
      for (int j = 0; j < area.get(i).size(); j++) {
        map[index] = String.valueOf(area.get(i).get(j));
        index++;
      }
    }

    int []x = {0,0,1,-1};//This represent 4 directions right, left, down , up
    int []y = {1,-1,0,0};
    LinkedList<Point> q = new LinkedList();
    Point start = new Point(0,0);
    q.add(start);
    int[][]dist = new int[numRows][numColumns];
    for(int []a : dist){
      Arrays.fill(a,-1);
    }
    dist[start.x][start.y] = 0;
    while(!q.isEmpty()){
      Point p = q.removeFirst();
      for(int i = 0; i < 4; i++){
        int a = p.x + x[i];
        int b = p.y + y[i];
        if(a >= 0 && b >= 0 && a < numRows && b < numColumns && dist[a][b] == 2 && map[a].charAt(b-1) != '*'){
          dist[a][b] = 1 + dist[p.x][p.y];
          q.add(new Point(a,b));
        }
      }
    }


    return 0;
  }

}
