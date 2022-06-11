
public class App {

  public static void main(String[] args) {
    
    Logger logger1 = new AsteriskLogger();
    Logger logger2 = new SpacedLogger();
    
    logger1.Log("Awesome");
    logger1.Error("Tater Tot");
    logger2.Log("Discord");
    logger2.Error("Facebook");

  }

}
