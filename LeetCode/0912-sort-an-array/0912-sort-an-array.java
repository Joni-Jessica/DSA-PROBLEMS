class Solution {
    public void ms(int n,int[] arr,int low,int mid,int high){
        int[] temp=new int[high-low+1];
        int p1=low,p2=mid+1,k=0;
        while(p1<=mid && p2<=high){
            if(arr[p1]<arr[p2]){
                temp[k++]=arr[p1++];
            }else{
                temp[k++]=arr[p2++];
            }
        }
        while(p1<=mid) temp[k++]=arr[p1++];
        while(p2<=high) temp[k++]=arr[p2++];
        for(int i=low;i<=high;i++){
            arr[i]=temp[i-low];
        }
    }
    public void merge(int n,int[] arr,int low,int high){
        if(low==high) return;
        int mid=(low+high)/2;
        merge(n,arr,low,mid);
        merge(n,arr,mid+1,high);
        ms(n,arr,low,mid,high);
    }
    public int[] sortArray(int[] nums) {
        int n=nums.length;
        merge(n,nums,0,n-1);
        return nums;
    }
}