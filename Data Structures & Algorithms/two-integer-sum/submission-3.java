class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] pairs = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            pairs[i][0]=nums[i];
            pairs[i][1]=i;
        }

        Arrays.sort(pairs,Comparator.comparingInt(a->a[0]));
        int j=nums.length-1;
        int i=0;
        while(i<j){
            int cur=pairs[i][0]+pairs[j][0];
            if(cur==target){
                return new int[] {Math.min(pairs[i][1],pairs[j][1]),Math.max(pairs[i][1],pairs[j][1])};
            }
            if(cur<target){
                i++;
            }
            if(cur>target){
                j--;
            }
        }
        return new int[] {};
    }
}
