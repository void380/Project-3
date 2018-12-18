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
import javax.swing.AbstractListModel;

public class PMSIssuesForm {

	private JFrame frmDeliverablesCreationForm;
	private JTextField txtMyDeliverable;
	private JTextField txtResourceTitle;
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
	private JTextField txtMax;
	private JTextField txtHigh;
	private JTextField txtUnsolved;
	private JTextField txtThisStatusIs;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PMSIssuesForm window = new PMSIssuesForm();
					window.frmDeliverablesCreationForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PMSIssuesForm() {
		initialize();
	}

	private void initialize() {
		frmDeliverablesCreationForm = new JFrame();
		frmDeliverablesCreationForm.setResizable(false);
		frmDeliverablesCreationForm.setTitle("Issue Creation Form");
		frmDeliverablesCreationForm.setBounds(100, 100, 640, 830);
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
		txtMyDeliverable.setText("Issue name");
		txtMyDeliverable.setBounds(16, 34, 224, 26);
		panel_1.add(txtMyDeliverable);
		txtMyDeliverable.setColumns(10);

		String samples[] = { "Requirement 3", "Requirement 5", "Requirement 7", "Requirement 8", "Requirement 10", "Requirement 11" };

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(280, 47, 254, 208);
		frmDeliverablesCreationForm.getContentPane().add(panel_4);

		JLabel lblListOfTasks = new JLabel("Affected Tasks");
		lblListOfTasks.setHorizontalAlignment(SwingConstants.CENTER);
		lblListOfTasks.setBounds(59, 6, 132, 16);
		panel_4.add(lblListOfTasks);

		JButton button_1 = new JButton("Sort");
		button_1.setBounds(6, 6, 60, 29);
		panel_4.add(button_1);

		JButton button_3 = new JButton("Filter");
		button_3.setBounds(6, 34, 60, 29);
		panel_4.add(button_3);

		JButton button_5 = new JButton("Open");
		button_5.setBounds(96, 34, 60, 29);
		panel_4.add(button_5);

		JLabel lblAssociatedTasks = new JLabel("Task");
		lblAssociatedTasks.setHorizontalAlignment(SwingConstants.CENTER);
		lblAssociatedTasks.setBounds(59, 63, 132, 16);
		panel_4.add(lblAssociatedTasks);

		JButton button_7 = new JButton("-");
		button_7.setBounds(43, 173, 78, 29);
		panel_4.add(button_7);

		JButton button_8 = new JButton("+");
		button_8.setBounds(131, 173, 75, 29);
		panel_4.add(button_8);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(56, 86, 135, 87);
		panel_4.add(scrollPane_1);

		String samples2[] = { "Task 1", "Task 4", "Task 5", "Task 9", "Task 11", "Task 13" };

		JList list_1 = new JList(samples2);
		list_1.setModel(new AbstractListModel() {
			String[] values = new String[] { "Task0", "Task1", "Task2", "Task3", "Task4", "Task5" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_1.setViewportView(list_1);

		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_2.setBounds(16, 126, 254, 78);
		frmDeliverablesCreationForm.getContentPane().add(panel_2);

		JLabel lblTitle = new JLabel("Description");
		lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitle.setBounds(89, 6, 79, 16);
		panel_2.add(lblTitle);

		txtResourceTitle = new JTextField();
		txtResourceTitle.setText("Issue description");
		txtResourceTitle.setColumns(10);
		txtResourceTitle.setBounds(16, 34, 224, 26);
		panel_2.add(txtResourceTitle);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(16, 216, 239, 53);
		frmDeliverablesCreationForm.getContentPane().add(panel_5);

		JLabel lblStartDate = new JLabel("Date Raised");
		lblStartDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblStartDate.setBounds(80, 6, 79, 16);
		panel_5.add(lblStartDate);

		textField = new JTextField();
		textField.setText("MM");
		textField.setColumns(10);
		textField.setBounds(25, 20, 43, 26);
		panel_5.add(textField);

		textField_1 = new JTextField();
		textField_1.setText("DD");
		textField_1.setColumns(10);
		textField_1.setBounds(80, 20, 43, 26);
		panel_5.add(textField_1);

		textField_2 = new JTextField();
		textField_2.setText("YYYY");
		textField_2.setColumns(10);
		textField_2.setBounds(135, 20, 77, 26);
		panel_5.add(textField_2);

		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel.setBounds(16, 267, 239, 53);
		frmDeliverablesCreationForm.getContentPane().add(panel);

		JLabel lblEndDate = new JLabel("Date Assigned");
		lblEndDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndDate.setBounds(80, 6, 91, 16);
		panel.add(lblEndDate);

		textField_3 = new JTextField();
		textField_3.setText("MM");
		textField_3.setColumns(10);
		textField_3.setBounds(25, 20, 43, 26);
		panel.add(textField_3);

		textField_4 = new JTextField();
		textField_4.setText("DD");
		textField_4.setColumns(10);
		textField_4.setBounds(80, 20, 43, 26);
		panel.add(textField_4);

		textField_5 = new JTextField();
		textField_5.setText("YYYY");
		textField_5.setColumns(10);
		textField_5.setBounds(135, 20, 77, 26);
		panel.add(textField_5);

		JPanel panel_6 = new JPanel();
		panel_6.setLayout(null);
		panel_6.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_6.setBounds(16, 319, 239, 53);
		frmDeliverablesCreationForm.getContentPane().add(panel_6);

		JLabel lblCompletionDate = new JLabel("Expected Completion Date");
		lblCompletionDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblCompletionDate.setBounds(25, 6, 187, 16);
		panel_6.add(lblCompletionDate);

		textField_6 = new JTextField();
		textField_6.setText("MM");
		textField_6.setColumns(10);
		textField_6.setBounds(25, 20, 43, 26);
		panel_6.add(textField_6);

		textField_7 = new JTextField();
		textField_7.setText("DD");
		textField_7.setColumns(10);
		textField_7.setBounds(80, 20, 43, 26);
		panel_6.add(textField_7);

		textField_8 = new JTextField();
		textField_8.setText("YYYY");
		textField_8.setColumns(10);
		textField_8.setBounds(135, 20, 77, 26);
		panel_6.add(textField_8);

		JPanel panel_7 = new JPanel();
		panel_7.setLayout(null);
		panel_7.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_7.setBounds(16, 369, 239, 53);
		frmDeliverablesCreationForm.getContentPane().add(panel_7);

		JLabel lblExpectedStartDate = new JLabel("Update Date");
		lblExpectedStartDate.setHorizontalAlignment(SwingConstants.CENTER);
		lblExpectedStartDate.setBounds(44, 6, 141, 16);
		panel_7.add(lblExpectedStartDate);

		textField_9 = new JTextField();
		textField_9.setText("MM");
		textField_9.setColumns(10);
		textField_9.setBounds(25, 20, 43, 26);
		panel_7.add(textField_9);

		textField_10 = new JTextField();
		textField_10.setText("DD");
		textField_10.setColumns(10);
		textField_10.setBounds(80, 20, 43, 26);
		panel_7.add(textField_10);

		textField_11 = new JTextField();
		textField_11.setText("YYYY");
		textField_11.setColumns(10);
		textField_11.setBounds(135, 20, 77, 26);
		panel_7.add(textField_11);

		JPanel panel_12 = new JPanel();
		panel_12.setLayout(null);
		panel_12.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_12.setBounds(280, 267, 254, 208);
		frmDeliverablesCreationForm.getContentPane().add(panel_12);

		JLabel lblDecisions = new JLabel("Decisions");
		lblDecisions.setHorizontalAlignment(SwingConstants.CENTER);
		lblDecisions.setBounds(59, 6, 132, 16);
		panel_12.add(lblDecisions);

		JButton button_15 = new JButton("Sort");
		button_15.setBounds(6, 6, 60, 29);
		panel_12.add(button_15);

		JButton button_16 = new JButton("Filter");
		button_16.setBounds(6, 34, 60, 29);
		panel_12.add(button_16);

		JButton button_17 = new JButton("Open");
		button_17.setBounds(96, 34, 60, 29);
		panel_12.add(button_17);

		JButton button_18 = new JButton("-");
		button_18.setBounds(43, 173, 78, 29);
		panel_12.add(button_18);

		JButton button_19 = new JButton("+");
		button_19.setBounds(131, 173, 75, 29);
		panel_12.add(button_19);

		JScrollPane scrollPane_3 = new JScrollPane();
		scrollPane_3.setBounds(56, 75, 135, 98);
		panel_12.add(scrollPane_3);

		JList list_4 = new JList();
		list_4.setModel(new AbstractListModel() {
			String[] values = new String[] { "Decision0", "Decision1", "Decision2", "Decision3", "Decision4" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane_3.setViewportView(list_4);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(16, 434, 254, 78);
		frmDeliverablesCreationForm.getContentPane().add(panel_3);

		JLabel lblPriority = new JLabel("Priority");
		lblPriority.setHorizontalAlignment(SwingConstants.CENTER);
		lblPriority.setBounds(89, 6, 79, 16);
		panel_3.add(lblPriority);

		txtMax = new JTextField();
		txtMax.setText("Max");
		txtMax.setColumns(10);
		txtMax.setBounds(16, 34, 224, 26);
		panel_3.add(txtMax);

		JPanel panel_8 = new JPanel();
		panel_8.setLayout(null);
		panel_8.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_8.setBounds(16, 524, 254, 78);
		frmDeliverablesCreationForm.getContentPane().add(panel_8);

		JLabel lblSeverity = new JLabel("Severity");
		lblSeverity.setHorizontalAlignment(SwingConstants.CENTER);
		lblSeverity.setBounds(89, 6, 79, 16);
		panel_8.add(lblSeverity);

		txtHigh = new JTextField();
		txtHigh.setText("High");
		txtHigh.setColumns(10);
		txtHigh.setBounds(16, 34, 224, 26);
		panel_8.add(txtHigh);

		JPanel panel_9 = new JPanel();
		panel_9.setLayout(null);
		panel_9.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_9.setBounds(16, 614, 254, 78);
		frmDeliverablesCreationForm.getContentPane().add(panel_9);

		JLabel lblStatus = new JLabel("Status");
		lblStatus.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatus.setBounds(89, 6, 79, 16);
		panel_9.add(lblStatus);

		txtUnsolved = new JTextField();
		txtUnsolved.setText("Unsolved");
		txtUnsolved.setColumns(10);
		txtUnsolved.setBounds(16, 34, 224, 26);
		panel_9.add(txtUnsolved);

		JPanel panel_13 = new JPanel();
		panel_13.setLayout(null);
		panel_13.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_13.setBounds(16, 707, 254, 78);
		frmDeliverablesCreationForm.getContentPane().add(panel_13);

		JLabel lblStatusDescription = new JLabel("Status Description");
		lblStatusDescription.setHorizontalAlignment(SwingConstants.CENTER);
		lblStatusDescription.setBounds(58, 6, 137, 16);
		panel_13.add(lblStatusDescription);

		txtThisStatusIs = new JTextField();
		txtThisStatusIs.setText("This status is bad");
		txtThisStatusIs.setColumns(10);
		txtThisStatusIs.setBounds(16, 34, 224, 26);
		panel_13.add(txtThisStatusIs);

		JPanel panel_10 = new JPanel();
		panel_10.setLayout(null);
		panel_10.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_10.setBounds(280, 487, 254, 208);
		frmDeliverablesCreationForm.getContentPane().add(panel_10);

		JLabel lblActionItems = new JLabel("Action Items");
		lblActionItems.setHorizontalAlignment(SwingConstants.CENTER);
		lblActionItems.setBounds(59, 6, 132, 16);
		panel_10.add(lblActionItems);

		JButton button = new JButton("Sort");
		button.setBounds(6, 6, 60, 29);
		panel_10.add(button);

		JButton button_2 = new JButton("Filter");
		button_2.setBounds(6, 34, 60, 29);
		panel_10.add(button_2);

		JButton button_4 = new JButton("Open");
		button_4.setBounds(96, 34, 60, 29);
		panel_10.add(button_4);

		JButton button_6 = new JButton("-");
		button_6.setBounds(43, 173, 78, 29);
		panel_10.add(button_6);

		JButton button_9 = new JButton("+");
		button_9.setBounds(131, 173, 75, 29);
		panel_10.add(button_9);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 75, 135, 98);
		panel_10.add(scrollPane);

		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] { "Action Item 1", "Action Item 2", "Action Item 5", "Action Item 3", "Action Item 4" };

			public int getSize() {
				return values.length;
			}

			public Object getElementAt(int index) {
				return values[index];
			}
		});
		scrollPane.setViewportView(list);
	}
}
