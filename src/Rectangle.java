public class Rectangle implements Shape {

    private double length;
    private double width;
    private double area;

    private double parameter;

    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        area = length * width;
        return area;
    }

    @Override
    public double getParameter() {
        parameter = 2 * (length + width);
        return parameter;
    }
}
