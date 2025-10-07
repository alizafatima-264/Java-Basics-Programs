public class Table {
    public static void displayTable() {
        int no = 5;
        for (int i = 1; i <= 10; i++) {
            System.out.println(no + " x " + i + " = " + (no * i));
        }
    }
    public static void main(String[] args) {
        displayTable();
    }
}