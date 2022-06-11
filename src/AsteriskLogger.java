
public class AsteriskLogger implements Logger {

  @Override
  public void Log(String log) {
    System.out.println("***" + log + "***");
    
  }

  @Override
  public void Error(String error) {
    String starError = "***" + "Error: " + error + "***";
    
    String asterisk = "";
    for (int i=0; i<starError.length(); i++) asterisk += "*";
    
    System.out.println(asterisk + "\n\n" + starError + "\n\n" + asterisk);
    
  }

}
