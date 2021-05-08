package main.java.com.eventsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import lombok.*;
/**
 * * You need to design an app that will store events for users and check stored
 * events for robot activity. You can consider the user as a robot if there are
 * more than {LIMIT} events for the user per given amount of time. {LIMIT} is an
 * app setting and could be a constructor argument.
 * 
 * Two methods to be implemented: void event(long timestamp, long userId) -
 * event storing method. You are guaranteed that timestamps will increase
 * constantly. We need those events only to test them against robot activity and
 * no more further.
 * 
 * 
 * 
 * int robotsCount(long time) - how many robots we have seen for the past {time}
 * milliseconds
 * 
 * Consider that robotsCount will be called time after time on a regular basis.
 * 
 * You need to design this app as efficiently as possible to prevent
 * OutOfMemoryError.
 * 
 * Use Java for coding.
 * 
 * @author marcelanita
 *
 */
@Getter @Setter
public class EventSystem {
	/** limit for the maximum number of events per user **/
    private int limit;
	/** collection to store the number of events produced on user **/
	private Map<Long, Integer> eventsPerUser = new HashMap<>();
	/** collection to store timestamp when a user became robot ( the number of events was greater than the admited limit ) **/
	private Map<Long, Long> timeWhenAUserBecameRobot = new HashMap<>();

	/**
	 * constructor using argument the limit admited for the number of events
	 * @param limit
	 */
	public EventSystem(int limit) {
		this.limit = limit;
	}


	/**
	 * the method will populate the collections with events for every user and it will store the timestamp when a user became a robot
	 * ( the user surpassed the limit admited for the number of events )
	 * @param timestamp the timestamp when the event is produced
	 * @param userId the user id of the user that uses the system
	 */
	public void event(long timestamp, long userId) {

		int noOfEventsPerUser = 0;

			if (eventsPerUser.containsKey(userId)) {
				noOfEventsPerUser = eventsPerUser.get(userId);
				noOfEventsPerUser++;
				eventsPerUser.put(userId, noOfEventsPerUser);
			} else {
				noOfEventsPerUser = 1;
				eventsPerUser.put(userId, 1);

			}
			
			if(noOfEventsPerUser>limit && !timeWhenAUserBecameRobot.containsKey(userId)) {
				 timeWhenAUserBecameRobot.put(userId,timestamp);
			}

	}

	/**
	 * the method will count the robots existent in a system in a given time interval
	 * @param time the past time interval in millisecond
	 * @return the number of robots existent in system
	 */
	public int robotsCount(long time) {
	   
		 long startTimeInterval = System.currentTimeMillis()-time;
		 AtomicInteger counter = new AtomicInteger(0);
		 timeWhenAUserBecameRobot.entrySet().stream().forEach(entry->{
			 if(entry.getValue() >startTimeInterval) {
					counter.incrementAndGet();
				}
		 });
	
	    return counter.get();
	}


	public int robotsCountFor(long time) {
	      int robots =0;
		 long startTimeInterval = System.currentTimeMillis()-time;
		 for(Map.Entry<Long, Long>entry : timeWhenAUserBecameRobot.entrySet()) {
			 if(entry.getValue() >startTimeInterval) {
					robots++;
				}
		 }
	    return robots;
	}
}
