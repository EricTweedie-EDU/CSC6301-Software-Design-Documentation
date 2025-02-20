/** The following is the java implementation of Bubble Sort.
     * The sorting algorithm takes in an array of integers and sorts them 
     * according to the increasing order of the integers. 
     * The algorithm compares the value of one index to the neighboring index
     * and if the current index is greater then the following index a swap occurs.
     * This comparing will happen until the array is sorted or no swapping occurs.
     * @author Eric Tweedie
     * @version 1.0.0
     * @since week 2 of CSC6301 */


public class TweedieEricMod2Proj2 {
    /** The main method of the class that performs the function BubbleSort.
    * @param array array of integers (unsorted)
    * @return array sorted array of integers (sorted by increasing value) */
    public static int[] bubbleSort(int[] array, int n) {
    /** Function for BubbleSort.
    * @param array array of integers (unsorted)
    * @param n integer value of the length of the array
    * 
    * @return array sorted array of integers (sorted by increasing value) */
        // Traverse through all array elements
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Last i elements are already in place
            for (int j = 0; j < n - i - 1; j++) {
                // Swap if current element is greater than next
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true; // Swap occurred
                }
            }
                // If no two elements were swapped by inner loop, then the array is sorted
                if (swapped == false){
                break;
                }
            }
            return array;
        }
        // Function to print the array
    static void printArray(int arr[], int size){
    /** Function for printing the array.
    * @param array of integers (sorted by bubbleSort)
    * @param size number of elements in array
    */
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
        }
        
    public static void main(String args[]){
    /** Main method to drive the code.
    * @param args arguments is not used */
        // Test the bubbleSort method
        int[] array = {2, 45, 37, 21, 31, 50, 29, 22, 67, 88, 56};
        int n = array.length;
        System.out.println("Unsorted array:");
        printArray(array, n);
        array = bubbleSort(array, n);
        System.out.println("\nSorted array:");
        printArray(array, n);
    }
    
}
