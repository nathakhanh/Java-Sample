package main.practice.algoritm;// IMPORT LIBRARY PACKAGES NEEDED BY YOUR PROGRAM
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
// SOME CLASSES WITHIN A PACKAGE MAY BE RESTRICTED
// DEFINE ANY CLASS AND METHOD NEEDED
// CLASS BEGINS, THIS CLASS IS REQUIRED

public class CellProblem {

    public static void main (String[] args) {
        int[] states = {1,0,0,0,0,1,0,0};
        int days = 1;
        System.out.println(cellCompete(states, days));
    }

    public static List<Integer> cellCompete(int[] states, int days) {
        List<Integer> stateOfCells = new ArrayList<Integer>();
        for (int state : states) {
            stateOfCells.add(state);
        }
        
        for (int day = 0; day < days; day++) {
            List<Integer> currentStateOfCells = new ArrayList<Integer>(stateOfCells);

            int previousState = 0;
            for (int i = 0, j = 1; i < states.length; i++, j++) {
                int currentState = currentStateOfCells.get(i);
                int nextState = 0;
                if (j < states.length) {
                    nextState = currentStateOfCells.get(j);
                }
                
                if (previousState == nextState) {
                    stateOfCells.set(i, 0);
                } else {
                    stateOfCells.set(i, 1);
                }
                previousState = currentStateOfCells.get(i);
                
            }
        }
        return stateOfCells;
    }
}