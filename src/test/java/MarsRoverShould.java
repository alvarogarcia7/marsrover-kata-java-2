import com.kata.marsrover.Rover;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class MarsRoverShould {

	@Test
	public void advance_facing_north  () {
		Rover rover = new Rover(0, 0, "north");

		Rover newRover = rover.receive("f");

		assertThat(newRover.x(), is(0));
		assertThat(newRover.y(), is(1));
		assertThat(newRover.direction(), is("north"));
	}
}
