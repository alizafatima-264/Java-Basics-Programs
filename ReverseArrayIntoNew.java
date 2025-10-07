public class ReverseArrayIntoNew {
    public static void main(String[] args) {

        // Original array
        int[] arr = {10, 20, 30, 40, 50};
        
        // New empty array with same size
        int[] reversed = new int[arr.length];
        
        // Fill reversed array from end of original
        int j = 0; // index for reversed array
        for (int i = arr.length - 1; i >= 0; i--) {
            reversed[j] = arr[i];
            j++;
        }
        
        // Print reversed array properly
        System.out.print("Reversed Array (new array): ");
        for (int i = 0; i < reversed.length; i++) {
            System.out.print(reversed[i] + " ");
        }
    }
}