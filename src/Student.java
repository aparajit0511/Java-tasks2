import java.util.ArrayList;

public class Student {

    private String name;
    private String grade;
    private final ArrayList<String> courses;

    public Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<String>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public ArrayList<String> getCourses() {
        return courses;
    }

    public void addCourse(String course){
        courses.add(course);

    }

    public void removeCourse(String course){
        courses.remove(course);
    }

    public void printStudentCourses(){
        System.out.println("Name is: " + name + " and Grade is: "+ grade);
    }
}
