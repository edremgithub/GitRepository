import javax.swing.JOptionPane;

public class JOptionsPane {
    public static void main (String[] args){
        String name = new String();
        name = JOptionPane.showInputDialog(null, "Enter your name here: ");

        JOptionPane.showMessageDialog(null, "Your name is " + name);
    }
}