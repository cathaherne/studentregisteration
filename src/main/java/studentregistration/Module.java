package studentregistration;

import java.util.ArrayList;

/**
 * Created by Catherine on 02/10/2016.
 */
public class Module {

    private String moduleName;
    private String moduleCode;
    private ArrayList<Student> studentList = new ArrayList<Student>();

    public Module(String name, String code){
        this.moduleName = name;
        this.moduleCode = code;

    }

    public String toString(){
        return "Module Code & Name:\t" + this.moduleCode + " " + this.moduleName + "\t\tNo. Students in Module:\t" + this.studentList.size();
    }

    //Method to add Students to Module
    public void addStudent(Student studentToAdd){
        studentList.add(studentToAdd);
    }


    //Getters & Setters
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }



}
