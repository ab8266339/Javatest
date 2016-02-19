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
		setBounds(100, 100, 450, 300);
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
		txtrYourOrderInfo.setText("Your order info");
		btnOrderFinished.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnOrderFinished.setText("Thanks for your order");
				String base = null;
				String topping = null;
				if (rdbtnThinBase.isSelected()) {
					base = "Thin Base";
				}
				if (rdbtnNewRadioButton.isSelected()) {
					base = "Deep Pan";
				}
				if (chckbxChess.isSelected()){
					topping = "chicken";
				}
				txtrYourOrderInfo.setText("You have ordered:"+base+"with topping"+topping);
			}
		});
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxChicken)
							.addPreferredGap(ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
							.addComponent(rdbtnThinBase))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxChess)
							.addPreferredGap(ComponentPlacement.RELATED, 244, Short.MAX_VALUE)
							.addComponent(rdbtnNewRadioButton))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(103)
							.addComponent(lblWelcomeToMost))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(160, Short.MAX_VALUE)
							.addComponent(btnOrderFinished)
							.addGap(31)
							.addComponent(txtrYourOrderInfo, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(chckbxOlive)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblWelcomeToMost)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnThinBase)
						.addComponent(chckbxChicken))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtnNewRadioButton)
						.addComponent(chckbxChess))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(chckbxOlive)
							.addPreferredGap(ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
							.addComponent(btnOrderFinished))
						.addComponent(txtrYourOrderInfo, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
					.addContainerGap())
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
