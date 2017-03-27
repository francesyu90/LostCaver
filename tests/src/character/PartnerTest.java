package character;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import java.awt.Point;

import character.*;
import utils.*;
import assets.*;

public class PartnerTest {

  final Grid grid = new Grid(10, 10);
  Caver caver = null;

  @Test
  public void testGenerateInstruction() throws LostCaverException {
    this.caver = new Caver(5, 5, "E");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertTrue(instruction.equals("M") || instruction.equals("L"));
  }

  @Test
  public void testGenerateInstructionA() throws LostCaverException {
    this.caver = new Caver(5, 5, "W");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "R");
  }

  @Test
  public void testGenerateInstructionB() throws LostCaverException {
    this.caver = new Caver(5, 5, "N");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertTrue(instruction.equals("M") || instruction.equals("R"));
  }

  @Test
  public void testGenerateInstructionC() throws LostCaverException {
    this.caver = new Caver(5, 5, "S");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "L");
  }

  @Test
  public void testGenerateInstructionD() throws LostCaverException {
    this.caver = new Caver(12, 5, "E");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "L");
  }

  @Test
  public void testGenerateInstructionE() throws LostCaverException {
    this.caver = new Caver(12, 5, "W");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertTrue(instruction.equals("M") || instruction.equals("R"));
  }

  @Test
  public void testGenerateInstructionF() throws LostCaverException {
    this.caver = new Caver(12, 5, "N");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertTrue(instruction.equals("M") || instruction.equals("L"));
  }

  @Test
  public void testGenerateInstructionG() throws LostCaverException {
    this.caver = new Caver(12, 5, "S");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "R");
  }

  @Test
  public void testGenerateInstructionH() throws LostCaverException {
    this.caver = new Caver(5, 12, "E");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertTrue(instruction.equals("M") || instruction.equals("R"));
  }

  @Test
  public void testGenerateInstructionI() throws LostCaverException {
    this.caver = new Caver(5, 12, "W");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "L");
  }

  @Test
  public void testGenerateInstructionJ() throws LostCaverException {
    this.caver = new Caver(5, 12, "N");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "R");
  }

  @Test
  public void testGenerateInstructionK() throws LostCaverException {
    this.caver = new Caver(5, 12, "S");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertTrue(instruction.equals("M") || instruction.equals("L"));
  }

  @Test
  public void testGenerateInstructionL() throws LostCaverException {
    this.caver = new Caver(12, 12, "E");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "R");
  }

  @Test
  public void testGenerateInstructionM() throws LostCaverException {
    this.caver = new Caver(12, 12, "W");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertTrue(instruction.equals("M") || instruction.equals("L"));
  }

  @Test
  public void testGenerateInstructionN() throws LostCaverException {
    this.caver = new Caver(12, 12, "N");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "L");
  }

  @Test
  public void testGenerateInstructionO() throws LostCaverException {
    this.caver = new Caver(12, 12, "S");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertTrue(instruction.equals("M") || instruction.equals("R"));
  }

  @Test
  public void testGenerateInstructionP() throws LostCaverException {
    this.caver = new Caver(10, 5, "E");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "L");
  }

  @Test
  public void testGenerateInstructionQ() throws LostCaverException {
    this.caver = new Caver(10, 5, "W");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "R");
  }

  @Test
  public void testGenerateInstructionR() throws LostCaverException {
    this.caver = new Caver(10, 5, "N");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "M");
  }

  @Test
  public void testGenerateInstructionS() throws LostCaverException {
    this.caver = new Caver(10, 5, "S");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertTrue(instruction.equals("L") || instruction.equals("R"));
  }

  @Test
  public void testGenerateInstructionT() throws LostCaverException {
    this.caver = new Caver(10, 12, "E");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "R");
  }

  @Test
  public void testGenerateInstructionU() throws LostCaverException {
    this.caver = new Caver(10, 12, "W");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "L");
  }

  @Test
  public void testGenerateInstructionV() throws LostCaverException {
    this.caver = new Caver(10, 12, "N");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertTrue(instruction.equals("L") || instruction.equals("R"));
  }

  @Test
  public void testGenerateInstructionW() throws LostCaverException {
    this.caver = new Caver(10, 12, "S");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "M");
  }

  @Test
  public void testGenerateInstructionX() throws LostCaverException {
    this.caver = new Caver(5, 10, "E");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "M");
  }

  @Test
  public void testGenerateInstructionY() throws LostCaverException {
    this.caver = new Caver(5, 10, "W");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertTrue(instruction.equals("L") || instruction.equals("R"));
  }

  @Test
  public void testGenerateInstructionZ() throws LostCaverException {
    this.caver = new Caver(5, 10, "N");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "R");
  }

  @Test
  public void testGenerateInstructionAI() throws LostCaverException {
    this.caver = new Caver(5, 10, "S");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "L");
  }

  @Test
  public void testGenerateInstructionBI() throws LostCaverException {
    this.caver = new Caver(12, 10, "E");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertTrue(instruction.equals("L") || instruction.equals("R"));
  }

  @Test
  public void testGenerateInstructionCI() throws LostCaverException {
    this.caver = new Caver(12, 10, "W");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "M");
  }

  @Test
  public void testGenerateInstructionDI() throws LostCaverException {
    this.caver = new Caver(12, 10, "N");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "L");
  }

  @Test
  public void testGenerateInstructionEI() throws LostCaverException {
    this.caver = new Caver(12, 10, "S");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "R");
  }

  @Test
  public void testGenerateInstructionFI() throws LostCaverException {
    this.caver = new Caver(10, 10, "S");
    String instruction = Partner.generateInstruction(this.grid, this.caver);
    assertEquals(instruction, "D");
  }


}















