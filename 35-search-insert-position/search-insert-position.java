class Solution {
    public int searchInsert(int[] arr, int target) {
        int n=arr.length;
        int start=0;
        int end=n-1;
        int mid= start+(end-start)/2;
        while(start<=end){
            if(arr[mid]==target){
                return mid;
            }else if(target>arr[mid]){
                start=mid+1;
            }else {
                end=mid-1;
            }
           
            mid=start+(end-start)/2;
        }
        return start;
    }
}