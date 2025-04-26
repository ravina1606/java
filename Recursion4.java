public class Recursion4 {

    public static boolean isSorted(int arr[],int idx)
    {
        if(idx==arr.length-1){
           return true;
        }
        
        if(arr[idx]<arr[idx+1]){
            return isSorted(arr, idx+1);
        }
    else{
        return false;
    }
}
 public static void main(String[] args) {
    int arr[]={1,3,5};
    //time complexity=O(n)
    System.out.println(isSorted(arr, 0));
 }   
}
