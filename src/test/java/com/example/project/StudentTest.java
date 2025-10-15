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
    //edge case no-score
    public void testInitialTestScoreCountAndHighest(){
        Student s = new Student("John", "Doe", 2025);
        assertEquals(0,s.getTestScoreCount());
        assertEquals(0.0,s.getHighestTestScore());
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

    @Test
    public void testMultipleStudentsAreIndependent(){
        Student s1 = new Student("Dan", "Wong", 2027);
        Student s2 = new Student("Eve", "Kim", 2027);
        s1.addTestScore(90.0);
        s2.addTestScore(75.0);
        assertEquals(1, s1.getTestScoreCount());
        assertEquals(1, s2.getTestScoreCount());
        assertEquals(90.0, s1.getHighestTestScore());
        assertEquals(75.0, s2.getHighestTestScore());
    }

  
    
}
