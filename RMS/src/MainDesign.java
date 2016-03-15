import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class MainDesign {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainDesign window = new MainDesign();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainDesign() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("RESTUARANT MANAGEMENT SYSTEM");
		frame.setBounds(100, 100, 582, 353);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblBillingCustomer = new JLabel("BILLING CUSTOMER");
		lblBillingCustomer.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblBillingCustomer.setForeground(Color.RED);
		lblBillingCustomer.setBackground(Color.CYAN);
		lblBillingCustomer.setBounds(193, 0, 214, 57);
		frame.getContentPane().add(lblBillingCustomer);
		
		textField = new JTextField();
		textField.setBounds(142, 55, 139, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblCus = new JLabel("Customer Name");
		lblCus.setBounds(25, 55, 150, 20);
		frame.getContentPane().add(lblCus);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("");
		comboBox.addItem("1");
		comboBox.addItem("2");
		comboBox.addItem("3");
		comboBox.setBounds(417, 55, 98, 20);
		frame.getContentPane().add(comboBox);
		
		
		JLabel lblTableNo = new JLabel("Table No.");
		lblTableNo.setBounds(338, 58, 70, 14);
		frame.getContentPane().add(lblTableNo);
		
		JPanel panel = new JPanel();
		panel.setBounds(25, 92, 513, 195);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addItem("Select Types");
		comboBox_1.addItem("Food");
		comboBox_1.addItem("Drinks");
		comboBox_1.setBounds(33, 37, 125, 20);
		panel.add(comboBox_1);
		
		
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(195, 37, 136, 20);
		panel.add(comboBox_2);
		
		comboBox_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JComboBox comboBox_1 = (JComboBox) event.getSource();
                comboBox_2.removeAllItems();
                Object selected = comboBox_1.getSelectedItem();
                if(selected.toString().equals("Food")){
                	comboBox_2.addItem("Select Item");
                	comboBox_2.addItem("Pizza");
                	comboBox_2.addItem("Mo:Mo");
                	comboBox_2.addItem("Puri Tarkari");
                	comboBox_2.addItem("Burger");
                }
                if(selected.toString().equals("Drinks")){
                	comboBox_2.addItem("Select Item");
                	comboBox_2.addItem("Coke");
                	comboBox_2.addItem("Fanta");
                	comboBox_2.addItem("Pepsi");
                	comboBox_2.addItem("Wine");
                	comboBox_2.addItem("Black Label");
                }
            }
		});
		
		textField_1 = new JTextField();
		textField_1.setBounds(362, 37, 117, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblTypes = new JLabel("Types");
		lblTypes.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblTypes.setBounds(72, 11, 50, 14);
		panel.add(lblTypes);
		
		JLabel lblItems = new JLabel("Items");
		lblItems.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblItems.setBounds(246, 11, 50, 14);
		panel.add(lblItems);
		
		JLabel lblQuantity = new JLabel("Quantity");
		lblQuantity.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblQuantity.setBounds(396, 12, 50, 14);
		panel.add(lblQuantity);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.addItem("Select Types");
		comboBox_3.addItem("Food");
		comboBox_3.addItem("Drinks");
		comboBox_3.setBounds(33, 75, 125, 20);
		panel.add(comboBox_3);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(195, 75, 136, 20);
		panel.add(comboBox_4);
		
		comboBox_3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JComboBox comboBox_3 = (JComboBox) event.getSource();
                comboBox_4.removeAllItems();
                Object selected = comboBox_3.getSelectedItem();
                if(selected.toString().equals("Food")){
                	comboBox_4.addItem("Select Item");
                	comboBox_4.addItem("Pizza");
                	comboBox_4.addItem("Mo:Mo");
                	comboBox_4.addItem("Puri Tarkari");
                	comboBox_4.addItem("Burger");
                }
                if(selected.toString().equals("Drinks")){
                	comboBox_4.addItem("Select Item");
                	comboBox_4.addItem("Coke");
                	comboBox_4.addItem("Fanta");
                	comboBox_4.addItem("Pepsi");
                	comboBox_4.addItem("Wine");
                	comboBox_4.addItem("Black Label");
                }
            }
		});
		
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(362, 118, 117, 20);
		panel.add(textField_2);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.addItem("Select Types");
		comboBox_5.addItem("Food");
		comboBox_5.addItem("Drinks");
		comboBox_5.setBounds(33, 118, 125, 20);
		panel.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(195, 118, 136, 20);
		panel.add(comboBox_6);
		
		comboBox_5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                JComboBox comboBox_5 = (JComboBox) event.getSource();
                comboBox_6.removeAllItems();
                Object selected = comboBox_5.getSelectedItem();
                if(selected.toString().equals("Food")){
                	comboBox_6.addItem("Select Item");
                	comboBox_6.addItem("Pizza");
                	comboBox_6.addItem("Mo:Mo");
                	comboBox_6.addItem("Puri Tarkari");
                	comboBox_6.addItem("Burger");
                }
                if(selected.toString().equals("Drinks")){
                	comboBox_6.addItem("Select Item");
                	comboBox_6.addItem("Coke");
                	comboBox_6.addItem("Fanta");
                	comboBox_6.addItem("Pepsi");
                	comboBox_6.addItem("Wine");
                	comboBox_6.addItem("Black Label");
                }
            }
		});
		
		
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(362, 75, 117, 20);
		panel.add(textField_3);
		
		JButton btnBill = new JButton("Bill");
		btnBill.setBounds(378, 161, 89, 23);
		panel.add(btnBill);
	}
}
