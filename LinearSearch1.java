public class LinearSearch1{
    public static int linearSearch(int [] arr, int target){
        int i;
        for(i=0;i<=arr.length;i++){
            if(arr[i] == target){
                System.out.println("The position of element is: ");
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr ={10,22,43,35,78};
        int target = 20;
        System.out.println(linearSearch(arr,target));
    }
}