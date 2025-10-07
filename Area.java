public class Area {
    public int circleArea(double r) {
        int area;
        area = Math.PI * r * r;
        System.out.println("Circle Area: " + area);
        return area;
    }

    public static void main(String[] args) {
        Area a = new Area();
        int area = a.circleArea(4);
    }
}