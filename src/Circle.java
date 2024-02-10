public class Circle implements Shape {
    private double radius;
    private double area;
    private double parameter;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double getArea() {
        area = 3.14 * radius * radius;
        return area;
    }

    @Override
    public double getParameter() {
        parameter = 2 * 3.14 * radius;
        return parameter;
    }
}
