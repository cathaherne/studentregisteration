package studentregistration;

import org.joda.time.LocalDate;
import org.joda.time.Years;


/**
 * Created by Catherine on 02/10/2016.
 */
public class Student {

    private String name;
    private int studentId;

    private LocalDate dob;
    private int age;

    private String username;

    private CourseProgramme course;


    //Constructor
    public Student(String name, int id, LocalDate dob, CourseProgramme course){

        this.name = name;
        this.studentId = id;
        this.course = course;
        this.dob = dob;

        LocalDate currTime = new LocalDate().now();
        this.age = Years.yearsBetween(dob,currTime).getYears();

        this.username = getUsername();

    }

    //toString
    public String toString(){
        return "Name:\t\t" + this.name + "\nID:\t\t\t" + this.studentId + "\nDOB:\t\t" + this.dob + "\nAge:\t\t" + this.age + "\nUsername:\t" + this.username + "\nCourse:\t\t" + this.course.toString();
    }


    //GetUsername Method
    public String getUsername(){
        return this.name.concat(this.age + "").replaceAll("\\s+","");
    }




    //Getters & Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CourseProgramme getCourse() {
        return course;
    }

    public void setCourse(CourseProgramme course) {
        this.course = course;
    }



}
