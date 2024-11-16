package org.example;

import java.util.ArrayList;
import java.util.List;

public class stableMountains {
    public List<Integer> stableMountainsLength(int[] height, int threshold) {
        List<Integer> mountainHeights = new ArrayList<>();


        for(int i = 1; i < height.length ; i++){
            if(height[i-1] > threshold){
                mountainHeights.add(i);
            }
        }
        return mountainHeights;
    }
}
