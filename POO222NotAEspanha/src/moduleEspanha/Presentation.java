package moduleEspanha;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class Presentation {

	private JFrame frame;
	private JTextField tf_player_name;
	private JTextField tf_player_nickname;
	private JTextField tf_player_number;
	private JTextField tf_player_heigth;
	private JTextField tf_player_weigth;
	private JTextField tf_player_birthdate;
	private JTextField tf_player_currentClub;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Presentation window = new Presentation();
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
	public Presentation() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 653, 538);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(31, 35, 388, 434);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("Players", null, panel, null);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Register Player");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(14, 39, 151, 33);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(20, 82, 50, 13);
		panel.add(lblNewLabel_1);
		
		tf_player_name = new JTextField();
		tf_player_name.setBounds(75, 81, 205, 19);
		panel.add(tf_player_name);
		tf_player_name.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nickname:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(20, 106, 74, 13);
		panel.add(lblNewLabel_1_1);
		
		tf_player_nickname = new JTextField();
		tf_player_nickname.setColumns(10);
		tf_player_nickname.setBounds(104, 105, 176, 19);
		panel.add(tf_player_nickname);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Number:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(20, 130, 74, 13);
		panel.add(lblNewLabel_1_1_1);
		
		tf_player_number = new JTextField();
		tf_player_number.setColumns(10);
		tf_player_number.setBounds(104, 129, 61, 19);
		panel.add(tf_player_number);
		
		tf_player_heigth = new JTextField();
		tf_player_heigth.setColumns(10);
		tf_player_heigth.setBounds(104, 165, 61, 19);
		panel.add(tf_player_heigth);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Heigth:");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(20, 166, 74, 18);
		panel.add(lblNewLabel_1_1_1_1);
		
		tf_player_weigth = new JTextField();
		tf_player_weigth.setColumns(10);
		tf_player_weigth.setBounds(104, 188, 61, 19);
		panel.add(tf_player_weigth);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Weigth:");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(20, 189, 74, 18);
		panel.add(lblNewLabel_1_1_1_1_1);
		
		tf_player_birthdate = new JTextField();
		tf_player_birthdate.setColumns(10);
		tf_player_birthdate.setBounds(104, 217, 96, 19);
		panel.add(tf_player_birthdate);
		
		JLabel lblNewLabel_1_1_1_1_1_1 = new JLabel("BirthDate:");
		lblNewLabel_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1.setBounds(20, 218, 74, 18);
		panel.add(lblNewLabel_1_1_1_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("yyyy/mm/dd");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(210, 216, 101, 18);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(104, 246, 29, 21);
		panel.add(comboBox);
		
		JLabel lblNewLabel_1_1_1_1_1_1_2 = new JLabel("Position:");
		lblNewLabel_1_1_1_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1_2.setBounds(20, 246, 74, 18);
		panel.add(lblNewLabel_1_1_1_1_1_1_2);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Current Club:");
		lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_2.setBounds(20, 286, 113, 13);
		panel.add(lblNewLabel_1_1_2);
		
		tf_player_currentClub = new JTextField();
		tf_player_currentClub.setColumns(10);
		tf_player_currentClub.setBounds(114, 285, 176, 19);
		panel.add(tf_player_currentClub);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("New tab", null, panel_1, null);
	}
}
