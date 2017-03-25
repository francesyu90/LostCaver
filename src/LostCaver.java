import java.awt.Point;
import java.io.*;

public class LostCaver {

	private static class LostCaverException extends Exception {
		public LostCaverException(String message) {
			super(message);
		}
	}

	private static class Instruction {
		Point point;
		String initialDir;
		char[] instructionSet;

		public Instruction() {
			this.point = new Point(0, 0);
			this.initialDir = null;
			this.instructionSet = null;
		}

		public Instruction(String initialDir, char[] instructionSet) {
			this.point = new Point(0, 0);
			this.initialDir = initialDir;
			this.instructionSet = instructionSet;
		}

		public Instruction(Point point, String initialDir, char[] instructionSet) {
			this.point = point;
			this.initialDir = initialDir;
			this.instructionSet = instructionSet;
		}

		//TODO: getters & setters
	}


	private static void printMessage(String message) {
		System.out.println(message);
	}

	private static String getInstruction(String fileName) throws IOException, LostCaverException {
		String line = null;
		String instruction = null;
		FileReader fileReader =  new FileReader(fileName);
		BufferedReader bufferedReader = new BufferedReader(fileReader);

		while((line = bufferedReader.readLine()) != null) {
                instruction = line;
        } 
		
		bufferedReader.close();
        fileReader.close();  
        if(instruction == null) {
        	throw new LostCaverException("Error: there is no instruction available!");
        } else {
        	instruction = instruction.replaceAll("[\\s+(),]","");
        }
		return instruction;
	}

	private static void validateInstruction(String instruction) throws LostCaverException {
    	Boolean isValidInstruction = false; 
    	isValidInstruction = instruction.matches("^[0-9][0-9][EWSN][MRL]*$");
    	if(!isValidInstruction) {
    		throw new LostCaverException("Error: Invalid instruction: " + instruction);
    	}
	}


	public static void main(String[] args) {

		String fileName = args[0];
		try {
			String instruction = getInstruction(fileName);
			validateInstruction(instruction);

		} catch (Exception e) {
			printMessage(e.getMessage());
			System.exit(-1);
		}
	}
}