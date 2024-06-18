public class BSearching {
    public static int binarySearch(int [] a, int target){
        int low = 0;
        int high = a.length - 1;
        while(low <= high){
            int mid = low + high / 2;
            if(a[mid] == target){
                return mid;
            }
            else if(a[mid] < target){
                low = mid + 1;
            }
            else{
                high = mid -1;
            }
           
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        int target = 20;
        System.out.print("The position elememt is at index: ");
        System.out.println(binarySearch(arr, target));

    }
}
