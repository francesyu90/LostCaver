package utils;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import utils.*;

public class DirectionTest {

  @Test
  public void testIsDirection() {
    String dir = "E";
    boolean isDir = Direction.isDirection(dir);
    assertTrue(isDir);
  }

  @Test
  public void testIsDirectionI() {
    String dir = "D";
    boolean isDir = Direction.isDirection(dir);
    assertFalse(isDir);
  }

  @Test(expected = LostCaverException.class)
  public void testConvertToDirection() throws LostCaverException {
    String dir = "D";
    Direction direction = Direction.convertToDirection(dir);
  }

  @Test
  public void testConvertToDirectionI() throws LostCaverException {
    String dir = "E";
    Direction direction = Direction.convertToDirection(dir);
    assertEquals(direction, Direction.E);
  }

}