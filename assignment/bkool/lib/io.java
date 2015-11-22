

import java.io.*;
import java.io.IOException;

import bkool.codegeneration.IllegalRuntimeException;


public class io {
	//private static final DataInputStream input = new DataInputStream(System.in);
	private static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
          
	/** reads and returns an integer value from the standard input
	 *	@return int an integer number read from standard input
	 */
	public static int readInt() throws IllegalRuntimeException {
        String tmp = ""; 
		try {
			tmp = input.readLine();
            return Integer.parseInt(tmp);
		} catch (IOException e) {
			throw new IllegalRuntimeException(tmp);
		} catch (NumberFormatException e) {
            throw new IllegalRuntimeException(tmp);
        }
	}
	
		
    /** print out the value of the integer i to the standard output
     *	@param i the value is printed out
     */
    public static void writeInt(int i) {
	    System.out.print(i);
    }
   
    /** same as putInt except that it also prints a newline
     *	@param i the value is printed out
     */	
    public static void writeIntLn(int i) {
	    System.out.println(i);
    }
    
    /** return a floating-point value read from the standard input
     *	@return float the floating-point value
     */
    public static float readFloat() throws IllegalRuntimeException {   
    	String tmp ="";
        try {
            tmp = input.readLine();
			return Float.parseFloat(tmp);
		} 
    	catch (IOException e) {
			throw new IllegalRuntimeException(tmp);
		}
        catch (NumberFormatException e) {
            throw new IllegalRuntimeException(tmp);
        }
	}
	
    /** print out the value of the float f to the standard output
     *	@param f the floating-point value is printed out
     */
    public static void writeFloat(float f){
	    System.out.print(f);
    }
    
    /** same as putFloat except that it also prints a newline
     *	@param f the floating-point value is printed out
     */
    public static void writeFloatLn(float f) {
	    System.out.println(f);
    }
    
	/** reads and returns a boolean value from the standard input
	 *	@return int a boolean value read from standard input
	 */
	public static boolean readBool() throws IllegalRuntimeException {
        String tmp = "";
		try {
            tmp = input.readLine();
			if (tmp.equalsIgnoreCase("true"))
                return true;
            else if (tmp.equalsIgnoreCase("false"))
                return false;
            else throw new IllegalRuntimeException(tmp);
		} catch (IOException e) {
			throw new IllegalRuntimeException(tmp);
		}
	}

    /** print out the value of the boolean b to the standard output
     *	@param b the boolean value is printed out
     */
    public static void writeBool(boolean b) {
	    System.out.print(b);
    }
    
    /** same as putBoolLn except that it also prints a new line
     *	@param b the boolean value is printed out
     */
    public static void writeBoolLn(boolean b) {
	    System.out.println(b);
    }
    /** reads and returns a boolean value from the standard input
     *  @return int a boolean value read from standard input
     */
    public static String readStr() throws IllegalRuntimeException {
        String tmp = "";
        try {
            tmp = input.readLine();
            return tmp;
        } catch (IOException e) {
            throw new IllegalRuntimeException(tmp);
        }
    }

    /** prints the value of the string to the standard output
     *	@param a the string is printed out
     */
     public static void writeStr(String a ) {
	    System.out.print(a);
    }
    
    /** same as putString except that it also prints a new line
     *	@param a the string is printed out
     */
    public static void writeStrLn(String a){
	    System.out.println(a);
    }
    /** print out an empty line
     **/
    public static void writeLn() {
	    System.out.println();
    }
}

