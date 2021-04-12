import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Buttons extends JFrame{
     private JButton[] buttons = new JButton[16];
     private JTextField textField = new JTextField();
     private double firstValue;
     private double secondValue;
     private String operation;

    public Buttons(){
        super("Calculator");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(325,385);
        setLayout(null);
        setVisible(true);

        textField.setText("");
        textField.setSize(296,40);
        textField.setLocation(5,0);
        textField.setFont(new Font("Arial",Font.BOLD,30));
        add(textField,BorderLayout.PAGE_START);

        for (int i=0;i< buttons.length;i++){
                buttons[i] = new JButton();
                buttons[i].setFont(new Font("Arial",Font.BOLD,40));
                buttons[i].setSize(70,70);
                add(buttons[i]);
        }
        buttonsLocation();
        buttonsText();
        buttonsAction();
    }
    private void buttonsLocation(){
        buttons[0].setLocation(5,270);
        buttons[1].setLocation(5,45);
        buttons[2].setLocation(80,45);
        buttons[3].setLocation(155,45);
        buttons[4].setLocation(5,120);
        buttons[5].setLocation(80,120);
        buttons[6].setLocation(155,120);
        buttons[7].setLocation(5,195);
        buttons[8].setLocation(80,195);
        buttons[9].setLocation(155,195);
        buttons[10].setLocation(230,45);
        buttons[11].setLocation(230,120);
        buttons[12].setLocation(230,195);
        buttons[13].setLocation(230,270);
        buttons[14].setLocation(155,270);
        buttons[15].setLocation(80,270);
    }
    private void buttonsText(){
        buttons[0].setText("0");
        buttons[1].setText("1");
        buttons[2].setText("2");
        buttons[3].setText("3");
        buttons[4].setText("4");
        buttons[5].setText("5");
        buttons[6].setText("6");
        buttons[7].setText("7");
        buttons[8].setText("8");
        buttons[9].setText("9");
        buttons[10].setText("+");
        buttons[11].setText("-");
        buttons[12].setText("*");
        buttons[13].setText("/");
        buttons[14].setText("=");
        buttons[15].setText("C");
    }
    private void buttonsAction(){
        for (JButton button:buttons
             ) {
            switch (button.getText()) {
                case "+" -> button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        firstValue = Double.parseDouble(textField.getText());
                        textField.setText("");
                        operation = "+";
                    }
                });
                case "-" -> button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        firstValue = Double.parseDouble(textField.getText());
                        textField.setText("");
                        operation = "-";
                    }
                });
                case "*" -> button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        firstValue = Double.parseDouble(textField.getText());
                        textField.setText("");
                        operation = "*";
                    }
                });
                case "/" -> button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        firstValue = Double.parseDouble(textField.getText());
                        textField.setText("");
                        operation = "/";
                    }
                });
                case "C" -> button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        reset();
                    }
                });
                case "=" -> button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        result();
                    }
                });
                default -> button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        textField.setText(textField.getText() + button.getText());
                        if (firstValue == 0) {
                            firstValue = Double.parseDouble(textField.getText());
                        } else secondValue = Double.parseDouble(textField.getText());
                    }
                });
            }
        }
    }
    private void reset(){
        firstValue=0;
        secondValue=0;
        operation="";
        textField.setText("");
    }
    private void result(){
        switch (operation) {
            case "+" -> {
                firstValue = firstValue + secondValue;
                translate();
            }
            case "-" -> {
                firstValue = firstValue - secondValue;
                translate();
            }
            case "*" -> {
                firstValue = firstValue * secondValue;
                translate();
            }
            case "/" -> {
                firstValue = firstValue / secondValue;
                translate();
            }
        }
    }
    private void translate(){
        String result = Double.toString(firstValue);
        textField.setText(result);
    }
}
