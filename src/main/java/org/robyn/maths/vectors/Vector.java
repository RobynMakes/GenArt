package org.robyn.maths.vectors;

public class Vector {
    // Properties
    public double x;

    // Constructors
    /**
     * Default constructor.
     * @apiNote the x component is set to 0.
     */
    public Vector(){
        this.x = 0;
    }
    /**
     * Constructor for the vector class.
     * @param x the value of the x component.
     */
    public Vector(double x){
        this.x = x;
    }

    // Addition
    public static Vector add(Vector a, Vector b){
        return new Vector(a.x + b.x );
    }
    public Vector add(Vector b){
        this.x += b.x;
        return this;
    }

    // Subtraction
    public static Vector sub(Vector a, Vector b){
        return new Vector(a.x - b.x);
    }
    public Vector sub(Vector b){
        this.x -= b.x;
        return this;
    }

    // Multiplication
    public static Vector mult(Vector a, Vector b){
        return new Vector(a.x * b.x);
    }
    public Vector mult(Vector b){
        this.x *= b.x;
        return this;
    }

    // Division
    public static Vector div(Vector a, Vector b){
        return new Vector(a.x / b.x);
    }
    public Vector div(Vector b){
        this.x /= b.x;
        return this
    }

    // Dot Product
    public static double dot(Vector a, Vector b){
        return a.x * b.x;
    }
    public double dot(Vector b){
        return this.x * b.x;
    }
}
