import java.util.Scanner;

abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

// Box
class Box extends ThreeDObject {
    double l, w, h;

    Box(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * (l*w + w*h + h*l);
    }

    double volume() {
        return l * w * h;
    }
}

// Cube
class Cube extends ThreeDObject {
    double side;

    Cube(double side) {
        this.side = side;
    }

    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    double volume() {
        return side * side * side;
    }
}

// Cylinder
class Cylinder extends ThreeDObject {
    double r, h;

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + h);
    }

    double volume() {
        return Math.PI * r * r * h;
    }
}

// Cone
class Cone extends ThreeDObject {
    double r, h;

    Cone(double r, double h) {
        this.r = r;
        this.h = h;
    }

    double wholeSurfaceArea() {
        double l = Math.sqrt(r*r + h*h); // slant height
        return Math.PI * r * (r + l);
    }

    double volume() {
        return (1.0/3) * Math.PI * r * r * h;
    }
}

public class Main3D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThreeDObject obj;

        // Box
        System.out.println("Enter length, width, height of Box:");
        obj = new Box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("Box Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Box Volume: " + obj.volume());

        // Cube
        System.out.println("\nEnter side of Cube:");
        obj = new Cube(sc.nextDouble());
        System.out.println("Cube Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Cube Volume: " + obj.volume());

        // Cylinder
        System.out.println("\nEnter radius and height of Cylinder:");
        obj = new Cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cylinder Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + obj.volume());

        // Cone
        System.out.println("\nEnter radius and height of Cone:");
        obj = new Cone(sc.nextDouble(), sc.nextDouble());
        System.out.println("Cone Surface Area: " + obj.wholeSurfaceArea());
        System.out.println("Cone Volume: " + obj.volume());

        sc.close();
    }
}
