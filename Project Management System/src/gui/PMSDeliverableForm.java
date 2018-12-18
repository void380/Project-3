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

public class PMSDeliverableForm {

	private JFrame frmDeliverablesCreationForm;
	private JTextField txtMyDeliverable;
	private JTextField txtMm;
	private JTextField txtDd;
	private JTextField txtYyyy;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PMSDeliverableForm window = new PMSDeliverableForm();
					window.frmDeliverablesCreationForm.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public PMSDeliverableForm() {
		initialize();
	}

	private void initialize() {
		frmDeliverablesCreationForm = new JFrame();
		frmDeliverablesCreationForm.setResizable(false);
		frmDeliverablesCreationForm.setTitle("Deliverables Creation Form");
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
		txtMyDeliverable.setText("My Deliverable 1");
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
		dtrpnThisDeliverableIs.setText("This deliverable is...");
		dtrpnThisDeliverableIs.setBounds(6, 34, 242, 78);
		panel_2.add(dtrpnThisDeliverableIs);

		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(319, 47, 254, 208);
		frmDeliverablesCreationForm.getContentPane().add(panel_3);

		JLabel lblListOfRequirements = new JLabel("List of Requirements");
		lblListOfRequirements.setBounds(61, 6, 130, 16);
		panel_3.add(lblListOfRequirements);

		JButton btnSort = new JButton("Sort");
		btnSort.setBounds(6, 6, 60, 29);
		panel_3.add(btnSort);

		JButton btnFilter = new JButton("Filter");
		btnFilter.setBounds(6, 34, 60, 29);
		panel_3.add(btnFilter);

		JButton btnOpen_1 = new JButton("Open");
		btnOpen_1.setBounds(89, 34, 60, 29);
		panel_3.add(btnOpen_1);

		JLabel lblAssociatedRequirements = new JLabel("Associated\nRequirements\n");
		lblAssociatedRequirements.setBounds(43, 65, 163, 16);
		panel_3.add(lblAssociatedRequirements);

		JButton btnCreate_1 = new JButton("Create");
		btnCreate_1.setBounds(43, 173, 78, 29);
		panel_3.add(btnCreate_1);

		JButton btnRemove = new JButton("Remove");
		btnRemove.setBounds(131, 173, 75, 29);
		panel_3.add(btnRemove);

		String samples[] = { "Requirement 3", "Requirement 5", "Requirement 7", "Requirement 8", "Requirement 10", "Requirement 11" };

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(56, 86, 135, 87);
		panel_3.add(scrollPane);
		JList list = new JList(samples);
		scrollPane.setViewportView(list);

		JPanel panel_4 = new JPanel();
		panel_4.setLayout(null);
		panel_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_4.setBounds(319, 267, 254, 208);
		frmDeliverablesCreationForm.getContentPane().add(panel_4);

		JLabel lblListOfTasks = new JLabel("List of Tasks");
		lblListOfTasks.setBounds(86, 6, 81, 16);
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

		JLabel lblAssociatedTasks = new JLabel("Associated Tasks");
		lblAssociatedTasks.setBounds(71, 63, 110, 16);
		panel_4.add(lblAssociatedTasks);

		JButton button_7 = new JButton("Create");
		button_7.setBounds(43, 173, 78, 29);
		panel_4.add(button_7);

		JButton button_8 = new JButton("Remove");
		button_8.setBounds(131, 173, 75, 29);
		panel_4.add(button_8);

		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(56, 86, 135, 87);
		panel_4.add(scrollPane_1);

		String samples2[] = { "Task 1", "Task 4", "Task 5", "Task 9", "Task 11", "Task 13" };

		JList list_1 = new JList(samples2);
		scrollPane_1.setViewportView(list_1);

		JPanel panel_5 = new JPanel();
		panel_5.setLayout(null);
		panel_5.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_5.setBounds(16, 267, 254, 208);
		frmDeliverablesCreationForm.getContentPane().add(panel_5);

		JLabel lblDueDate = new JLabel("Due Date");
		lblDueDate.setBounds(97, 6, 58, 16);
		panel_5.add(lblDueDate);

		txtMm = new JTextField();
		txtMm.setText("MM");
		txtMm.setBounds(29, 98, 43, 26);
		panel_5.add(txtMm);
		txtMm.setColumns(10);

		txtDd = new JTextField();
		txtDd.setText("DD");
		txtDd.setColumns(10);
		txtDd.setBounds(84, 98, 43, 26);
		panel_5.add(txtDd);

		txtYyyy = new JTextField();
		txtYyyy.setText("YYYY");
		txtYyyy.setColumns(10);
		txtYyyy.setBounds(139, 98, 77, 26);
		panel_5.add(txtYyyy);

		JLabel lblMonth = new JLabel("Month");
		lblMonth.setBounds(29, 76, 43, 10);
		panel_5.add(lblMonth);

		JLabel lblDay = new JLabel("Day");
		lblDay.setBounds(92, 73, 24, 16);
		panel_5.add(lblDay);

		JLabel lblYear = new JLabel("Year");
		lblYear.setBounds(157, 76, 43, 10);
		panel_5.add(lblYear);
	}
}
