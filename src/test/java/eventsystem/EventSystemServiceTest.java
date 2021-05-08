package robot;

import main.java.com.eventsystem.service.EventSystemService;
import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * test class for event system
 */
public class EventSystemServiceTest {

//    /**
//     * Testable instance.
//     */
//    private EventSystemService instance;
//    /**
//     * number of robots
//     */
//    private int numberOfRobots;
//
//    @Test
//    public void testThereExistEventsForUser() throws Exception {
//        givenEventSystemWithLimitOfEvents(100);
//        givenMoreEventsProduced(10000);
//        whenRobotCount(360000);
//        thenExistEventsStore();
//    }
//
//    @Test
//    public void testRobotCountCalledOnce() throws Exception {
//        givenEventSystemWithLimitOfEvents(100);
//        givenMoreEventsProduced(10000);
//        whenRobotCount(360000);
//        thenExistRobotsInSystem();
//    }
//
//    @Test
//    public void testRobotCountCalledRegularBasis() throws Exception {
//        givenEventSystemWithLimitOfEvents(100);
//        givenMoreEventsProduced(10000);
//        whenRobotCountARegularBasis(360000, 10);
//        thenExistRobotsInSystem();
//    }
//
////        @Test
////    public void tryToFailWeakHashmap() {
////        givenEventSystemWithLimitOfEvents(100);
////        givenMoreEventsProduced(Integer.MAX_VALUE);
////        thenMapDidNotFail();
////    }
//
//    private void thenMapDidNotFail() {
//        System.out.println("DID NOT FAIL!!! size is :" + instance.getEventsPerUser().size());
//        assertTrue(instance.getEventsPerUser().size() > 0);
//    }
//
//    private void thenExistRobotsInSystem() {
//        assertTrue(numberOfRobots > 0);
//
//    }
//
//    private void thenExistEventsStore() {
//        Map.Entry<Long, Integer> entry = instance.getEventsPerUser().entrySet().iterator().next();
//        int value = entry.getValue();
//        assertTrue(value > 0);
//
//    }
//
//    private void whenRobotCount(int pastMilliseconds) {
//        numberOfRobots = instance.robotsCount(pastMilliseconds);
//        System.out.println("There are " + numberOfRobots + "  robots ! We found them in the latest " + pastMilliseconds + " milliseconds ");
//
//    }
//
//    private void whenRobotCountARegularBasis(int pastMilliseconds, int noOfTimes) {
//        IntStream.range(0, noOfTimes).forEach(i ->
//                {
//                    numberOfRobots = instance.robotsCount(pastMilliseconds);
//                    System.out.println("There are " + numberOfRobots + "  robots ! We found them in the latest " + pastMilliseconds + " milliseconds ");
//
//                }
//        );
//
//    }
//
//    private void givenMoreEventsProduced(int noOfEvents) {
//        Random generator = new Random(5);
//        long startTime = System.currentTimeMillis();
//        IntStream.range(0, noOfEvents).forEach(i ->
//                {
//                    instance.event(startTime + generator.nextInt(5000), generator.nextInt(100));
//                }
//        );
//
//    }
//
//    private void givenEventSystemWithLimitOfEvents(int i) {
//        instance = new EventSystemService(i);
//    }
//

}
