package Basic;
/*
Find common elements:
L1=[56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 88, 72, 73, 74, 75, 76, 77, 78, 79, 80]
L2=[81, 82, 83, 1, 84, 85, 86, 87, 88, 60, 89, 90,1, 91, 92, 93]
 */

public class FindCommonElements {
    public static void main(String[] args) {
        int[] arr1 ={56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 88, 72, 73, 74, 75, 76, 77, 78, 79, 80};
        int[] arr2 = {81, 82, 83, 1, 84, 85, 86, 87, 88, 60, 89, 90,1, 91, 92, 93};
        System.out.println("Common Elements is: ");

        for (int i=0; i< arr1.length; i++){
            for (int j=0; j< arr2.length; j++){
                if (arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
