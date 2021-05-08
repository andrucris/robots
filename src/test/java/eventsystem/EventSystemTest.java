package robot;

import main.java.com.eventsystem.EventSystem;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test class for event system
 */
public class EventSystemTest {

    /**
     * Testable instance.
     */
    private EventSystem instance;
    /**
     * number of robots
     */
    private int numberOfRobots;

    @Test
    public void testThereEventsForUser() throws Exception {
        givenEventSystemWithLimitOfEvents(100);
        givenMoreEventsProduced(10000);
        whenRobotCount(360000);
        thenExistRobotsInSystem();
    }
    @Test
    public void testRobotCountCalledOnce() throws Exception {
        givenEventSystemWithLimitOfEvents(100);
        givenMoreEventsProduced(10000);
        whenRobotCount(360000);
        thenExistRobotsInSystem();
    }
    @Test
    public void testRobotCountCalledRegularBasis() throws Exception {
        givenEventSystemWithLimitOfEvents(100);
        givenMoreEventsProduced(10000);
        whenRobotCountARegularBasis(360000,10);
        thenExistRobotsInSystem();
    }


    private void thenExistRobotsInSystem() {
        assertTrue(numberOfRobots > 0);

    }

    private void thenExistEventsStore() {
        Map.Entry<Long,Integer> entry = instance.getEventsPerUser().entrySet().iterator().next();
        int value = entry.getValue();
        assertTrue(value > 0);

    }

    private void whenRobotCount(int pastMilliseconds) {
        numberOfRobots = instance.robotsCount(pastMilliseconds);
        System.out.println("There are " + numberOfRobots + "  robots ! We found them in the latest " + pastMilliseconds + " milliseconds ");


    }
    private void whenRobotCountARegularBasis(int pastMilliseconds, int noOfTimes) {

        for (int i = 0; i < noOfTimes; i++) {
            numberOfRobots = instance.robotsCount(pastMilliseconds);
            System.out.println("There are " + numberOfRobots + "  robots ! We found them in the latest " + pastMilliseconds + " milliseconds ");
        }


    }

    private void givenMoreEventsProduced(int noOfEvents) {
        Random generator = new Random(5);
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < noOfEvents; i++) {
            instance.event(startTime + generator.nextInt(5000), generator.nextInt(100));
        }
    }

    private void givenEventSystemWithLimitOfEvents(int i) {
        instance = new EventSystem(i);
    }


}
