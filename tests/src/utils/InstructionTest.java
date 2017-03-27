package utils;

import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import utils.*;

public class InstructionTest {

  @Test
  public void testIsInstruction() throws LostCaverException {
    String instr = "M";
    boolean isInstr = Instruction.isInstruction(instr);
    assertTrue(isInstr);
  }

  @Test
  public void testIsInstructionI() throws LostCaverException {
    String instr = "E";
    boolean isInstr = Instruction.isInstruction(instr);
    assertFalse(isInstr);
  }

  @Test(expected = LostCaverException.class)
  public void testIsInstructionII() throws LostCaverException {
    String instr = null;
    boolean isInstr = Instruction.isInstruction(instr);
  }

  @Test
  public void testConvertToInstruction() throws LostCaverException {
    String instr = "M";
    Instruction instruction = Instruction.convertToInstruction(instr);
    assertEquals(instruction, Instruction.M);
  }

  @Test(expected = LostCaverException.class)
  public void testConvertToInstructionI() throws LostCaverException {
    String instr = "E";
    Instruction instruction = Instruction.convertToInstruction(instr);
  }




}