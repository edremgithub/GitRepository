import javax.swing.JOptionPane;

public class Example2 {
    public static void main (String[] args){
        
            JOptionPane.showMessageDialog(null, "Welcome to Java!!");

            String input = JOptionPane.showInputDialog(null, "To start, input your name here: ");

            JOptionPane.showMessageDialog(null, "Hello, " + input + "!");

            Object[] options = {"Yes", "No", "Maybe"};
            int result = JOptionPane.showOptionDialog(null, "Do you like Java?", "Question", 
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);

            if (result == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "I'm glad you liked Java!");
            }
            else if (result == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Is there a reason why?");
            }
            else {
                JOptionPane.showMessageDialog(null, "How come your decision was maybe?");
            }

        }
}
