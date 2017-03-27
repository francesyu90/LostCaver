package assets;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import java.awt.Point;

import utils.*;
import assets.*;

public class GridTest {

  @Test
  public void testValidatePointInGrid() throws LostCaverException {
    Grid.validatePointInGrid(new Point(10, 10));
  }

  @Test
  public void testValidatePointInGridI() throws LostCaverException {
    Grid.validatePointInGrid(10, 10);
  }

  @Test(expected = LostCaverException.class)
  public void testValidatePointInGridII() throws LostCaverException {
    Grid.validatePointInGrid(new Point(30, 10));
  }

  @Test(expected = LostCaverException.class)
  public void testValidatePointInGridIII() throws LostCaverException {
    Grid.validatePointInGrid(30, 10);
  }


}
