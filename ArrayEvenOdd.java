public class ArrayEvenOdd {
    public static void main(String[] args) {
        int[] arr = {10, 11, 12, 13, 14};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Even no: " + evenCount);
        System.out.println("Odd no: " + oddCount);
    }
}