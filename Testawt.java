package operatorsWithJava;


import java.awt.*;
public class Testawt
{
 Testawt()
 {
  Frame fm=new Frame();         //Creating a frame.
  Label lb = new Label("welcome to java graphics");     //Creating a label
  fm.add(lb);		              //adding label to the frame.
  fm.setSize(300, 300);               //setting frame size.
  fm.setVisible(false);                //set frame visibilty true.
 }
 public static void main(String args[])
 {
  Testawt ta = new Testawt();
 }
}