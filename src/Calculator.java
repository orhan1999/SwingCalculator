import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator{
    public Calculator(){}

    public double calc(double first,String operation,double second){
        double firstValue = 0;
        switch (operation){
            case "+":
                firstValue = first+second;
            break;
            case "-":
                firstValue = first-second;
                break;
            case "*":
                firstValue = first*second;
                break;
            case "/":
                firstValue = first/second;
                break;
        }
        return firstValue;
    }
}






