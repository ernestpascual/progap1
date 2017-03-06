package utility;

import java.io.*;

public class Reader {
	public static String readString(String message)
		throws IOException {
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			
			System.out.print(message);
			String input = reader.readLine();
			return input;
			}
	
	public static int readInt(String message)
			throws IOException {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(System.in));
				
				System.out.print(message);
				int input = Integer.parseInt(reader.readLine());
				return input;
				}

	public static double readDouble(String message)
			throws IOException {
				BufferedReader reader = new BufferedReader(
					new InputStreamReader(System.in));
			
				System.out.print(message);
				int input = Integer.parseInt(reader.readLine());
				return input;
			}

}

