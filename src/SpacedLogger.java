
public class SpacedLogger implements Logger {

   private void Spacer (String str) {
    StringBuilder spaces = new StringBuilder();
    for (int i = 0; i < str.length(); i++) {
      if (i > 0) {
        spaces.append(" ");
      }
      spaces.append(str.charAt(i));
    }
    System.out.println(spaces.toString());
  }
  
  @Override
  public void Log(String log) {
    Spacer (log);
    }
   
  @Override
  public void Error(String error) {
   System.out.print("Error: ");
   Spacer(error);
   }

}
