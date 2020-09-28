package com.sg.kata;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( Player.class );
    }

    
    public void testScore0() throws Exception {
    	
    	Player player = new Player();
    	String score0 = player.scorePoint();
    	assertEquals(score0, "0");
    }
    
    public void testScore1() throws Exception {
    	Player player = new Player();
    	player.setScore(1);
    	String score1 = player.scorePoint();
    	assertEquals(score1, "15");
    }
    
    public void testScore2() throws Exception {
    	Player player = new Player();
    	player.setScore(2);
    	String score2 = player.scorePoint();
    	assertEquals(score2, "30");
    }
    
    public void testScore3() throws Exception {
    	Player player = new Player();
    	player.setScore(3);
    	String score3 = player.scorePoint();
    	assertEquals(score3, "40");
  	

    }
    
    
  
}
