package org.launchcode.techjobs_oo.Tests;
import org.launchcode.techjobs_oo.Employer;
import org.launchcode.techjobs_oo.PositionType;
import org.launchcode.techjobs_oo.Location;
import org.launchcode.techjobs_oo.CoreCompetency;
import org.launchcode.techjobs_oo.Job;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class JobTest {
    Job test_job;
    Job test_job_2;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

//    @Before
//    public void createJobOjbect (){
//        Job test_job = new Job("Web Dev", employer, location, positionType, coreCompetency);
//        Job test_job_2 = new Job("Web Dev 2", employer,location, positionType, coreCompetency);
//    }

//    @Test
//    public void testSettingJobId(){
//        assertFalse("This is false", test_job.getId()==test_job_2.getId());
//    }
    @Before
    public void createJobObject() {
        Job test_job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals();
    }

    private void assertEquals() {
        test_job.getName().equals("Product tester");
    }


}
