import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UI extends JFrame {
    private TextField textField = new TextField();
    private double firstValue=0;
    private double secondValue=0;
    private String operation="";
    public UI() {
        super("Calculator");
        setSize(325,385);
        setLayout(null);

//
        textField.setText("");
        textField.setSize(296,40);
        textField.setLocation(5,0);
        textField.setFont(new Font("Arial",Font.BOLD,30));
        add(textField,BorderLayout.PAGE_START);
//        calculator.setTextField(textField);

        JButton button0 = new JButton();
        button0.setText("0");
        button0.setBounds(5,270,70,70);
        button0.setFont(new Font("Arial",Font.BOLD,40));

        JButton button1 = new JButton();
        button1.setText("1");
        button1.setBounds(5,45,70,70);
        button1.setFont(new Font("Arial",Font.BOLD,40));

        JButton button2 = new JButton();
        button2.setText("2");
        button2.setBounds(80,45,70,70);
        button2.setFont(new Font("Arial",Font.BOLD,40));

        JButton button3 = new JButton();
        button3.setText("3");
        button3.setBounds(155,45,70,70);
        button3.setFont(new Font("Arial",Font.BOLD,40));

        JButton button4 = new JButton();
        button4.setText("4");
        button4.setBounds(5,120,70,70);
        button4.setFont(new Font("Arial",Font.BOLD,40));

        JButton button5 = new JButton();
        button5.setText("5");
        button5.setBounds(80,120,70,70);
        button5.setFont(new Font("Arial",Font.BOLD,40));

        JButton button6 = new JButton();
        button6.setText("6");
        button6.setBounds(155,120,70,70);
        button6.setFont(new Font("Arial",Font.BOLD,40));

        JButton button7 = new JButton();
        button7.setText("7");
        button7.setBounds(5,195,70,70);
        button7.setFont(new Font("Arial",Font.BOLD,40));

        JButton button8 = new JButton();
        button8.setText("8");
        button8.setBounds(80,195,70,70);
        button8.setFont(new Font("Arial",Font.BOLD,40));

        JButton button9 = new JButton();
        button9.setText("9");
        button9.setBounds(155,195,70,70);
        button9.setFont(new Font("Arial",Font.BOLD,40));

        JButton buttonAddition = new JButton();
        buttonAddition.setText("+");
        buttonAddition.setBounds(230,45,70,70);
        buttonAddition.setFont(new Font("Arial",Font.BOLD,40));

        JButton buttonSubtraction = new JButton();
        buttonSubtraction.setText("-");
        buttonSubtraction.setBounds(230,120,70,70);
        buttonSubtraction.setFont(new Font("Arial",Font.BOLD,40));

        JButton buttonMultiplication = new JButton();
        buttonMultiplication.setText("*");
        buttonMultiplication.setBounds(230,195,70,70);
        buttonMultiplication.setFont(new Font("Arial",Font.BOLD,40));

        JButton buttonDivision = new JButton();
        buttonDivision.setText("/");
        buttonDivision.setBounds(230,270,70,70);
        buttonDivision.setFont(new Font("Arial",Font.BOLD,40));

        JButton buttonEquals = new JButton();
        buttonEquals.setText("=");
        buttonEquals.setBounds(155,270,70,70);
        buttonEquals.setFont(new Font("Arial",Font.BOLD,40));

        JButton buttonReset = new JButton();
        buttonReset.setText("C");
        buttonReset.setBounds(80,270,70,70);
        buttonReset.setFont(new Font("Arial",Font.BOLD,40));

        add(button0);
        add(button1);
        add(button2);
        add(button3);
        add(button4);
        add(button5);
        add(button6);
        add(button7);
        add(button8);
        add(button9);
        add(buttonAddition);
        add(buttonSubtraction);
        add(buttonMultiplication);
        add(buttonDivision);
        add(buttonEquals);
        add(buttonReset);
        add(textField);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+button0.getText());
                if(firstValue==0){
                    firstValue=Double.valueOf(textField.getText());
                }else secondValue=Double.valueOf(textField.getText());
            }
        });

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+button1.getText());
                if(firstValue==0){
                    firstValue=Double.valueOf(textField.getText());
                }else secondValue=Double.valueOf(textField.getText());
            }
        });

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+button2.getText());
                if(firstValue==0){
                    firstValue=Double.valueOf(textField.getText());
                }else secondValue=Double.valueOf(textField.getText());
            }
        });

        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+button3.getText());
                if(firstValue==0){
                    firstValue=Double.valueOf(textField.getText());
                }else secondValue=Double.valueOf(textField.getText());
            }
        });

        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+button4.getText());
                if(firstValue==0){
                    firstValue=Double.valueOf(textField.getText());
                }else secondValue=Double.valueOf(textField.getText());
            }
        });

        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+button5.getText());
                if(firstValue==0){
                    firstValue=Double.valueOf(textField.getText());
                }else secondValue=Double.valueOf(textField.getText());
            }
        });

        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+button6.getText());
                if(firstValue==0){
                    firstValue=Double.valueOf(textField.getText());
                }else secondValue=Double.valueOf(textField.getText());
            }
        });

        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+button7.getText());
                if(firstValue==0){
                    firstValue=Double.valueOf(textField.getText());
                }else secondValue=Double.valueOf(textField.getText());
            }
        });

        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+button8.getText());
                if(firstValue==0){
                    firstValue=Double.valueOf(textField.getText());
                }else secondValue=Double.valueOf(textField.getText());
            }
        });

        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField.setText(textField.getText()+button9.getText());
                if(firstValue==0){
                    firstValue=Double.valueOf(textField.getText());
                }else secondValue=Double.valueOf(textField.getText());
            }
        });

        buttonReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });

        buttonAddition.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue=Double.valueOf(textField.getText());
                textField.setText("");
                operation = "+";
            }
        });

        buttonSubtraction.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue=Double.valueOf(textField.getText());
                textField.setText("");
                operation = "-";
            }
        });

        buttonMultiplication.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue=Double.valueOf(textField.getText());
                textField.setText("");
                operation = "*";
            }
        });

        buttonDivision.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                firstValue=Double.valueOf(textField.getText());
                textField.setText("");
                operation = "/";
            }
        });

        buttonEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double number1 = Double.valueOf(firstValue);
               double  number2 = Double.valueOf(secondValue);
               String stringOperation = operation;

               Calculator calculator = new Calculator();
               String result = String.valueOf(calculator.calc(number1,stringOperation,number2));
               textField.setText(result);
            }
        });
    }

    public void reset(){
            textField.setText("");
    }

}


