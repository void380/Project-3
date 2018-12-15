package gui;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class PMSTaskOptions {

	private JFrame frmDeliverablesCreationForm;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PMSTaskOptions window = new PMSTaskOptions();
					window.frmDeliverablesCreationForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PMSTaskOptions() {
		initialize();
	}

	private void initialize() {
		frmDeliverablesCreationForm = new JFrame();
		frmDeliverablesCreationForm.setResizable(false);
		frmDeliverablesCreationForm.setTitle("Task Options");
		frmDeliverablesCreationForm.setBounds(100, 100, 256, 164);
		frmDeliverablesCreationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeliverablesCreationForm.getContentPane().setLayout(new GridLayout(4, 1, 0, 0));

		JButton btnNewButton = new JButton("Create Summary Task");
		frmDeliverablesCreationForm.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Create Milestone");
		frmDeliverablesCreationForm.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("Create Composite Task");
		frmDeliverablesCreationForm.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Group Tasks to Composite");
		frmDeliverablesCreationForm.getContentPane().add(btnNewButton_3);
	}
}
