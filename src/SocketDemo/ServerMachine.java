/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SocketDemo;

import javax.swing.*;

/**
 *
 * @author Shalon
 */
public class ServerMachine {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JPanel p = new JPanel();
        JLabel lbl = new JLabel("server");
        JTextArea t = new JTextArea(10,30);
        JTextField mField = new JTextField(20);
        JButton btn = new JButton("click");
        GroupLayout layout = new GroupLayout(p);
        layout.setVerticalGroup(layout.createSequentialGroup().addComponent(lbl).addComponent(t));
        p.add(mField);
        p.add(btn);
        frame.add(p);
        frame.setSize(500,500);
        frame.setVisible(true);
        
    }
}