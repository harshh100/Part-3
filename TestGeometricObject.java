import java.util.*;

abstract class GeometricObject {
    private String color = "white";
    private boolean filled;
    private java.util.Date dateCreated;

    /* Construct a default geometric object */
    protected GeometricObject() {
        dateCreated = new java.util.Date();
    }

    /* Return color */
    public String getColor() {
        return color;
    }

    /* Set a new color */
    public void setColor(String color) {
        this.color = color;
    }

    /*
     * Return filled. Since filled is boolean,
     * so, the get method name is isFilled
     */
    public boolean isFilled() {
        return filled;
    }

    /* Set a new filled */
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /* Get dateCreated */
    public java.util.Date getDateCreated;
    {

    }

    /* Return a string representation of this object */
    public String toString() {
        return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
    }

    /* Abstract method getArea */
    public abstract double getArea();

    /* Abstract method getPerimeter */
    public abstract double getPerimeter();
}

class Rectangle1 extends GeometricObject {
    private double width;
    private double height;

    public Rectangle1() {
    }

    public Rectangle1(double width, double height) {
        this.width = width;
        this.height = height;
    }

    /* Return width */
    public double getWidth() {
        return width;
    }

    /* Set a new width */
    public void setWidth(double width) {
        this.width = width;
    }

    /* Return height */
    public double getHeight() {
        return height;
    }

    /* Set a new height */
    public void setHeight(double height) {
        this.height = height;
    }

    /* Return area */
    public double getArea() {
        return width * height;
    }

    /* Return perimeter */
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

class Circle extends GeometricObject {
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    /* Return radius */
    public double getRadius() {
        return radius;
    }

    /* Set a new radius */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /* Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /* Return area */
    public double getArea() {
        return radius * radius * Math.PI;
    }

    /* Return perimeter */
    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /* Print the circle info */
    public void printCircle() {
        System.out.println("The circle is created " + " and the radius is " + radius);

    }
}

public class TestGeometricObject {
    /* Main method */
    public static void main(String[] args) {
        // Declare and initialize two geometric objects
        GeometricObject geoObject1 = new Circle(5);
        GeometricObject geoObject2 = new Rectangle1(5, 3);

        System.out.println("The two objects have the same area? " + equalArea(geoObject1, geoObject2));

        // Display circle
        displayGeometricObject(geoObject1);

        // Display rectangle
        displayGeometricObject(geoObject2);
        System.out.println("Createed by harsh patel_id no 21ce090");

    }

    /* A method for comparing the areas of two geometric objects */
    public static boolean equalArea(GeometricObject object1, GeometricObject object2) {
        return object1.getArea() == object2.getArea();
    }

    /* A method for displaying a geometric object */
    public static void displayGeometricObject(GeometricObject object) {

        // Createed by harsh patel_id no 21ce090
        System.out.println();
        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());

    }

}
