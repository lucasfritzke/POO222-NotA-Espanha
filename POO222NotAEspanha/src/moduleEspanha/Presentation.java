package moduleEspanha;

import java.awt.EventQueue;
import java.awt.Font;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.JButton;

public class Presentation {

	private JFrame frame;
	private JTextField tf_player_name;
	private JTextField tf_player_nickname;
	private JTextField tf_player_number;
	private JTextField tf_player_heigth;
	private JTextField tf_player_weigth;
	private JTextField tf_player_birthdate;
	private JTextField tf_player_currentClub;
	private SimpleDateFormat dt = new SimpleDateFormat("yyyyy-mm-dd");
	private JTextField tf_player_number_remove;
	private Espanha espanha = new Espanha();
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
		
		JLabel lblNewLabel_1_1_1_1_1_1_1 = new JLabel("yyyy-mm-dd");
		lblNewLabel_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1.setBounds(210, 216, 101, 18);
		panel.add(lblNewLabel_1_1_1_1_1_1_1);
		
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
		
		JComboBox<String> cbPositions = new JComboBox<String>();
		ArrayList<String> listaPositions = espanha.getPositionsList();
		for (String s : listaPositions) {
			cbPositions.addItem(s);
		}
		cbPositions.setBounds(90, 247, 110, 21);
		panel.add(cbPositions);
		
		JButton btnCadastrarPlayer = new JButton("Register");
		btnCadastrarPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					espanha.addPlayer(
							tf_player_name.getText(), 
							tf_player_number.getText(),
							tf_player_nickname.getText(),
							Double.parseDouble(tf_player_heigth.getText()), 
							Double.parseDouble(tf_player_weigth.getText()), 
							LocalDate.parse(tf_player_birthdate.getText()), 
							(String)cbPositions.getSelectedItem(), 
							tf_player_currentClub.getText());
					JOptionPane.showMessageDialog(null, "player added successfully");
				} catch (IllegalArgumentException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
			}
		});
		btnCadastrarPlayer.setBounds(14, 321, 96, 21);
		panel.add(btnCadastrarPlayer);
		
		JLabel lblRemovePlayer = new JLabel("Remove Player");
		lblRemovePlayer.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRemovePlayer.setBounds(14, 352, 151, 33);
		panel.add(lblRemovePlayer);
		
		JLabel lblNewLabel_1_1_1_2 = new JLabel("Number:");
		lblNewLabel_1_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_2.setBounds(14, 379, 74, 13);
		panel.add(lblNewLabel_1_1_1_2);
		
		tf_player_number_remove = new JTextField();
		tf_player_number_remove.setColumns(10);
		tf_player_number_remove.setBounds(98, 378, 61, 19);
		panel.add(tf_player_number_remove);
		
		JButton btnNewButton = new JButton("Remove");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					espanha.removePlayer(tf_player_number_remove.getText());
					
				} catch ( IllegalArgumentException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
				
			}
		});
		btnNewButton.setBounds(169, 377, 85, 21);
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("TechnicalCommitteeMember", null, panel_1, null);
		panel_1.setLayout(null);
		
		JTabbedPane tabbedPane_1 = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.addTab("PressOfficer", null, tabbedPane_1, null);
		
		JButton btn_Many_Members = new JButton(" Many Members");
		btn_Many_Members.setBounds(444, 68, 154, 32);
		frame.getContentPane().add(btn_Many_Members);
		
		JButton btn_Oldes_Player = new JButton("Oldest Player");
		btn_Oldes_Player.setBounds(444, 110, 154, 32);
		frame.getContentPane().add(btn_Oldes_Player);
		
		JButton btn_Youngest_Player = new JButton("Youngest Player");
		btn_Youngest_Player.setBounds(444, 156, 154, 32);
		frame.getContentPane().add(btn_Youngest_Player);
		
		JButton btn_Many_Members_1_1_1 = new JButton(" Many Members");
		btn_Many_Members_1_1_1.setBounds(444, 200, 154, 32);
		frame.getContentPane().add(btn_Many_Members_1_1_1);
		
		JButton btn_Save = new JButton("Save");
		btn_Save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				espanha.salvar();
				JOptionPane.showMessageDialog(null, 
						"successfully saved changes");
			}
		});
		btn_Save.setBounds(444, 437, 154, 32);
		frame.getContentPane().add(btn_Save);
		
		JButton btn_Many_Members_1_1_2 = new JButton(" Many Members");
		btn_Many_Members_1_1_2.setBounds(444, 330, 154, 32);
		frame.getContentPane().add(btn_Many_Members_1_1_2);
		
		JButton btn_Many_Members_1_2 = new JButton(" Many Members");
		btn_Many_Members_1_2.setBounds(444, 284, 154, 32);
		frame.getContentPane().add(btn_Many_Members_1_2);
		
		JButton btn_Many_Members_2 = new JButton(" Many Members");
		btn_Many_Members_2.setBounds(444, 242, 154, 32);
		frame.getContentPane().add(btn_Many_Members_2);
		
		
	}

	@Override
	protected void finalize() throws Throwable {
		espanha.salvar();
		JOptionPane.showMessageDialog(null, "Dados Salvos com sucesso");
		super.finalize();
	}

}
