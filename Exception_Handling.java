public class Debug {

  public static void main(String[] args) {
    
    int width = 0;
    int length = 40;
    
    try {
    int ratio = length / width;
    }
    catch (NullPointerException e) {
      // Code to handle a Null Pointer Exception
      System.err.println();

    } catch (ArithmeticException e) {
      // Code to handle an ArithmeticException
      System.err.println();
      
    }
        
  }
  
}
