package moduleEspanha;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.Path;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

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
	private JTextField tf_getPlayer;
	private JTextField tf_tcm_nickname;
	private JTextField tf_tcm_role;
	private JTextField tf_tcm_birthdate;
	private JTextField tf_tcm_name;
	private JTextField tf_tcm_remove;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
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
		
		JLabel lblRegisterTechnicalComittee = new JLabel("Register Technical Comittee Member");
		lblRegisterTechnicalComittee.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRegisterTechnicalComittee.setBounds(10, 20, 316, 33);
		panel_1.add(lblRegisterTechnicalComittee);
		
		JLabel lblNewLabel_1_1_3 = new JLabel("Nickname:");
		lblNewLabel_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_3.setBounds(10, 88, 74, 13);
		panel_1.add(lblNewLabel_1_1_3);
		
		tf_tcm_nickname = new JTextField();
		tf_tcm_nickname.setColumns(10);
		tf_tcm_nickname.setBounds(82, 86, 176, 19);
		panel_1.add(tf_tcm_nickname);
		
		JLabel lblNewLabel_1_1_3_1 = new JLabel("Role:");
		lblNewLabel_1_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_3_1.setBounds(10, 122, 74, 13);
		panel_1.add(lblNewLabel_1_1_3_1);
		
		tf_tcm_role = new JTextField();
		tf_tcm_role.setColumns(10);
		tf_tcm_role.setBounds(47, 120, 176, 19);
		panel_1.add(tf_tcm_role);
		
		JLabel lblNewLabel_1_1_1_1_1_1_3 = new JLabel("BirthDate:");
		lblNewLabel_1_1_1_1_1_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1_3.setBounds(10, 158, 74, 18);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_3);
		
		tf_tcm_birthdate = new JTextField();
		tf_tcm_birthdate.setColumns(10);
		tf_tcm_birthdate.setBounds(82, 159, 176, 19);
		panel_1.add(tf_tcm_birthdate);
		
		JLabel lblNewLabel_1_1_1_1_1_1_1_1 = new JLabel("yyyy-mm-dd");
		lblNewLabel_1_1_1_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1_1_1_1_1_1_1.setBounds(268, 159, 101, 18);
		panel_1.add(lblNewLabel_1_1_1_1_1_1_1_1);
		
		JButton btnCadastrarTCMember = new JButton("Register");
		btnCadastrarTCMember.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					espanha.addTCMember(tf_tcm_name.getText(),
							tf_tcm_nickname.getText(), 
							tf_tcm_role.getText(), 
							LocalDate.parse(tf_tcm_birthdate.getText()));
					JOptionPane.showMessageDialog(null, " added TCMember successfully");
				} catch (IllegalArgumentException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
			}
		});
		btnCadastrarTCMember.setBounds(190, 189, 85, 21);
		panel_1.add(btnCadastrarTCMember);
		
		JButton btnRemoveTCM = new JButton("Remove");
		btnRemoveTCM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					espanha.removeTCMember(tf_tcm_remove.getText());
					JOptionPane.showMessageDialog(null, "removed TCMember successfully");
				} catch ( IllegalArgumentException ex) {
					JOptionPane.showMessageDialog(null, ex.getMessage());
				}
				
			}
		});
		btnRemoveTCM.setBounds(148, 364, 85, 21);
		panel_1.add(btnRemoveTCM);
		
		JLabel lblNewLabel_1_1_3_2 = new JLabel("Name:");
		lblNewLabel_1_1_3_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_3_2.setBounds(10, 64, 74, 13);
		panel_1.add(lblNewLabel_1_1_3_2);
		
		tf_tcm_name = new JTextField();
		tf_tcm_name.setColumns(10);
		tf_tcm_name.setBounds(82, 62, 176, 19);
		panel_1.add(tf_tcm_name);
		
		JLabel lblRemoveTcmember = new JLabel("Remove TCMember");
		lblRemoveTcmember.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRemoveTcmember.setBounds(10, 302, 248, 33);
		panel_1.add(lblRemoveTcmember);
		
	
		
		tf_tcm_remove = new JTextField();
		tf_tcm_remove.setColumns(10);
		tf_tcm_remove.setBounds(57, 334, 176, 19);
		panel_1.add(tf_tcm_remove);
		
		JLabel lblNewLabel_1_1_3_2_1 = new JLabel("Name:");
		lblNewLabel_1_1_3_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_3_2_1.setBounds(10, 336, 74, 13);
		panel_1.add(lblNewLabel_1_1_3_2_1);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("PressOfficer", null, panel_2, null);
		panel_2.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(0, -1, 383, 406);
		panel_2.add(panel_1_1);
		
		JLabel lblRegister = new JLabel("Register Team Manager");
		lblRegister.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRegister.setBounds(10, 20, 316, 33);
		panel_1_1.add(lblRegister);
		
		JLabel lblNewLabel_1_1_3_3 = new JLabel("Cellphone 1:");
		lblNewLabel_1_1_3_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_3_3.setBounds(10, 88, 79, 13);
		panel_1_1.add(lblNewLabel_1_1_3_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(92, 86, 176, 19);
		panel_1_1.add(textField);
		
		JLabel lblNewLabel_1_1_3_1_1 = new JLabel("Cellphone 2:");
		lblNewLabel_1_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_3_1_1.setBounds(10, 112, 79, 13);
		panel_1_1.add(lblNewLabel_1_1_3_1_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(92, 110, 176, 19);
		panel_1_1.add(textField_1);
		
		JLabel lblNewLabel_1_1_1_1_1_1_3_1 = new JLabel("Email:");
		lblNewLabel_1_1_1_1_1_1_3_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1_3_1.setBounds(10, 136, 93, 18);
		panel_1_1.add(lblNewLabel_1_1_1_1_1_1_3_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(92, 137, 176, 19);
		panel_1_1.add(textField_2);
		
		JButton btnCadastrarTCMember_1 = new JButton("Register");
		btnCadastrarTCMember_1.setBounds(190, 189, 85, 21);
		panel_1_1.add(btnCadastrarTCMember_1);
		
		JButton btnRemoveTCM_1 = new JButton("Remove");
		btnRemoveTCM_1.setBounds(148, 364, 85, 21);
		panel_1_1.add(btnRemoveTCM_1);
		
		JLabel lblNewLabel_1_1_3_2_2 = new JLabel("Name:");
		lblNewLabel_1_1_3_2_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_3_2_2.setBounds(10, 64, 74, 13);
		panel_1_1.add(lblNewLabel_1_1_3_2_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(92, 56, 176, 19);
		panel_1_1.add(textField_3);
		
		JLabel lblRemoveTcmember_1 = new JLabel("Remove Team Manager");
		lblRemoveTcmember_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRemoveTcmember_1.setBounds(10, 302, 248, 33);
		panel_1_1.add(lblRemoveTcmember_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(57, 334, 176, 19);
		panel_1_1.add(textField_4);
		
		JLabel lblNewLabel_1_1_3_2_1_1 = new JLabel("Name:");
		lblNewLabel_1_1_3_2_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_3_2_1_1.setBounds(10, 336, 74, 13);
		panel_1_1.add(lblNewLabel_1_1_3_2_1_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(92, 166, 176, 20);
		panel_1_1.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNewLabel_1_1_1_1_1_1_3_1_1 = new JLabel("Press Officer:");
		lblNewLabel_1_1_1_1_1_1_3_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1_1_3_1_1.setBounds(10, 165, 93, 18);
		panel_1_1.add(lblNewLabel_1_1_1_1_1_1_3_1_1);
		
		JButton btn_Many_Members = new JButton(" Many Members");
		btn_Many_Members.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, espanha.getHowManyMembers());
			}
		});
		btn_Many_Members.setBounds(444, 10, 154, 32);
		frame.getContentPane().add(btn_Many_Members);
		
		JButton btn_Oldes_Player = new JButton("Oldest Player");
		btn_Oldes_Player.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, espanha.getOldestPlayer());
			}
		});
		btn_Oldes_Player.setBounds(444, 52, 154, 32);
		frame.getContentPane().add(btn_Oldes_Player);
		
		JButton btn_Youngest_Player = new JButton("Youngest Player");
		btn_Youngest_Player.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, espanha.getYoungestPlayer());
			}
		});
		btn_Youngest_Player.setBounds(444, 89, 154, 32);
		frame.getContentPane().add(btn_Youngest_Player);
		
		JButton btn_player_GetPlayer = new JButton("Get Player");
		btn_player_GetPlayer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					JOptionPane.showMessageDialog(null, espanha.getPlayer(Integer.parseInt(tf_getPlayer.getText())));
				} catch (HeadlessException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IllegalArgumentException ex ) {
					JOptionPane.showMessageDialog(null, "Invalid Number");
				}
				
			}
		});
		btn_player_GetPlayer.setBounds(429, 205, 94, 26);
		frame.getContentPane().add(btn_player_GetPlayer);
		
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
		
		JButton btn_Many_Members_1_1_2 = new JButton("Flag Image");
		btn_Many_Members_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Image im = espanha.getFlagImage();
				ImageIcon ima = new ImageIcon(im);
				JOptionPane.showMessageDialog(null, ima );
			}
		});
		btn_Many_Members_1_1_2.setBounds(444, 340, 154, 32);
		frame.getContentPane().add(btn_Many_Members_1_1_2);
		
		JButton btn_Many_Members_1_2 = new JButton(" Country Name");
		btn_Many_Members_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(null, espanha.getCountryName());
			}
		});
		btn_Many_Members_1_2.setBounds(444, 298, 154, 32);
		frame.getContentPane().add(btn_Many_Members_1_2);
		
		JButton btn_Many_Members_2 = new JButton(" Many Members");
		btn_Many_Members_2.setBounds(444, 256, 154, 32);
		frame.getContentPane().add(btn_Many_Members_2);
		
		tf_getPlayer = new JTextField();
		tf_getPlayer.setBounds(533, 206, 55, 26);
		frame.getContentPane().add(tf_getPlayer);
		tf_getPlayer.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Player Number");
		lblNewLabel_2.setBounds(524, 233, 94, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		JButton btn_player_averageAge = new JButton("Avarage Age");
		btn_player_averageAge.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, espanha.getAverageAge());
			}
		});
		btn_player_averageAge.setBounds(444, 126, 154, 32);
		frame.getContentPane().add(btn_player_averageAge);
		
		JButton btn_getTechnicalCommittee = new JButton("Get Technical Committee");
		btn_getTechnicalCommittee.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Path p =espanha.getTechnicalCommittee();
				JOptionPane.showMessageDialog(null, p.toString());
			}
		});
		btn_getTechnicalCommittee.setBounds(444, 163, 154, 32);
		frame.getContentPane().add(btn_getTechnicalCommittee);
		
		
	}
}
