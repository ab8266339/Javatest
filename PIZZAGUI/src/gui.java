import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.EnumSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import java.lang.Enum;

public class gui extends JFrame {

	private JPanel contentPane;
	private JTextField txtYourToppings;
	private final ButtonGroup buttonGroup = new ButtonGroup();

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
		JRadioButton jbuttonDeepPan = new JRadioButton("Deep pan");
		buttonGroup.add(jbuttonDeepPan);
		jbuttonDeepPan.setBounds(5, 34, 71, 23);
		contentPane.add(jbuttonDeepPan);
		
		JRadioButton jbuttonThinBase = new JRadioButton("Thin base");
		buttonGroup.add(jbuttonThinBase);
		jbuttonThinBase.setBounds(5, 60, 97, 23);
		contentPane.add(jbuttonThinBase);
		
		JRadioButton jbuttonCalzone = new JRadioButton("calzone");
		buttonGroup.add(jbuttonCalzone);
		jbuttonCalzone.setBounds(5, 86, 97, 23);
		contentPane.add(jbuttonCalzone);
		txtYourToppings = new JTextField();
		txtYourToppings.setText("Your toppings:");
		txtYourToppings.setBounds(161, 137, 228, 85);
		contentPane.add(txtYourToppings);
		txtYourToppings.setColumns(10);
		
		JButton btnAButton = new JButton("A button");
		btnAButton.setBounds(5, 233, 424, 23);
		JCheckBox chckbxChicken = new JCheckBox("Chicken");
		chckbxChicken.setBounds(110, 7, 97, 23);
		contentPane.add(chckbxChicken);
		
		JCheckBox chckbxMilk = new JCheckBox("Cheese");
		chckbxMilk.setBounds(110, 34, 97, 23);
		contentPane.add(chckbxMilk);
		
		JCheckBox chckbxSausage = new JCheckBox("Sausage");
		chckbxSausage.setBounds(110, 60, 97, 23);
		contentPane.add(chckbxSausage);
		
		JCheckBox chckbxTomato = new JCheckBox("Tomato");
		chckbxTomato.setBounds(110, 86, 97, 23);
		contentPane.add(chckbxTomato);
		
		EnumSet<PizzaTopping> toppings = EnumSet.noneOf(PizzaTopping.class);
		
		btnAButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//lblThisIsText.setText("Thanks");
				String base =null;
				//String toppings = null;
				if (jbuttonCalzone.isSelected()){
					base = "calzone";
				}else if(jbuttonDeepPan.isSelected()){
					base = "deep";
				}else{
					base = "thin";
				}
				if (chckbxChicken.isSelected()){
					toppings.add(PizzaTopping.CHICKEN);
				}
				btnAButton.setText("Thanks for your ordering "+base+" base pizza");
				txtYourToppings.setText("you chose " + toppings.toString());
				
				
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnAButton);
		

		
		
		
		
		
	}
}
