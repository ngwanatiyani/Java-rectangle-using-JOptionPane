/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package joptionpanerectangle;

/**
 *
 * @author Tiyani
 */
public class Rectangle 
{
    //Instance variables
    
    private double breath ;
    private double length ;

    
    
    public Rectangle()             // constructor with no arguements
    {
        this.breath = 0;
        this.length = 0;
    
    }
    
    public Rectangle(double breath, double length)           // constructor with arguements
    {
        this.breath = breath;
        this.length =length;
    
    }
    public double getBreath() 
    {
        return breath;
    }

    public double getLength() 
    {
        return length;
    }
    
    
    public void setBreath(double breath) {
        this.breath = breath;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double Perimeter()
    {
    
      return 2 * (breath + length);
    }
    
    public double Area()
    {
      return (breath * length);
    }
}
