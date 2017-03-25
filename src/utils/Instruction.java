package utils;

import utils.*;

public enum Instruction {
    M, R, L;

    public static boolean isInstruction(String instruction) throws LostCaverException {
        Instruction[] instructions = Instruction.values();
        for(Instruction aInstruction: instructions) {
            if(aInstruction.name().toLowerCase().equals(instruction.toLowerCase())) {
                return true;
            }
        }
        return false;
    }

    public Instruction convertToInstruction(String instruction) {

    }
}