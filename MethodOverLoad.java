public class MethodOverload {
    public static void display(int no) {
        System.out.println("Integer: " + no);
    }

    public static void display(String text) {
        System.out.println("String: " + text);
    }

    public static void main(String[] args) {
        display(100);
        display("Hello");
    }
}
