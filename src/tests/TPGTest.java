package tests;

import com.tpg.question1.IPValidationRegex;
import com.tpg.question2.*;
import com.tpg.question3.TimeMeasurementTool;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class TPGTest {

    @Test
    //Question 1
    public void testIPaddressValiationFromFile() throws Exception{
        System.out.println ("Current directory is " + new File(".").getAbsolutePath());

        IPValidationRegex ipValidationRegex = new IPValidationRegex();
        BufferedReader br = new BufferedReader(new FileReader(new File("").getAbsolutePath() + "/src/tests/ips.txt"));
        try {

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                System.out.println(line + " : is" + (ipValidationRegex.validateIPAddress(line) ? " valid" : " invalid"));
                line = br.readLine();
            }
        }finally {
            br.close();
        }

    }

    @Test
    //Question 2
    public void testStudentInformationSorting() throws Exception{

        List<Student> studentList = Arrays.asList(
                new Student(33, "Tina", (float) 3.68),
                new Student(85, "Louis", (float) 3.85),
                new Student(56, "Samil", (float) 3.75),
                new Student(19, "Samar", (float) 3.75),
                new Student(22, "Lorry", (float) 3.76)
        );

        System.out.println("Sample Input");
        System.out.println("=====================================");

        for (Student student : studentList) {
            System.out.println(student.toFullDetail());
        }

        System.out.println();

        Collections.sort(studentList, new StudentComparator(
                new GPAComparator(),
                new NameComparator(),
                new IDComparator()
        ));

        System.out.println("Sample Output");
        System.out.println("=====================================");

        for (Student student : studentList) {
            System.out.println(student.toString());
        }
    }

    @Test
    //Question 3
    public void testTimeMeasureTool() throws Exception {
        TimeMeasurementTool timeMeasurementTool = TimeMeasurementTool.start();

        Thread.sleep(2000);

        System.out.println("Duration in millseconds:  " + timeMeasurementTool.getTime());
        System.out.println("Duration in seconds" + timeMeasurementTool.getTime(TimeUnit.SECONDS));
    }

}