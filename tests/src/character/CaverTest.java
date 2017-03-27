package character;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import java.awt.Point;

import character.*;
import utils.*;
import assets.*;

public class CaverTest {

  @Test
  public void testSetAndGetDirection() throws LostCaverException {
    Caver caver = new Caver();
    Direction direction = caver.getDirection();
    assertEquals(direction, Direction.E);
  }

  @Test(expected = NullPointerException.class)
  public void testSetAndGetDirectionI() throws LostCaverException {
    Caver caver = null;
    Direction direction = caver.getDirection();
  }

  @Test
  public void testSetAndGetDirectionII() throws LostCaverException {
    Caver caver = new Caver("W");
    Direction direction = caver.getDirection();
    assertEquals(direction, Direction.W);
  }

  @Test(expected = LostCaverException.class)
  public void testSetAndGetDirectionIII() throws LostCaverException {
    Caver caver = new Caver("D");
    Direction direction = caver.getDirection();
  }

  @Test
  public void testSetAndGetPosition() throws LostCaverException {
    int x = 1;
    int y = 2;
    Caver caver = new Caver(x, y, "E");
    Point point = new Point(x, y);
    assertEquals(caver.getPosition(), point);
  }

  @Test
  public void testSetAndGetPositionI() throws LostCaverException {
    int x = 1;
    int y = 2;
    Point point = new Point(x, y);
    Caver caver = new Caver(point, "E");
    assertEquals(caver.getPosition(), point);
  }

  @Test(expected = LostCaverException.class)
  public void testSetAndGetPositionII() throws LostCaverException {
    Point point = new Point(20, 30);
    Caver caver = new Caver(point, "E");
  }

  @Test
  public void testExecuteInstruction() throws LostCaverException {
    Caver caver = new Caver(0, 0, "E");
    caver.executeInstruction("M");
    Point point = caver.getPosition();
    Direction direction = caver.getDirection();
    assertEquals(point, new Point(1, 0));
    assertEquals(direction, Direction.E);
  }

  @Test
  public void testExecuteInstructionI() throws LostCaverException {
    Caver caver = new Caver(0, 0, "E");
    caver.executeInstruction("L");
    Direction direction = caver.getDirection();
    Point point = caver.getPosition();
    assertEquals(direction, Direction.N);
    assertEquals(point, new Point(0, 0));
  }

  @Test
  public void testExecuteInstructionII() throws LostCaverException {
    Caver caver = new Caver(10, 10, "E");
    caver.executeInstruction("R");
    Direction direction = caver.getDirection();
    Point position = caver.getPosition();
    assertEquals(direction, Direction.S);
    assertEquals(position, new Point(10, 10));
  }

  @Test(expected = LostCaverException.class)
  public void testExecuteInstructionIV() throws LostCaverException {
    Caver caver = new Caver(0, 0, "S");
    caver.executeInstruction("M");
    Direction direction = caver.getDirection();
    Point point = caver.getPosition();
  }





}















