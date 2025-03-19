import java.util.ArrayList;

public class Alternate{

        public static void main(String []args){

            int arr[] = new int[]{1,2,3,4,5,6,7,8,9,10};
            for(int num :arr){
                System.out.print(num+" ");
            }
            System.out.println("\nAlternatives of arr: "+getAlternates(arr));

        }
    // function to print alternate elements of an array
    static ArrayList<Integer> getAlternates(int arr[]) {
        // Code Here
        ArrayList<Integer> arrayList = new ArrayList<>();


        for (int i=0; i< arr.length ; i++){
            if(i%2 == 0){
                arrayList.add(arr[i]);
            }
        }
        return arrayList;
    }
}


