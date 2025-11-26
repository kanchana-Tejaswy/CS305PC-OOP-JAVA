import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Lab9P2 extends JFrame{
	Label l;
	Lab9P2(){
		super("Tabbed Pane Demo");
		String []heading = {"Name", "Course", "RollNo"};
		String[][] data ={
						{"t", "cse " , "1234"},
						{"a", "csed", "76777"},
						{"b", "csed", "76777"},
						{"c", "csed", "76777"},
		} ;
		JTable jt = new JTable(data,heading);
		JScrollPane sp = new JScrollPane(jt);
		
	  add(sp);
		//add(jt);
		setVisible(true);
		setSize(500, 500);                                                                
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		public static void main(String...args){
		new Lab9P2();
	}
}
    
