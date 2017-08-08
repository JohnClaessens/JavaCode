/*  John Claessens
    Assignment 8.1
    Bellevue University
    7 AUG 2017

    Modify the following 'MessageBoxes' application so it uses a single action listener for each button. This will require you to separate the single action listener logic into multiple listeners, one for each button. Then modify the code to provide additional options to two or more buttons.
*/
/* 
 * The source code for this assignment started with
 * a sample from "Thinking in Java" 3rd ed. page 825
 * by Bruce Eckel.  I have finished adding the rest of the action logic.
 *
 * Try to implement one new action listener at a time
 *  do not try to do all of them and then compile
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MessageBoxes{

  private JButton[] b = {
                         new JButton("Alert"),
                         new JButton("Yes/No"),
                         new JButton("Color"),
                         new JButton("Input"),
                         new JButton("4 Vals"),
                         };

  private JTextField txt = new JTextField(15);

  private JFrame frame;

  private ActionListener al = new ActionListener(){
    public void actionPerformed(ActionEvent e){
      String id = ((JButton)e.getSource()).getText();

      if(id.equals("Alert")){

        JOptionPane.showMessageDialog(null,
                                      "There's a bug on you!", "Hey!",
                                      JOptionPane.ERROR_MESSAGE);
      }
      
    }
  };


  private ActionListener a2 = new ActionListener(){
      
       public void actionPerformed(ActionEvent e){
       String id = ((JButton)e.getSource()).getText();
      
      if(id.equals("4 Vals")){

        Object[] selections = {"First", "Second", "Third","Fourth"};//Added another value

        Object val = JOptionPane.showInputDialog(null,
                                                 "Choose one", "Input",
                                                 JOptionPane.INFORMATION_MESSAGE,
                                                 null, selections, selections[0]);

        if(val != null){

          txt.setText(val.toString());
        }
      }
    }
 };
    private ActionListener a3 = new ActionListener(){
      
       public void actionPerformed(ActionEvent e){
       String id = ((JButton)e.getSource()).getText();
      
       if(id.equals("Input")){

        String val = JOptionPane.showInputDialog("How mant fingers do you see?");

        txt.setText(val);
      }
      }
    
  };
  
    private ActionListener a4 = new ActionListener(){
      
       public void actionPerformed(ActionEvent e){
       String id = ((JButton)e.getSource()).getText();
      
       if(id.equals("Color")){

        Object[] options = {"Red", "Green", "Blue"};//Added another value

        int sel = JOptionPane.showOptionDialog(null,
                                               "Choose a Color!", "Warning",
                                               JOptionPane.DEFAULT_OPTION,
                                               JOptionPane.WARNING_MESSAGE, null,
                                               options, options[0]);

        if(sel != JOptionPane.CLOSED_OPTION){

          txt.setText("Color Selected: " + options[sel]);
        }
      }
    }
    
  };
  
      private ActionListener a5 = new ActionListener(){
      
       public void actionPerformed(ActionEvent e){
       String id = ((JButton)e.getSource()).getText();
      
       if(id.equals("Yes/No")){

        int val = JOptionPane.showConfirmDialog(null,
                                                "or no", "Chose yes",
                                                JOptionPane.YES_NO_OPTION);

        if(val != JOptionPane.CLOSED_OPTION){

          if(val == 0){

            txt.setText("Yes");
          }
          else{

            txt.setText("No");
          }
        }
      }
      }
    
    
  };
      
  public MessageBoxes(){

    frame = new JFrame("Title");

    frame.setSize(250, 250);

    frame.getContentPane().setLayout(new FlowLayout());

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    for(int i = 0; i < b.length; i++){

      frame.getContentPane().add(b[i]);
    }

    frame.getContentPane().add(txt);

    frame.setVisible(true);

  }

  public void launchJFrame(){

     for(int i = 0; i < b.length; i++){

      b[i].addActionListener(al);
      b[i].addActionListener(a2);
      b[i].addActionListener(a3);
      b[i].addActionListener(a4);
      b[i].addActionListener(a5);
    }
  }

  public static void main(String [] args){

    MessageBoxes messageBoxes = new MessageBoxes();
    messageBoxes.launchJFrame();
  }
}