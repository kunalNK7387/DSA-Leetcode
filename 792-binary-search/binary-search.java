class Solution {
    public int search(int[] arr, int target) {
        int n=arr.length;
        int start=0;
        int end= n-1;
        int mid=start+(end - start)/2;
        while(start <= end){
            //Compare targetvalue by mid value
            if(arr[mid]==target){
                //TGT found
                return mid;
            } else if(target>arr[mid]){
                //go to rightside
                start=mid+1;
            }else{
                //go to left side
                end=mid-1;
            }
            //update mid
            mid=start+(end-start)/2;
        }
        //if not found return -1
        return -1;
    }
}