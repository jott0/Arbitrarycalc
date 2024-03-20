package com.company;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main{

    public static void main(String[] args) {
        JFrame frame = new JFrame("Arbitrary Precision Calculator");
        JPanel panel = new JPanel();
        JLabel num1Label = new JLabel("Number 1:");
        JTextField numField1 = new JTextField(20);
        JLabel num2Label = new JLabel("Number 2:");
        JTextField numField2 = new JTextField(20);
        JButton addButton = new JButton("Add");
        JButton subButton = new JButton("Subtract");
        JButton mulButton = new JButton("Multiply");
        JButton divButton = new JButton("Divide");
        JLabel resultLabel = new JLabel("Result:");

        panel.add(num1Label);
        panel.add(numField1);
        panel.add(num2Label);
        panel.add(numField2);
        panel.add(addButton);
        panel.add(subButton);
        panel.add(mulButton);
        panel.add(divButton);
        panel.add(resultLabel);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BigDecimal num1 = new BigDecimal(numField1.getText());
                BigDecimal num2 = new BigDecimal(numField2.getText());
                BigDecimal result = num1.add(num2).setScale(4, RoundingMode.HALF_UP);
                resultLabel.setText("Result: " + result.toPlainString());
            }
        });

        subButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BigDecimal num1 = new BigDecimal(numField1.getText());
                BigDecimal num2 = new BigDecimal(numField2.getText());
                BigDecimal result = num1.subtract(num2).setScale(4, RoundingMode.HALF_UP);
                resultLabel.setText("Result: " + result.toPlainString());
            }
        });

        mulButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BigDecimal num1 = new BigDecimal(numField1.getText());
                BigDecimal num2 = new BigDecimal(numField2.getText());
                BigDecimal result = num1.multiply(num2).setScale(4, RoundingMode.HALF_UP);
                resultLabel.setText("Result: " + result.toPlainString());
            }
        });

        divButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BigDecimal num1 = new BigDecimal(numField1.getText());
                BigDecimal num2 = new BigDecimal(numField2.getText());
                BigDecimal result = num1.divide(num2, 4, RoundingMode.HALF_UP);
                resultLabel.setText("Result: " + result.toPlainString());
            }
        });

        frame.add(panel);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
