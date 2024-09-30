
import javax.swing.JOptionPane;

public class JOptionsPane {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "New Window pop up");

        String input = JOptionPane.showInputDialog(null, "Input testing: ");

        JOptionPane.showMessageDialog(null, "Output should be posted here: " + input);

        Object[] options = {"Yes" , "No" , "Maybe"};
        int result = JOptionPane.showOptionDialog(null, "Pop up question here:", "Options Title", 
        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

         if (result == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "If you clicked YES, this should pop up");
         }
         
         else if (result == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "If you clicked NO, this should pop up");
         }

         else {
            JOptionPane.showMessageDialog(null, "If you clicked MAYBE, this should pop up");
         }
    }
} 
