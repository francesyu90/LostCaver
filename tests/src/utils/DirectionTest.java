package utils;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import utils.*;

public class DirectionTest {
  @Test
  public void isDirectionTest() throws LostCaverException {
    String dir = "E";
    Direction direction = Direction.convertToDirection(dir);
    assertEquals(direction, Direction.E);
  }
}