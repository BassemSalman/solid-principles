package OpenClosed;

public class Rectangle extends Shape{
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height=height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public void draw(){
        System.out.println("Drawing a Rectangle of width : " + width + ", height: " + height);
    }
}
