import javax.swing.JOptionPane;

public class Example1 {
    public static void main (String[] args){
        
        JOptionPane.showMessageDialog(null, "Hello Everyone!");

        String input = JOptionPane.showInputDialog(null, "Enter your name here: ");

        JOptionPane.showMessageDialog(null, "Hello, " + input + "!");
    }
}