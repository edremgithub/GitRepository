import javax.swing.JOptionPane;

public class Example2 {
    public static void main (String[] args){
        
        JOptionPane.showMessageDialog(null, "Hello Everyone!");

        String input = JOptionPane.showInputDialog(null, "Enter your name here: ");

        JOptionPane.showMessageDialog(null, "Hello, " + input + "!");

        Object[] options = {"Yes", "No", "Maybe"};
        int result = JOptionPane.showOptionDialog(null, "Do you like Java?", "Question", 
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

        if (result == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(null, "Great, Thanks!");
        }
        else if (result == JOptionPane.NO_OPTION) {
            JOptionPane.showMessageDialog(null, "Why not?");
        }
        else {
            JOptionPane.showMessageDialog(null, "Maybe you can decide next time!");
        }

        }
}
