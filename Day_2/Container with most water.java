// 11. Container With Most Water



// You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

// Find two lines that together with the x-axis form a container, such that the container contains the most water.

// Return the maximum amount of water a container can store.

// Notice that you may not slant the container.


class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length-1;

        int area = 0;
        while(i<j) {
            int heightVar = (height[i] > height[j] ? height[j] : height[i]);
            int areaVar = heightVar * (j-i);
            if(areaVar > area) {
                area = areaVar;
            }
            while(height[i] <= heightVar && i<j) {
                i++;
            }
            while(height[j] <= heightVar && i<j) {
                j--;
            }
        }

        return area;


    }
}