package bugs.bug_5_RectanglePlus_class_should_not_be_abstract;

import javax.print.DocFlavor;

public class RectanglePlus implements Relatable {

    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public RectanglePlus() {
        origin = new Point(0, 0);
    }

    public RectanglePlus(Point p) {
        origin = p;
    }

    public RectanglePlus(int w, int h) {
        origin = new Point(0, 0);
        width = w;
        height = h;
    }

    public RectanglePlus(Point p, int w, int h) {
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y) {
        origin.x = x;
        origin.y = y;
    }

    // a method for computing
    // the area of the rectangle
    public int getArea() {
        return width * height;
    }

    // a method required to implement
    // the Relatable interface
    public String isLarger(Relatable other) {
        RectanglePlus otherRect
                = (RectanglePlus) other;
        if (this.getArea() < otherRect.getArea())
            return "not larger";
        else if (this.getArea() > otherRect.getArea())
            return "larger";
        else
            return "equal";
    }

    public static void main(String[] args) {
        RectanglePlus rectangle = new RectanglePlus(5, 4);
        RectanglePlus rectangle2 = new RectanglePlus(new Point(1,2), 10, 11);
        System.out.println("rectangle area is: " + rectangle.getArea());
        System.out.println("Comparison: rectangle is " + rectangle.isLarger(rectangle2) + " than rectangle2");
    }
}

class Point {
    int top;
    int left;
    int x;
    int y;

    public Point(int t, int l) {
        top = t;
        left = l;
    }
}
