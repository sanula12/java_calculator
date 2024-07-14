package gui;

import java.awt.*;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class close extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent we) {
        System.exit(0);
    }
}

class Cal implements ActionListener {

    TextField tf;
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11,
            b12, b13, b14, b15, b17, b18,
            b19, b20, b24;

    String fv, sv, op;
    Double fdv,sdv,tot;

    Cal() {
        Frame f = new Frame();
        f.addWindowListener(new close());
        f.setBackground(Color.darkGray);
        f.setTitle("My Calculator");
        f.setResizable(false);
        f.setSize(500, 400);
        f.setLocationRelativeTo(null);

        Font f1 = new Font("Poppins", Font.BOLD, 30);
        Font f2 = new Font("Quicksand", Font.BOLD, 30);
        Font f3 = new Font("Quicksand", Font.BOLD, 30);

        MenuBar mb = new MenuBar();

        Menu m1 = new Menu("View");
        MenuItem mi = new MenuItem("Standard");
        m1.add(mi);

        Menu m2 = new Menu("Edit");
        MenuItem mi2 = new MenuItem("Copy");
        MenuItem mi3 = new MenuItem("Cut");
        m2.add(mi2);
        m2.add(mi3);

        mb.add(m1);
        mb.add(m2);

        f.setMenuBar(mb);

        Panel p1 = new Panel();
        Panel p2 = new Panel();

        GridLayout g1 = new GridLayout(5, 4, 4, 4);
        p2.setLayout(g1);
        p2.setBackground(Color.white);

        tf = new TextField(20);
        tf.setFont(f3);
        tf.setEditable(true);
        tf.setForeground(Color.black);
        tf.setBackground(Color.white);
        tf.setText("0");

        p1.add(tf);

        b1 = new Button("1");
        b2 = new Button("2");
        b3 = new Button("3");
        b4 = new Button("4");
        b5 = new Button("5");
        b6 = new Button("6");
        b7 = new Button("7");
        b8 = new Button("8");
        b9 = new Button("9");
        b10 = new Button("+");
        b11 = new Button("-");
        b12 = new Button("%");
        b13 = new Button("/");
        b14 = new Button("*");
        b15 = new Button("√");
        b17 = new Button(".");
        b18 = new Button("0");
        b19 = new Button("Clear");
        b20 = new Button("00");
        b24 = new Button("=");

        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        b3.setBackground(Color.LIGHT_GRAY);
        b4.setBackground(Color.LIGHT_GRAY);
        b5.setBackground(Color.LIGHT_GRAY);
        b6.setBackground(Color.LIGHT_GRAY);
        b7.setBackground(Color.LIGHT_GRAY);
        b8.setBackground(Color.LIGHT_GRAY);
        b9.setBackground(Color.LIGHT_GRAY);
        b10.setBackground(Color.LIGHT_GRAY);
        b11.setBackground(Color.LIGHT_GRAY);
        b12.setBackground(Color.LIGHT_GRAY);
        b13.setBackground(Color.LIGHT_GRAY);
        b14.setBackground(Color.LIGHT_GRAY);
        b15.setBackground(Color.LIGHT_GRAY);
        b17.setBackground(Color.LIGHT_GRAY);
        b18.setBackground(Color.LIGHT_GRAY);
        b19.setBackground(Color.LIGHT_GRAY);
        b20.setBackground(Color.LIGHT_GRAY);
        b24.setBackground(Color.LIGHT_GRAY);

        b1.setFont(f1);
        b2.setFont(f1);
        b3.setFont(f1);
        b4.setFont(f1);
        b5.setFont(f1);
        b6.setFont(f1);
        b7.setFont(f1);
        b8.setFont(f1);
        b9.setFont(f1);
         b10.setFont(f1);
        b11.setFont(f1);
        b12.setFont(f1);
        b13.setFont(f1);
        b14.setFont(f1);
        b15.setFont(f1);
        b17.setFont(f1);
        b18.setFont(f1);
        b19.setFont(f1);
        b20.setFont(f1);    
        b24.setFont(f1);

         p2.add(b19);  
        p2.add(b12);
            p2.add(b15); 
        p2.add(b13);
         p2.add(b7);      
       p2.add(b8);  
        p2.add(b9);
         p2.add(b14);  
         p2.add(b4);   
         p2.add(b5);
            p2.add(b6);
        p2.add(b11); 
        p2.add(b1);
        p2.add(b2);  
         p2.add(b3);
        p2.add(b10);                
        p2.add(b20);    
        p2.add(b18);
        p2.add(b17);
        p2.add(b24);

        
        

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);
        b24.addActionListener(this);

        f.add(p1, BorderLayout.NORTH);
        f.add(p2, BorderLayout.SOUTH);

        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent d) {

        if (tf.getText().equals("0")) {
            tf.setText("");

        }
       
        Object o = d.getSource();
        if (o.equals(b1)) {
            tf.setText(tf.getText() + b1.getLabel());
        } else if (o.equals(b2)) {
            tf.setText(tf.getText() + b2.getLabel());
        }else if (o.equals(b3)){
        tf.setText(tf.getText() + b3.getLabel());
        }else if (o.equals(b4)){
        tf.setText(tf.getText() + b4.getLabel());
        }     else if (o.equals(b5)){
        tf.setText(tf.getText() + b5.getLabel());
        }       else if (o.equals(b6)){
        tf.setText(tf.getText() + b6.getLabel());
        }       else if (o.equals(b7)){
        tf.setText(tf.getText() + b7.getLabel());
        }               else if (o.equals(b8)){
        tf.setText(tf.getText() + b8.getLabel());
        }               else if (o.equals(b9)){
        tf.setText(tf.getText() + b9.getLabel());
        }     else if (o.equals(b18)){
        tf.setText(tf.getText() + b18.getLabel());
        } else if (o.equals( b20)){
        tf.setText(tf.getText() +  b20.getLabel());
        } else if (o.equals( b17)){
        tf.setText(tf.getText() +  b17.getLabel());
        
        } else if (o.equals(b10)) {//+

            fv = tf.getText();
            op = b10.getLabel();
            tf.setText(" ");

        } else if (o.equals(b11)) {// -
            
            fv = tf.getText();
            op = b11.getLabel();
            tf.setText(" ");

        }else if (o.equals(b14)) {// *
            
            fv = tf.getText();
            op = b14.getLabel();
            tf.setText(" ");
        }else if (o.equals(b13)) {// /
            
            fv = tf.getText();
            op = b13.getLabel();
            tf.setText(" ");
                    
        } else if (o.equals(b12)) {// %
            
            fv = tf.getText();
            op = b12.getLabel();
            tf.setText(" ");
        } else if (o.equals(b19)) {// Clear
            
            fv = tf.getText();
            op = b19.getLabel();
            tf.setText(" ");
        } else if (o.equals(b15)) {// Square Root
            
            fv = tf.getText();
           fdv = Double.parseDouble(fv);
           tot = Math.sqrt(fdv);
           tf.setText(tot + " ");
        } 
        
        
        else if (o.equals(b24)) {// =  
            
            sv = tf.getText();
            
            fdv = Double.parseDouble(fv);
            sdv = Double.parseDouble(sv);
            tf.setText(" ");
            
            if (op.equals("+")) {
                
                tot = fdv+sdv;
                tf.setText(tot + " ");
                
            } else if(op.equals("-")){
                tot = fdv-sdv;
                tf.setText(tot + " ");
                
            }else if(op.equals("*")){
                tot = fdv * sdv;
                tf.setText(tot + " ");
                
            }else if(op.equals("/")){
                tot = fdv / sdv;
                tf.setText(tot + " ");
               }else if(op.equals("%")) {
                   tot = (fdv / 100) * sdv; 
                   tf.setText(tot + "%"); 

            }
        }
    }

}

public class C {

    public static void main(String[] args) {
        new Cal();

    }

}
