import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Student student1 = new Student("Aparajit","8.0");
        student1.printStudentCourses();
        student1.addCourse("Maths");
        student1.addCourse("Science");
        student1.addCourse("English");

        System.out.println("Student is : "+ student1.getName() + " and his courses are: " + student1.getCourses());

        student1.removeCourse("Science");

        System.out.println("Student is : "+ student1.getName() + " and his courses are: " + student1.getCourses());

        System.out.println("Rectangle dimensions");
        Rectangle  rectangle = new Rectangle(3.5, 2.5);
        System.out.println("Area is : " + rectangle.getArea());
        System.out.println("Parameter is : " + rectangle.getParameter());

        System.out.println("Circle dimensions");
        Circle circle = new Circle(4.14);
        System.out.println("Area is : " + circle.getArea());
        System.out.println("Parameter is : " + circle.getParameter());

    }
}