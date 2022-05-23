import java.io.*;

public class SIMPLE {
	
	public static void main(String ARGS[]) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\ProgramData\\Jenkins\\.jenkins\\workspace\\simple\\output\\output.txt"));
			int x = 50, y = 100, z;
			z = x + y;

			bw.write("hello world this is Qasim \n jenkins github connection fine \n we are in year 2022 \n adition of x and y is " + z);
			bw.write("\n gitbub triggered hey this is chnage  ");
			bw.write("\n change today ");
			bw.write("\n this is presentation intern ");
			bw.close();
		} catch (Exception ex) {
			return;
		}

	}

}
