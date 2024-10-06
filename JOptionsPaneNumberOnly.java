import javax.swing.JOptionPane;

public class JOptionsPaneNumberOnly {
    public static void main (String[] args) {
        
        int num = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "ENter your number:"));

        JOptionPane.showMessageDialog(null, "Here's your numnber: " + num);
    }
}