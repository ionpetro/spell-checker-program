import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.border.TitledBorder;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class GUIMaker {

	JFrame myFrame = new JFrame("Javaholics Spell Checker Program");

	JButton runButton = new JButton("Run");
	JButton cancelButton = new JButton("Cancel");
	JLabel msgLabel = new JLabel();

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();

	//Default Constructor
	public GUIMaker() {};

	public void createGUI() {


		runButton.setToolTipText("This is the button to run the code");
		runButton.setForeground(Color.blue);


		cancelButton.setToolTipText("This is the button to cancel the operation");
		cancelButton.setForeground(Color.red);

  
        panel2.setBorder(new TitledBorder("Actions"));
       
	    panel2.add(runButton);


		panel3.setBorder(new TitledBorder("Cancel"));
		panel3.add(cancelButton);

        panel1.setBorder(new TitledBorder("Welcome"));
        panel1.setSize(300,200);
        JLabel label = new JLabel("Welcome user this is our spell checking program!");

		 //Adding actionListeners
		 GUIListener myListener = new GUIListener();
		 runButton.addActionListener(myListener);
         cancelButton.addActionListener(myListener);
        
         panel1.add(label);
         myFrame.add(panel1);
		 myFrame.add(panel2);
		 myFrame.add(panel3);

	     myFrame.setSize(600, 400);
		 myFrame.setLocationRelativeTo(null);
		 myFrame.setLayout(new GridLayout(2,2));
		 myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 myFrame.setVisible(true);



	}




	public class GUIListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == runButton) {
				
			        myFrame.setVisible(false);
			       
                Dictionaries.loadDictionary();
               
		    }  else if (e.getSource() == cancelButton) {
				System.exit(0);
			}
	    }

	}

}
