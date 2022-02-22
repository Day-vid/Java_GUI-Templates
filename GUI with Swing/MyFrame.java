import javax.swing.*;
import java.awt.event.*;

/**
* MyFrame Class which extends JFrame and implements ActionListener to handle user input events.
*
*
* @author Poornachandra Sarang in the book Java Programming.  Comments added by David Bryant
* @version 22 February 2022
*/
public class MyFrame extends JFrame implements ActionListener
{
    private JButton closeButton = new JButton("Close");
    private JButton messageButton = new JButton("Hide");
    private JLabel label = new JLabel("Some random string", JLabel.CENTER);

    /**
    *Constructor for objects of the class MyFrame to display the contents of this parameter
    *
    */
    public MyFrame(String str)
    {
        super(str);
        add(messageButton, "North");
        add(closeButton, "South");
        add(label, "Center");
        messageButton.addActionListener(this);
        closeButton.addActionListener(this);
    }
    
    /**
    *Method which represents the actions performed by a 
    *
    *@return evt a reference to the ActionEvent
    */
    public void actionPerformed(ActionEvent evt)
    {
        if (evt.getSource().equals(messageButton))
        {
            if (messageButton.getText().equals("Show"))
            {
                label.setVisible(true);
                messageButton.setText("Hide");
            }
            else
            {
                label.setVisible(false);
                messageButton.setText("Show");
            }
        }
        else if (evt.getSource().equals(closeButton))
        {
            System.exit(0);
        }
    }
}