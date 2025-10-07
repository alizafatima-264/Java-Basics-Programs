public class Rectangle {
    int length;
    int breadth;

    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        int area;
        area = length * breadth;
        System.out.println("Rectangle Area: " + area);
        return area;
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 6);
        int area = r.area();
    }
}
