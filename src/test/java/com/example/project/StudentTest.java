package com.example.project;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.List;


public class StudentTest {
    @Test
    void testGetFirstName(){
        Student s = new Student("John", "Doe", 2025);
        String expectedOutput = "John";
        String studentOutput = s.getFirstName();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testGetLastName(){
        Student s = new Student("John", "Doe", 2025);
        String expectedOutput = "Doe";
        String studentOutput = s.getLastName();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testGetHighestTestScore(){
        Student s = new Student("John", "Doe", 2025);
        double expectedOutput = 0.0;
        double studentOutput = s.getHighestTestScore();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testSetGradYear(){
        Student s = new Student("John", "Doe", 2025);
        s.setGradYear(2027);
        int expectedOutput=2027;
        int studentOutput=s.getGradYear();
        assertEquals(expectedOutput,studentOutput);
    }

    @Test
    void testSAddTestScore(){
        Student s = new Student("John", "Doe", 2025);
        s.addTestScore(91.5);
        s.addTestScore(95.6);
        List<Double> expectedOutput = new ArrayList<Double>();
        expectedOutput.add(2.0); // number of tests
        expectedOutput.add(95.6); //highest score test
        List<Double> studentOutput = new ArrayList<Double>();
        studentOutput.add((double)s.getTestScoreCount());
        studentOutput.add(s.getHighestTestScore());
        assertEquals(expectedOutput,studentOutput);
    }
    @Test
    void testAverageTestScore(){
        Student s = new Student("John", "Doe", 2025);
        s.addTestScore(91.5);
        s.addTestScore(95.6);
        double expectedOutput = 93.55;
        double studentOutput = s.averageTestScore();
        assertEquals(expectedOutput,studentOutput);
    }


    @Test
    void testIsPassing(){
        Student s = new Student("John", "Doe", 2025);
        s.addTestScore(91.5);
        s.addTestScore(95.6);
        double avg = s.averageTestScore();
        boolean expectedOutput = true;
        boolean studentOutput = s.isPassing();
        assertEquals(expectedOutput,studentOutput);
    }







  
    
}
