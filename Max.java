public class Max {
    public int findMax(int a, int b, int c) {
        int max;
        
        if (a > b) {
            if (a > c) {
                max = a;  
            } else {
                max = c;  
            }
        } else {
            if (b > c) {
                max = b;  
            } else {
                max = c; 
            }
        }
        return max;  
    }
    
    public static void main(String[] args) {
        Max m = new Max();
        int maximum = m.findMax(5, 8, 10);
        System.out.println("The max number is: " + maximum);
    }
}