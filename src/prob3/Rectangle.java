package prob3;

public class Rectangle implements Shapes {

    private double width;
    private double length;

    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double computeArea() {
        return  this.width * this.length;
    }
}
