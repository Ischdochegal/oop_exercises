package ch.hslu.oop.sw06.Polymorphie;

/**
 * Beschreiben Sie hier die Klasse Rectangle.
 * 
 * @author Fabian Gröger
 * @version 17.10.2017
 */
public final class Rectangle extends Shape {
    
    private int width;
    private int height;
    
    public Rectangle(final int x, final int y, final int width, final int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    
    public void changeDimension(final int newWidth, final int newHeight) {
        this.width = newWidth;
        this.height = newHeight;
    }
    
    public int getWidth(){
        return this.width;
    }
    
    public int getHeight(){
        return this.height;
    }
    
    @Override
    public int getPerimeter() {
        return (2 * this.width) + (2 * this.height);
    }
    
    @Override
    public int getArea() {
        return this.width * this.height;
    }
}
