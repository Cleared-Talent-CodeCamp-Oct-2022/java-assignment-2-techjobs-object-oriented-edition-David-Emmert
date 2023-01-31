package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {
    @Test
    public void testSettingJobId(){
//        Location testLocation = new Location("Fort Benning");
//        PositionType testPositionType = new PositionType("Infantry");
//        Employer testEmployer = new Employer("US Army");
//        CoreCompetency testCoreCompetency = new CoreCompetency("Athletic");
//
//        Job testJob1 = new Job("Test Job 1", testEmployer, testLocation, testPositionType, testCoreCompetency);
//        Job testJob2 = new Job("Test Job 1", testEmployer, testLocation, testPositionType, testCoreCompetency);

//        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        Job testJob2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job test1 = new Job();
        Job test2 = new Job();
        assertNotEquals(test1, test2);

    }
    @Test
    public void testJobConstructorSetsAllFields() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertTrue(testJob1 instanceof Job);
        assertTrue(testJob1.getName() instanceof String);
        assertTrue(testJob1.getEmployer() instanceof Employer);
        assertTrue(testJob1.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob1.getLocation() instanceof Location);
        assertTrue(testJob1.getPositionType() instanceof PositionType);
        assertEquals("Persistence", testJob1.getCoreCompetency().getValue());
        assertEquals("Product tester", testJob1.getName());
        assertEquals("Desert", testJob1.getLocation().getValue());
        assertEquals("ACME", testJob1.getEmployer().getValue());
        assertEquals("Quality control", testJob1.getPositionType().getValue());


    }
    @Test
    public void testJobsForEquality(){
        Job testJob1 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job testJob2 = new Job("Product tester", new Employer("ACME"),
                new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(testJob1.equals(testJob2));
        
    }
    @Test
    public void testToStringHandlesEmptyField() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location(""),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + testJob1.getId() + "\nName: Product tester\nEmployer: ACME" +
                "\nLocation: Data not available\nPosition Type: Quality control\nCore Competency: Persistence\n",testJob1.toString());
    }
    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals(testJob1.toString().charAt(0), '\n');
        assertEquals(testJob1.toString().charAt(testJob1.toString().length() - 1), '\n');
    }
    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job testJob1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"),
                new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: " + testJob1.getId() + "\nName: " + testJob1.getName() + "\nEmployer: " + testJob1.getEmployer().toString() +
                "\nLocation: " + testJob1.getLocation().toString() + "\nPosition Type: " + testJob1.getPositionType().toString() + "\nCore Competency: "
                + testJob1.getCoreCompetency().toString() + "\n", testJob1.toString());
    }

}
