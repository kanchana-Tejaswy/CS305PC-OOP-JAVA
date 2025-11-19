import java.awt.*;
import java.awt.event.*;

class Lab8P1 extends Frame implements  ActionListner{
Label label;
    Lab8P1() {
        super("Demonistration for MenuBar");

        MenuBar mb = new MenuBar();
        setMenuBar(mb);

        Menu file = new Menu("File");

        String[] menu = { "file", "edit", "help" };
        String[] [] mi ={ { "Open", "Save", "Close"},
        		{"Cut" ," Copy", " Past"},
        		{"About" , "Update" , "License"},
         };
	int x =0 , y = 0;
	
        for (String s : menu) {
         y = 0;
            Menu m = new Menu(s);
            
	/for (int i=0 , i<3 , i++){
	MenuItem mi = new MenuItem(mi[x] ,[y]);
	mi.addItemListner(this);
	m.add(mi); 
	y++;
	}
	x++;
	

            mb.add(m);
        }

        setSize(500, 400);
        setVisible(true);

        addWindowListener(
            new WindowAdapter() {
                public void windowClosing(WindowEvent we) {
                    dispose();
                }
            }
        );
    }

    public static void actionPerformed(ActionEvent ae) {
    String mstr = ae.getActionCommand();
    if(mstr.equals("Close")){
    System.exit(0);
    }else{
        
    }
}
/* fix the error */
