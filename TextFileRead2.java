import java.io.*;
public class TextFileRead2 {
	public static void main( String[] args ) {
		try {
			int number1 = Integer.parseInt( args[1] );
			String msg;
			FileInputStream fis = new FileInputStream( args[0] );
			InputStreamReader isr = new InputStreamReader( fis );
			BufferedReader br = new BufferedReader( isr );
			while( ( msg = br.readLine() ) != null ) {
				int number2 = Integer.parseInt( msg );
				System.out.println( args[1] + " * " + number2 + " = " + number1 * number2 );
			}
			br.close();
			isr.close();
			fis.close();
		} catch( Exception e ) {
			e.printStackTrace();
		}
	}
}
