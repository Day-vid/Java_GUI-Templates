/**
* ButtonDemo Class which enables users to input data into the program.
*
*
* @author Poornachandra Sarang in the book Java Programming.  Comments added by David Bryant
* @version 22 February 2022
*/
public class ButtonDemo
{
    /**
    *Main method which runs the MyFrame and creates the GUI with the size parameters and visibility set in main
    *
    *@param     args    a String[] which recieves arguments 
    */
    public static void main(String[] args)
    {
        MyFrame frame = new MyFrame("Button Demo");
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}