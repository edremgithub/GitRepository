import javax.swing.JOptionPane;

public class JOptionsPane {
    public static void main (String[] args){
        String name = new String();
        int num = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your number"));

        JOptionPane.showMessageDialog(null, num);

        // This is used when you want to type letters instead of numbers
        // name = JOptionPane.showInputDialog(null, "Enter your name here: ");

        // JOptionPane.showMessageDialog(null, "Your name is " + name);
    }
}