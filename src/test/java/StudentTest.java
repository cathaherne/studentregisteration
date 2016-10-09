import org.joda.time.LocalDate;
import org.junit.Test;
import studentregistration.CourseProgramme;
import studentregistration.Student;

import static org.junit.Assert.assertEquals;

/**
 * Created by Catherine on 09/10/2016.
 */
public class StudentTest {

    CourseProgramme fme;
    Student testStudent;
    String methodUsername;
    String correctUsername;

    public StudentTest(){

        fme = new CourseProgramme("Financial Mathematics and Economics", new LocalDate("2016-09-01") ,new LocalDate("2020-05-01"));
        testStudent = new Student("Sally Tester", 13380000, new LocalDate("1995-11-11"), fme);

        methodUsername = testStudent.getUsername();
        correctUsername = "SallyTester20";

    }

    @Test
    public void testGetUsername(){
        assertEquals(methodUsername, correctUsername);
    }
}
