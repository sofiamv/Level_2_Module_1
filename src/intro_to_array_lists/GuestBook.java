package intro_to_array_lists;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	ArrayList<String> coolguests = new ArrayList<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton("Add Name:");
	JButton button2 = new JButton("View Names:");
	public static void main(String[]args) {
		GuestBook a = new GuestBook();
		a.coolmethod();
	}
	void coolmethod(){
		frame.add(panel);
		frame.setVisible(true);
		panel.add(button1);
		panel.add(button2);
		frame.pack();
		button1.addActionListener(this);
		button2.addActionListener(this);

	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button1) {
	String userinput = JOptionPane.showInputDialog("Please input name:");
	coolguests.add(userinput);
		}if(e.getSource()==button2) {
			String msg = "";
			for(int i = 0; i < coolguests.size(); i++) {
				msg = msg + "Guest " + (i+1) + ":" + coolguests.get(i) + "\n";
			}
		JOptionPane.showMessageDialog(null, msg);
		
	}}
}
