/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package joptionpanerectangle;
import javax.swing.JOptionPane;
/**
 *
 * @author Tiyani
 */
public class JOptionPaneRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        
        
        String input = (JOptionPane.showInputDialog(null,"What is the breath?", JOptionPane.INFORMATION_MESSAGE));
        double breath = Double.parseDouble(input);                    //coverting String to double
        
        
        String input2 = JOptionPane.showInputDialog(null,"What is the length", JOptionPane.INFORMATION_MESSAGE);
        
        double length = Double.parseDouble(input2);            //coverting String to double
        
        Rectangle rectangle = new Rectangle(breath,length);            //Creating rectangle object
        
        
        double perimeter = rectangle.Perimeter();
        double area = rectangle.Area();
        
        String output = String.format(
                
                "Breath: %.2f\n" +
                "Length: %.2f\n" + 
                "Perimeter: %.2f\n " +
                "Area: %.2f", rectangle.getBreath(),rectangle.getLength(), rectangle.Perimeter(),rectangle.Area());
        
        
        JOptionPane.showMessageDialog(null,output);            //Showing the output on a GUI
        
    }
    
}
