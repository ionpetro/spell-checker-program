import javax.swing.*;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.border.TitledBorder;

public class GUIMakerClass {

	JFrame myFrame = new JFrame("Javaholics Spell Checker Program");

	JButton runButton = new JButton("Run");
	JButton cancelButton = new JButton("Cancel");
	JButton InsertTextButton = new JButton("InsertText");

	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();

	//Default Constructor
	public GUIMakerClass() {};

	public void createGUI() {


		runButton.setToolTipText("This is the button to run the code");
		runButton.setForeground(Color.blue);


		cancelButton.setToolTipText("This is the button to cancel the operation");
		cancelButton.setForeground(Color.red);

        InsertTextButton.setToolTipText("This is the button to insert data");
        InsertTextButton.setForeground(Color.gray);

        panel1.setBorder(new TitledBorder("Actions"));
        panel1.add(InsertTextButton);
	    panel1.add(runButton);
		panel1.setSize(100,50);

		panel2.setBorder(new TitledBorder("Cancel"));
		panel2.add(cancelButton);


		 //Adding actionListeners
		 GUIListener myListener = new GUIListener();
		 runButton.addActionListener(myListener);
         cancelButton.addActionListener(myListener);
         InsertTextButton.addActionListener(myListener);

         myFrame.add(panel1);
		 myFrame.add(panel2);

	     myFrame.setSize(600, 400);
		 myFrame.setLocationRelativeTo(null);
		 myFrame.setLayout(new GridLayout(2,2));
		 myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 myFrame.setVisible(true);



	}

	public void testguisample() {
		System.out.println("Please insert your text: ");
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

    }

    public void examplecode() {
		System.out.println("Hello World");
	}





	public class GUIListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == runButton) {
            	examplecode();
		    } else if (e.getSource() == InsertTextButton) {
				testguisample();
			} else if (e.getSource() == cancelButton) {
				System.exit(0);
			}
	    }

	}

}