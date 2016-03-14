import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JTextField;

public class gui extends JFrame {

	private JPanel contentPane;
	private JTextField txtYourToppings;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					gui frame = new gui();
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
	public gui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		JCheckBox chckbxDeepPan = new JCheckBox("Deep pan");
		chckbxDeepPan.setBounds(5, 34, 71, 23);
		contentPane.add(chckbxDeepPan);
		
		JCheckBox chckbxThinBase = new JCheckBox("Thin base");
		chckbxThinBase.setBounds(0, 66, 97, 23);
		contentPane.add(chckbxThinBase);
		
		JCheckBox chckbxCalzone = new JCheckBox("calzone");
		chckbxCalzone.setBounds(5, 92, 97, 23);
		contentPane.add(chckbxCalzone);
		txtYourToppings = new JTextField();
		txtYourToppings.setText("Your toppings:");
		txtYourToppings.setBounds(161, 137, 228, 85);
		contentPane.add(txtYourToppings);
		txtYourToppings.setColumns(10);
		JCheckBox chckbxChess = new JCheckBox("chess");
		chckbxChess.setBounds(172, 7, 97, 23);
		contentPane.add(chckbxChess);
		
		JCheckBox chckbxChicken = new JCheckBox("chicken");
		chckbxChicken.setBounds(172, 34, 97, 23);
		contentPane.add(chckbxChicken);
		
		JButton btnAButton = new JButton("A button");
		btnAButton.setBounds(5, 233, 424, 23);
		
		
		
		btnAButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//lblThisIsText.setText("Thanks");
				String base =null;
				String toppings = null;
				if (chckbxCalzone.isSelected()){
					base = "calzone";
				}else if(chckbxDeepPan.isSelected()){
					base = "deep";
				}else{
					base = "thin";
				}
				btnAButton.setText("Thanks for your ordering "+base+" base pizza");
				txtYourToppings.setText("you chose "+toppings);
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnAButton);
		
		
		
		
		
		
	}
}
