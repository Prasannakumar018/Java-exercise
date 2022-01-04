package digitalclock;
import java.util.*;
import java.text.*;
import javax.swing.*;
import java.awt.*;

class ClockScreen extends JFrame{
 private JLabel timeString,lbl_digi;
 public JButton start;
 Thread t;
 final static int CLOCKWIDTH = 605;
 final static int CLOCKHEIGHT = 250;
 Font clockFont = new Font("Courier New", Font.BOLD, 72);
 public ClockScreen(Thread t){
  this.setTitle("Digital Clock");
  this.setVisible(true);
 
  this.setResizable(true);
  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  this.setSize(CLOCKWIDTH,CLOCKHEIGHT);
  this.setLayout(null);
  this.setLocation(GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().x-this.getWidth()/2,GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint().y-this.getHeight()/2);
  this.t=t;
  lbl_digi=new JLabel("Digital Clock");
  lbl_digi.setBounds(10,10,600,100);
  lbl_digi.setFont(clockFont);
  lbl_digi.setHorizontalAlignment(JLabel.CENTER);
      lbl_digi.setVerticalAlignment(JLabel.CENTER);

  timeString=new JLabel();
  timeString.setBounds(10,30,600,220); 
  timeString.setFont(clockFont);
  timeString.setHorizontalAlignment(JLabel.CENTER);
      timeString.setVerticalAlignment(JLabel.CENTER);
  add(timeString);
  add(lbl_digi);

 }
 public void setLabelValue(String value){
  timeString.setText(value);
 }
}
class clock implements Runnable{
 int hour,minute,second;
 String strTime;
 private Thread t;
 private ClockScreen c1;
 private String threadName;
 
 public clock( String name){
        threadName = name;
        System.out.println("Creating " +  threadName );
  c1=new ClockScreen(t);
    }
 public void run() {
  System.out.println("Running " +  threadName );
  try {
   int i=Calendar.getInstance().get(Calendar.SECOND);
   while(true){
    Calendar cal=Calendar.getInstance();

    hour=cal.get(Calendar.HOUR_OF_DAY);

    if(hour >12)
     hour-=12;
    minute=cal.get(Calendar.MINUTE);
    second=cal.get(Calendar.SECOND);
    SimpleDateFormat formatter=new SimpleDateFormat("HH:mm:ss");
    Date date=cal.getTime();
    strTime=formatter.format(date);
    System.out.println(strTime);
     System.out.println("Thread: " + threadName + ", " + second+"\t i:"+(i));
   
    c1.setLabelValue(strTime);
               Thread.sleep(1000);
           }
  } catch (InterruptedException e) {
   System.out.println("Thread " +  threadName + " interrupted.");
  }
  System.out.println("Thread " +  threadName + " exiting.");
 }
 public void start ()
 {
  System.out.println("Starting " +  threadName );
  if (t == null)
  {
   t = new Thread (this, threadName);
   t.start ();
   
  }
 }
}
public class DigitalClock{
 public static void main(String [] args){
  clock c1=new clock("First");
  c1.start();  
 }
}
