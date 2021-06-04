package Lab8.com.capgemini;

import java.io.File;


public class Exercise1FileProgram {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File sr_source=new File("D:\\CapgeminiJA17\\LabPrograms\\src\\Lab8\\com\\capgemini\\Exercise1source.txt");
		File sr_target=new File("D:\\CapgeminiJA17\\LabPrograms\\src\\Lab8\\com\\capgemini\\Exercise1target.txt"); 
		Exercise1CopyDataThread cdt = new Exercise1CopyDataThread();
		cdt.start();
	}

}
