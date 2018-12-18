package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class PMSActionItemsForm {

	private JFrame frmDeliverablesCreationForm;
	private JTextField txtMyDeliverable;
	private JTextField txtMm;
	private JTextField txtDd;
	private JTextField txtYyyy;
	private JTextField txtGood;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField txtResource;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PMSActionItemsForm window = new PMSActionItemsForm();
					window.frmDeliverablesCreationForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PMSActionItemsForm() {
		initialize();
	}

	private void initialize() {
		frmDeliverablesCreationForm = new JFrame();
		frmDeliverablesCreationForm.setResizable(false);
		frmDeliverablesCreationForm.setTitle("Action Item Creation Form");
		frmDeliverablesCreationForm.setBounds(100, 100, 640, 512);
		frmDeliverablesCreationForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmDeliverablesCreationForm.getContentPane().setLayout(null);

		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(6, 6, 75, 29);
		frmDeliverablesCreationForm.getContentPane().add(btnCreate);

		JButton btnSave = new JButton("Save");
		btnSave.setBounds(93, 6, 75, 29);
		frmDeliverablesCreationForm.getContentPane().add(btnSave);

		JButton btnLoadFromList = new JButton("Load from List");
		btnLoadFromList.setBounds(180, 6, 117, 29);
		frmDeliverablesCreationForm.getContentPane().add(btnLoadFromList);

		JButton btnOpen = new JButton("Open");
		btnOpen.setBounds(309, 6, 75, 29);
		frmDeliverablesCreationForm.getContentPane().add(btnOpen);

		JButton btnUndo = new JButton("Undo");
		btnUndo.setBounds(396, 6, 75, 29);
		frmDeliverablesCreationForm.getContentPane().add(btnUndo);

		JButton btnRedo = new JButton("Redo");
		btnRedo.setBounds(483, 6, 75, 29);
		frmDeliverablesCreationForm.getContentPane().add(btnRedo);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(16, 47, 254, 78);
		frmDeliverablesCreationForm.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		JLabel lblName = new JLabel("Name");
		lblName.setBounds(109, 6, 36, 16);
		panel_1.add(lblName);

		txtMyDeliverable = new JTextField();
		txtMyDeliverable.setText("My ActionItem 1");
		txtMyDeliverable.setBounds(16, 34, 224, 26);
		panel_1.add(txtMyDeliverable);
		txtMyDeliverable.setColumns(10);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(16, 137, 254, 118);
		frmDeliverablesCreationForm.getContentPane().add(panel_2);

		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(91, 6, 73, 16);
		panel_2.add(lblDescription);

		JEditorPane dtrpnThisDeliverableIs = new JEditorPane();
		dtrpnThisDeliverableIs.setText("This action item is...");
		dtrpnThisDeliverableIs.setBounds(6, 34, 242, 78);
		panel_2.add(dtrpnThisDeliverableIs);

		String samples[] = { "Requirement 3", "Requirement 5", "Requirement 7", "Requirement 8", "Requirement 10", "Requirement 11" };

		String samples2[] = { "Task 1", "Task 4", "Task 5", "Task 9", "Task 11", "Task 13" };

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(16, 267, 254, 66);
		frmDeliverablesCreationForm.getContentPane().add(panel_5);

		JLabel lblDueDate = new JLabel("Date Created");
		lblDueDate.setBounds(85, 6, 81, 16);
		panel_5.add(lblDueDate);

		txtMm = new JTextField();
		txtMm.setText("MM");
		txtMm.setBounds(30, 23, 43, 26);
		panel_5.add(txtMm);
		txtMm.setColumns(10);

		txtDd = new JTextField();
		txtDd.setText("DD");
		txtDd.setColumns(10);
		txtDd.setBounds(85, 23, 43, 26);
		panel_5.add(txtDd);

		txtYyyy = new JTextField();
		txtYyyy.setText("YYYY");
		txtYyyy.setColumns(10);
		txtYyyy.setBounds(140, 23, 77, 26);
		panel_5.add(txtYyyy);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(309, 47, 254, 78);
		frmDeliverablesCreationForm.getContentPane().add(panel);

		JLabel lblStatus = new JLabel("Status");
		lblStatus.setBounds(109, 6, 50, 16);
		panel.add(lblStatus);

		txtGood = new JTextField();
		txtGood.setText("Good");
		txtGood.setColumns(10);
		txtGood.setBounds(16, 34, 224, 26);
		panel.add(txtGood);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(309, 137, 254, 118);
		frmDeliverablesCreationForm.getContentPane().add(panel_3);

		JLabel lblStatusDescription = new JLabel("Status Description");
		lblStatusDescription.setBounds(68, 6, 144, 16);
		panel_3.add(lblStatusDescription);

		JEditorPane dtrpnStatusIsGood = new JEditorPane();
		dtrpnStatusIsGood.setText("Good to go");
		dtrpnStatusIsGood.setBounds(6, 34, 242, 78);
		panel_3.add(dtrpnStatusIsGood);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(16, 345, 254, 66);
		frmDeliverablesCreationForm.getContentPane().add(panel_4);

		JLabel lblDateAssigned = new JLabel("Date Assigned");
		lblDateAssigned.setBounds(78, 6, 96, 16);
		panel_4.add(lblDateAssigned);

		textField = new JTextField();
		textField.setText("MM");
		textField.setColumns(10);
		textField.setBounds(30, 23, 43, 26);
		panel_4.add(textField);

		textField_1 = new JTextField();
		textField_1.setText("DD");
		textField_1.setColumns(10);
		textField_1.setBounds(85, 23, 43, 26);
		panel_4.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setText("YYYY");
		textField_2.setColumns(10);
		textField_2.setBounds(140, 23, 77, 26);
		panel_4.add(textField_2);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(309, 267, 254, 66);
		frmDeliverablesCreationForm.getContentPane().add(panel_6);

		JLabel lblExpectedCompletionDate = new JLabel("Expected Completion Date");
		lblExpectedCompletionDate.setBounds(50, 6, 167, 16);
		panel_6.add(lblExpectedCompletionDate);

		textField_3 = new JTextField();
		textField_3.setText("MM");
		textField_3.setColumns(10);
		textField_3.setBounds(30, 23, 43, 26);
		panel_6.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setText("DD");
		textField_4.setColumns(10);
		textField_4.setBounds(85, 23, 43, 26);
		panel_6.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setText("YYYY");
		textField_5.setColumns(10);
		textField_5.setBounds(140, 23, 77, 26);
		panel_6.add(textField_5);

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(309, 345, 254, 66);
		frmDeliverablesCreationForm.getContentPane().add(panel_7);

		JLabel lblActualCompletionDate = new JLabel("Actual Completion Date");
		lblActualCompletionDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblActualCompletionDate.setBounds(50, 6, 167, 16);
		panel_7.add(lblActualCompletionDate);

		textField_6 = new JTextField();
		textField_6.setText("MM");
		textField_6.setColumns(10);
		textField_6.setBounds(30, 23, 43, 26);
		panel_7.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setText("DD");
		textField_7.setColumns(10);
		textField_7.setBounds(85, 23, 43, 26);
		panel_7.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setText("YYYY");
		textField_8.setColumns(10);
		textField_8.setBounds(140, 23, 77, 26);
		panel_7.add(textField_8);

		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBounds(16, 418, 254, 66);
		frmDeliverablesCreationForm.getContentPane().add(panel_8);

		JLabel lblUpdateDate = new JLabel("Update Date");
		lblUpdateDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblUpdateDate.setBounds(78, 6, 96, 16);
		panel_8.add(lblUpdateDate);

		textField_9 = new JTextField();
		textField_9.setText("MM");
		textField_9.setColumns(10);
		textField_9.setBounds(30, 23, 43, 26);
		panel_8.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setText("DD");
		textField_10.setColumns(10);
		textField_10.setBounds(85, 23, 43, 26);
		panel_8.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setText("YYYY");
		textField_11.setColumns(10);
		textField_11.setBounds(140, 23, 77, 26);
		panel_8.add(textField_11);

		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9.setBounds(309, 418, 254, 60);
		frmDeliverablesCreationForm.getContentPane().add(panel_9);

		JLabel lblResourceAssigned = new JLabel("Resource Assigned");
		lblResourceAssigned.setBounds(54, 6, 125, 16);
		panel_9.add(lblResourceAssigned);

		txtResource = new JTextField();
		txtResource.setText("Resource 1");
		txtResource.setColumns(10);
		txtResource.setBounds(14, 27, 224, 26);
		panel_9.add(txtResource);
	}
}
