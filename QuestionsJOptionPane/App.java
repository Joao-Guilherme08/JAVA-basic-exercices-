import javax.print.attribute.IntegerSyntax;
import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) {

       String name = JOptionPane.showInputDialog(" Enter your Name");
       JOptionPane.showMessageDialog(null, "Hello" +name);

       int age = Integer.parseInt(JOptionPane.showInputDialog(" Enter your age"));
       JOptionPane.showMessageDialog(null, "You are"+age+"Years old");

       double height = Double.parseDouble(JOptionPane.showInputDialog(" Enter your age"));
       JOptionPane.showMessageDialog(null, "You are"+height+" cm tall");







        
    }
}
