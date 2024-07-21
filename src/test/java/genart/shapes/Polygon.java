package genart.shapes;

import genart.maths.vectors.Vector2D;

public class Polygon extends Shape{
    int sides;
    double angle;

    // Constructors
    public Polygon(){
        super();
        this.sides = 1;
    }
    public Polygon(Vector2D position, double radius, int sides){
        super(position, radius);
        this.sides = sides;
        this.angle = 0;
    }
    public Polygon(double x, double y, double r, int s){
        super(x, y, r);
        this.sides = s;
        this.angle = 0;
    }

    // Accessors and Mutators
    public int getSides() { return sides; }
    public void setSides(int sides){
        if(sides < 3){
            throw(new IllegalArgumentException("Polygons cannot have less than three (3) sides."));
        }else{
            this.sides = sides;
        }
    }

    public double getAngle(){ return angle; }
    public void setAngle(double theta) { this.angle = theta; }

    // For k = 0,...,n - 1
    // xn = X + R cos(k(2pi/n) + theta)
    // yn = Y + R sin(k(2pi/n) + theta)
    public Vector2D[] getVertices(){
        Vector2D[] vertices = new Vector2D[sides];
        for(int n = 0; n < sides; n++){
            double t = (2 * Math.PI) * ((double) n / sides);
            double x = Math.cos(t + angle) * radius + position.x;
            double y = Math.sin(t + angle) * radius + position.y;
            vertices[n] = new Vector2D(x, y);
        }
        return vertices;
    }
}
