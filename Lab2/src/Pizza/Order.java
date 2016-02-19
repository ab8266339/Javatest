package Pizza;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.EnumSet;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JTextArea;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;

public class Order extends JFrame {

	private JPanel contentPane;
	private final Action action = new SwingAction();
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Order frame = new Order();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Order() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblWelcomeToMost = new JLabel("Welcome to the most amazing pizza odering system");
	
		
		JRadioButton rdbtnThinBase = new JRadioButton("Thin base");
		//rdbtnThinBase.setSelected(true);
		buttonGroup.add(rdbtnThinBase);
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Deep pan");
		buttonGroup.add(rdbtnNewRadioButton);
		
		JCheckBox chckbxChicken = new JCheckBox("Chicken");
		
		JCheckBox chckbxChess = new JCheckBox("Chess");
		
		JCheckBox chckbxOlive = new JCheckBox("Olive");
		JButton btnOrderFinished = new JButton("Order finished");
		JTextArea txtrYourOrderInfo = new JTextArea();
		txtrYourOrderInfo.setText("Your order info:");
		EnumSet <PizzaTopping> nonVegan = EnumSet.of(
				PizzaTopping.CHICKEN,
				PizzaTopping.SAUSAGE,   
				PizzaTopping.HAM,
				PizzaTopping.PRAWNS,    
				PizzaTopping.BACON,     
				PizzaTopping.BEEF,
				PizzaTopping.TUNA,      
				PizzaTopping.SALAMI,    
				PizzaTopping.TURKEY,
				PizzaTopping.SALMON);
		btnOrderFinished.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				btnOrderFinished.setText("Thanks for your order");
				String base = null;
				String topping="";
				String topping1 = null,topping2=null,topping3=null,topping4 = null;
				if (rdbtnThinBase.isSelected()) {
					base = "Thin Base";
				}
				if (rdbtnNewRadioButton.isSelected()) {
					base = "Deep Pan";
				}
				if (chckbxChicken.isSelected()) {
					topping = topping +"  "+PizzaTopping.class;
					
				}
				if (chckbxChess.isSelected()){
					topping2 ="  Cheese";
					topping = topping + topping2;
				}
				if (chckbxOlive.isSelected()){
					topping3="  Olive";
					topping = topping + topping3;
				}
				txtrYourOrderInfo.setText("You have ordered:"+base+" with topping:"+topping);
				
				
			
			}
				
		});
		JTextArea txtrHereListsYour = new JTextArea();
		txtrHereListsYour.setText("Here lists your options");
		
		JRadioButton rdbtnVegans = new JRadioButton("Vegans");
		
		JRadioButton rdbtnNonvegans = new JRadioButton("Non-vegans");
		if (rdbtnNonvegans.isSelected()){
		
		}
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(103)
							.addComponent(lblWelcomeToMost))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(chckbxChicken)
										.addComponent(chckbxChess))
									.addGap(119)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnVegans)
										.addComponent(rdbtnNonvegans)))
								.addComponent(chckbxOlive))
							.addGap(208)
							.addComponent(txtrHereListsYour, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(rdbtnThinBase)
								.addComponent(rdbtnNewRadioButton))))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(54)
					.addComponent(txtrYourOrderInfo, GroupLayout.PREFERRED_SIZE, 341, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED, 317, Short.MAX_VALUE)
					.addComponent(btnOrderFinished)
					.addGap(61))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblWelcomeToMost)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnThinBase)
							.addGap(9)
							.addComponent(rdbtnNewRadioButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxChicken)
								.addComponent(rdbtnVegans))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(chckbxChess)
								.addComponent(rdbtnNonvegans))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(chckbxOlive))
						.addComponent(txtrHereListsYour, GroupLayout.PREFERRED_SIZE, 403, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(txtrYourOrderInfo, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnOrderFinished))
					.addGap(27))
		);
		contentPane.setLayout(gl_contentPane);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
