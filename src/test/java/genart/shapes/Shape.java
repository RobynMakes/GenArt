package genart.shapes;

import genart.maths.vectors.Vector2D;

public class Shape {
    // Properties
    Vector2D position;
    double radius;

    // Constructors
    public Shape(){
        this.position = new Vector2D();
        this.radius = 0;
    }

    public Shape(Vector2D position, double radius){
        this.position = position;
        this.radius = radius;
    }

    public Shape(double x, double y, double r){
        this.position = new Vector2D(x, y);
        this.radius = r;
    }

    // Accessors and Mutators
    public Vector2D getPosition() { return position; }
    public void setPosition(double x, double y){
        this.position.x = x;
        this.position.y = y;
    }
    public void setPosition(Vector2D position){ this.position = position; }

    public double getRadius() { return this.radius; }
    public void setRadius(double radius) { this.radius = radius; }
}
