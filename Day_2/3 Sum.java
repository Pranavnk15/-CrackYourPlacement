// 15. 3Sum

// Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

// Notice that the solution set must not contain duplicate triplets.


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      
    //     Arrays.sort(nums);
    //   List<List<Integer>> result = new ArrayList<>();
    //     for(int i = 0; i<nums.length-2; i++) {
    //        if(i > 0 && nums[i] == nums[i-1]) {
    //            continue; //skip duplicate elements for i;
    //        }

    //        int j = i+1;
    //        int k = nums.length-1;

    //        while(j<k) {
    //            int sum = nums[i]+nums[j]+nums[k];

    //            if(sum == 0) {
    //                //found a triplet with zero sum
    //                result.add(Arrays.asList(nums[i], nums[j], nums[k]));

    //                 while(j < k && nums[j] == nums[j+1]) {
    //                     j++; //skip duplicate elements for j
    //                 }
    //                 while(j < k && nums[k] == nums[k-1]) {
    //                     k--; //skip duplicate elements for k
    //                 }

    //                 j++;
    //                 k--;//move the pointers
    //            } else if(sum < 0) {
    //                j++; //sum is less than zero, increment j to increase the sum
    //            } else {
    //                k--; //sum is greaer than zero, decrement k to decrease the sum
    //            }
    //        }
    //     }   
    //     return result;
            List<List<Integer>> ans = new ArrayList<>();
            Arrays.sort(nums);
            for(int i = 0; i<nums.length-2; i++){
                if(i > 0 && nums[i] == nums[i-1]) {
                    continue;
                }
                int j = i+1;
                int k = nums.length-1;

                while(j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if(sum == 0) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                        while(j < k && nums[j] == nums[j+1]) {
                            j++;
                        }
                        while(j < k && nums[k] == nums[k-1]) {
                            k--;
                        }
                        j++;
                        k--;
                    } else if(sum < 0) {
                        j++;
                    } else {
                        k--;
                    }
                }
            }
            return ans;
    }
}