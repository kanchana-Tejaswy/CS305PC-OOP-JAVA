import java.awt.event.*;
import java.awt.*;

class Lab7P2 implements ActionListener


{
			Frame f = new Frame("AWT Example");
			Button b = new Button(" click ");
			TextField tf = new TextField(20);
			Label l = new Label();
			final int[] n = {1};
			
	 	Lab7P2(){          									
				
				
				
				
				
				b.setSize( 20, 40 );
				
				
				l.setPreferredSize( new Dimension ( 100, 100));
				
				b.addActionListener(this);
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
				
				 public void actionPerformed(ActionEvent e){
				 			System.out.println(" The text is : " + tf.getText() + n[0]);
				 			l.setText(tf.getText() + " " +n[0]);
				 			//tf,setText("hello"); -> to see hello in TextBox / text field
				 			n[0]++;
				 			
				}
				public static void main(String[] args){
				new Lab7P2();
				}
				}
				
