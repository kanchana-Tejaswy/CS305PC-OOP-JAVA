import java.awt.event.*;
import java.awt.*;

class Lab7P1
{
				public static void main(String[] args){
				final int[] n = {1};
				Frame f = new Frame("AWT Example");
				TextField tf = new TextField(20);
				
				Button b = new Button(" click ");
				b.setSize( 20, 40 );
				
				Label l = new Label();
				l.setPreferredSize( new Dimension ( 100, 100));
				
				b.addActionListener( new ActionListener() {
				 @Override
				 public void actionPerformed(ActionEvent e){
				 			System.out.println(" The text is : " + tf.getText() + n[0]);
				 			l.setText(tf.getText() + " " +n[0]);
				 			//tf,setText("hello"); -> to see hello in TextBox / text field
				 			n[0]++;
				 }
				});
				f.addWindowListener(new WindowAdapter(){
							@Override
							public void windowClosing(WindowEvent e){
									f.dispose();
									
							}
				});
				FlowLayout fl = new FlowLayout();
				f.setLayout(fl);
				f.add(tf);
				f.add(b);
				f.add(l);
				f.setVisible(true);
				
				}
				}
				
				
				
				
				
