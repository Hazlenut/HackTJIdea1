
import java.util.*;
import java.io.*;

public class TestRuns {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		String textfile = "Sample.txt";
		BufferedReader reader = new BufferedReader(new FileReader(textfile));
		String first = "a", last = "s";
		double balance = 0;
		int id = 0;
		try {

			id = Integer.parseInt(reader.readLine());
			first = reader.readLine();
			last = reader.readLine();
			balance = Double.parseDouble(reader.readLine());
		} catch (IOException e) {
			e.printStackTrace();

		}
		Customer m = new Customer(id, first, last, balance);
		System.out.println(m.getFirstName());
		System.out.println(m.getLastName());
	}
}
