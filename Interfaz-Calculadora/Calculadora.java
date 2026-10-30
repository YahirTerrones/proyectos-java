

package com.mycompany.calculadora;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class Calculadora extends JFrame {
    
    public JPanel panel;                                                 
    public JTextField texto;
    int suma1;
    int suma2; 
    String signo;
    
    
    public Calculadora(){
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setLocationRelativeTo(null);
        
        Panel();       
        cajaTexto();

        
        
    }
    
    
    

    public static void main(String[] args) {
        
        Calculadora c1 = new Calculadora();
        c1.setVisible(true);
    
    }
    
    
    public void Panel(){
        
         panel = new JPanel();
        panel.setLayout(null);
        this.getContentPane().add(panel);
        
        
        
        JButton n1 = new JButton("1");
        panel.add(n1);
        n1.setBounds(10, 100, 80, 80);
        n1.setOpaque(true);
        n1.setBackground(Color.WHITE);              
        
        JButton n2 = new JButton("2");
        panel.add(n2);
        n2.setBounds(100, 100, 80, 80);
        n2.setOpaque(true);
        n2.setBackground(Color.WHITE);
                
        JButton n3 = new JButton("3");
        panel.add(n3);
        n3.setBounds(190, 100, 80, 80);
        n3.setOpaque(true);
        n3.setBackground(Color.WHITE);
        
        JButton mas = new JButton("+");
        panel.add(mas);
        mas.setBounds(280, 100, 80, 80);
        mas.setOpaque(true);
        mas.setBackground(Color.WHITE);
        
        JButton n4 = new JButton("4");
        panel.add(n4);
        n4.setBounds(10, 190, 80, 80);
        n4.setOpaque(true);
        n4.setBackground(Color.WHITE);
        
        JButton n5 = new JButton("5");
        panel.add(n5);
        n5.setBounds(100, 190, 80, 80);
        n5.setOpaque(true);
        n5.setBackground(Color.WHITE);
        
        JButton n6 = new JButton("6");
        panel.add(n6);
        n6.setBounds(190, 190, 80, 80);
        n6.setOpaque(true);
        n6.setBackground(Color.WHITE);
        
        JButton menos = new JButton("-");
        panel.add(menos);
        menos.setBounds(280, 190, 80, 80);
        menos.setOpaque(true);
        menos.setBackground(Color.WHITE);
        
        JButton n7 = new JButton("7");
        panel.add(n7);
        n7.setBounds(10, 280, 80, 80);
        n7.setOpaque(true);
        n7.setBackground(Color.WHITE);
        
        JButton n8 = new JButton("8");
        panel.add(n8);
        n8.setBounds(100, 280, 80, 80);
        n8.setOpaque(true);
        n8.setBackground(Color.WHITE);
        
        JButton n9 = new JButton("9");
        panel.add(n9);
        n9.setBounds(190, 280, 80, 80);
        n9.setOpaque(true);
        n9.setBackground(Color.WHITE);
        
        JButton por = new JButton("*");
        panel.add(por);
        por.setBounds(280, 280, 80, 80);
        por.setOpaque(true);
        por.setBackground(Color.WHITE);
        
        JButton reseteo = new JButton("C");
        panel.add(reseteo);
        reseteo.setBounds(10, 370, 80, 80);
        reseteo.setOpaque(true);
        reseteo.setBackground(Color.WHITE);
        
        
        JButton n0 = new JButton("0");
        panel.add(n0);
        n0.setBounds(100, 370, 80, 80);
        n0.setOpaque(true);
        n0.setBackground(Color.WHITE);
        
        
        JButton igual = new JButton("=");
        panel.add(igual);
        igual.setBounds(190, 370, 80, 80);
        igual.setOpaque(true);
        igual.setBackground(Color.WHITE);
        
        JButton division = new JButton("/");
        panel.add(division);
        division.setBounds(280, 370, 80, 80);
        division.setOpaque(true);
        division.setBackground(Color.WHITE);
        
        
        ActionListener inicio = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 
                 texto.setText(texto.getText()+"1");                 
             }
         };
        
        
        n1.addActionListener(inicio);
        
        ActionListener inicio2 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 texto.setText(texto.getText()+"2");
             }
         };
        
        
        n2.addActionListener(inicio2);
           
        
         ActionListener inicio3 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 texto.setText(texto.getText()+"3");
             }
         };
        
        
        n3.addActionListener(inicio3);
        
         ActionListener inicio4 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 suma1 = Integer.parseInt(texto.getText());
                 signo = "+";
                 texto.setText("");
             }
         };
        
        
        mas.addActionListener(inicio4);
        
        
         ActionListener inicio5 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 texto.setText(texto.getText()+"4");
             }
         };
        
        
        n4.addActionListener(inicio5);
        
        
         ActionListener inicio6 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 texto.setText(texto.getText()+"5");
             }
         };
        
        
        n5.addActionListener(inicio6);
        
        ActionListener inicio7 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 texto.setText(texto.getText()+"6");
             }
         };
        
        
        n6.addActionListener(inicio7);
        
        
                ActionListener inicio8 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                suma1 = Integer.parseInt(texto.getText());
                 signo = "-";
                 texto.setText("");
             }
         };
        
        
        menos.addActionListener(inicio8);
        
        ActionListener inicio9 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 texto.setText(texto.getText()+"7");
             }
         };
        
        
        n7.addActionListener(inicio9);
        
        ActionListener inicio10 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 texto.setText(texto.getText()+"8");
             }
         };
        
        
        n8.addActionListener(inicio10);
        
        ActionListener inicio11 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 texto.setText(texto.getText()+"9");
             }
         };
        
        
        n9.addActionListener(inicio11);
        
        
        ActionListener inicio12 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 suma1 = Integer.parseInt(texto.getText());
                 signo = "*";
                 texto.setText("");
             }
         };
        
        
        por.addActionListener(inicio12);
        
        ActionListener inicio13 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 texto.setText("");
             }
         };
        
        
        reseteo.addActionListener(inicio13);
        
        ActionListener inicio14 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 texto.setText(texto.getText()+"0");
             }
         };
        
        
        n0.addActionListener(inicio14);
        
        ActionListener inicio15 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 suma2 = Integer.parseInt(texto.getText());
                 
                 switch(signo){
                     case "+":
                         texto.setText(Integer.toString(suma1+suma2));
                         break;
                      case "-":
                         texto.setText(Integer.toString(suma1-suma2));
                         break; 
                       case "*":
                         texto.setText(Integer.toString(suma1*suma2));
                         break; 
                        case "/":
                         texto.setText(Integer.toString(suma1/suma2));
                         break;  
                     
                 }
                     
             }
         };
        
        
        igual.addActionListener(inicio15);
        
        ActionListener inicio16 = new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                suma1 = Integer.parseInt(texto.getText());
                 signo = "/";
                 texto.setText("");
             }
         };
        
        
        division.addActionListener(inicio16);
        
        
        
        
       }
    
    
    
    
    public  void cajaTexto(){
        texto = new JTextField();
        texto.setBounds(8, 10, 350, 80);
        panel.add(texto);
        
        
        
    }
    
    
    
    
    
}








