package studentregistration;

import org.joda.time.LocalDate;

import java.util.ArrayList;

/**
 * Created by Catherine on 02/10/2016.
 */
public class CourseProgramme{

    private String courseName; //CS&IT, ECE, etc
    private LocalDate startDate;
    private LocalDate endDate;
    private ArrayList<Module> moduleList = new ArrayList<Module>();

    public CourseProgramme(String course, LocalDate startDate, LocalDate endDate){

        this.courseName = course;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public String toString(){
        return this.courseName;
    }

    //Method to add Modules to Courses
    public void addModule(Module moduleToAdd){
        moduleList.add(moduleToAdd);
    }


    //Getters & Setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public ArrayList<Module> getModuleList() {
        return moduleList;
    }

    public void setModuleList(ArrayList<Module> moduleList) {
        this.moduleList = moduleList;
    }
}
