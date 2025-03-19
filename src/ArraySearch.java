public class ArraySearch {
    static int search(int arr[], int x) {
        int i;
        boolean isFound=true;
        // Your code here
        for(i=0;i<arr.length;i++){
            if(x == arr[i]){
                isFound = true;
                break;
            }
            else{
                isFound = false;
            }
        }
        return isFound ? i:-1;
    }
    public static void main(String[] args){
        int[] arr= {1,2,3,4,5,6,7};
        int x = 7;
        int y = 9;
        System.out.println("Item found at: "+search(arr,x));
        System.out.println("Item found at: "+search(arr,y));

    }
}
