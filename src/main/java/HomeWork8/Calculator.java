package HomeWork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
private Double leftOperand;
private String operation;
    public Calculator() {
        setTitle("Калькулятор");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 450, 450);
        setLayout(new BorderLayout());

        JLabel display = new JLabel("0");
        display.setHorizontalAlignment(SwingConstants.CENTER);
        display.setFont(new Font("Arial", Font.ROMAN_BASELINE, 50));
        add(display, BorderLayout.NORTH);

        ActionListener numberListener = new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JButton button = (JButton) e.getSource();
                String text = button.getText();
                String displayText = display.getText();
                if (".".equals(text) && display.getText().contains(".")) {
                    return;
                }
                if ("0".equals(displayText) && !".".equals(text)) {
                    displayText = "";
                }
                displayText += text;
                display.setText(displayText);
                      }
        };

        ActionListener buttonListener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JButton source = (JButton) e.getSource();
                String  action =source.getText();
                Double rightOperand =Double.parseDouble(display.getText());

             if ("=".equals(action)){
                if (leftOperand!=null){
                    switch (operation){
                        case"+":
                            display.setText(String.valueOf(leftOperand+rightOperand));
                            break;
                        case"-":
                            display.setText(String.valueOf(leftOperand-rightOperand));
                            break;
                        case"*":
                            display.setText(String.valueOf(leftOperand*rightOperand));
                            break;
                        case"/":
                            display.setText(String.valueOf(leftOperand/rightOperand));
                            break;
                        case"%":
                            display.setText(String.valueOf(leftOperand/rightOperand*100));
                            break;
                        case "x^y":
                            display.setText(String.valueOf(Math.pow(leftOperand,rightOperand)));
                       case "sqrt[n]":
                           display.setText(String.valueOf(Math.pow(leftOperand,(1/rightOperand))));
                    }
                leftOperand=Double.parseDouble(display.getText());
                                       operation=null;
                }
                return;
            }
                leftOperand =Double.parseDouble(display.getText());
                operation=action;
                display.setText("0");
            if ("С".equals(action)){
                display.setText("0");
            }
            }
        };

        JPanel numberPanel = new JPanel();
        GridLayout numberLayout = new GridLayout(4, 3, 3, 3);
        numberPanel.setLayout(numberLayout);

        for (int i = 1; i < 10; i++) {
            JButton button = new JButton(String.valueOf(i));
            button.addActionListener(numberListener);
            numberPanel.add(button);
        }
        JButton nullButton = new JButton("0");
        nullButton.addActionListener(numberListener);
        numberPanel.add(nullButton);

        JButton pointButton = new JButton(".");
        pointButton.addActionListener(numberListener);
        numberPanel.add(pointButton);


        add(numberPanel, BorderLayout.CENTER);

        //панель кнопок//
        JPanel buttonPanel = new JPanel();
        GridLayout buttonLayout = new GridLayout(4, 2, 2, 2);
        buttonPanel.setLayout(buttonLayout);

        for (char c : "+*-/%".toCharArray()) {
            JButton button = new JButton(String.valueOf(c));
            buttonPanel.add(button);
            button.addActionListener(buttonListener);
        }

        JButton degreeButton = new JButton("x^y");
        buttonPanel.add(degreeButton);
        degreeButton.addActionListener(buttonListener);

        JButton sqrt = new JButton("sqrt[n]");
        buttonPanel.add(sqrt);
        sqrt.addActionListener(buttonListener);
        
        JButton resultButton = new JButton("=");
        buttonPanel.add(resultButton);
        resultButton.addActionListener(buttonListener);

      JButton cleanButton = new JButton("C");
        numberPanel.add(cleanButton);
        cleanButton.addActionListener(buttonListener);

        add(buttonPanel, BorderLayout.EAST);

        setVisible(true);


    }


    public static void main(String[] args) {
        new Calculator();
    }

}
