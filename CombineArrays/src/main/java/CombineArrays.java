import java.util.ArrayList;



public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        ArrayList<Integer> combinedArr = new ArrayList<Integer>();

        for (int i = 0 ; i < arr1.length ; i++){
            combinedArr.add(arr1[i]);
        }

        for (int j = 0 ; j < arr2.length ; j++){
            combinedArr.add(arr2[j]);

        }

        //int[] returnArr = new int[arr1.length + arr2.length];
        
        int[] returnArr = new int[combinedArr.size()];

        for (int i = 0 ; i < combinedArr.size() ; i++){
            returnArr[i] = combinedArr.get(i);
        }

        return returnArr;
    }
}
