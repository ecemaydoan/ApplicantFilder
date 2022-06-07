import java.awt.EventQueue;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.TextArea;

import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class mainWindow extends javax.swing.JFrame {

	private JPanel contentPane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mainWindow frame = new mainWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
		static int totalScore = 0;

	public mainWindow() {
		setTitle("Select Property");
		setDefaultCloseOperation(mainWindow.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 527);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUni = new JLabel("Do you want bachelor's degree?");
		lblUni.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUni.setBounds(10, 26, 414, 21);
		contentPane.add(lblUni);
		
		JLabel lblInt = new JLabel("Do you want intenship experience?");
		lblInt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblInt.setBounds(10, 58, 414, 21);
		contentPane.add(lblInt);
		
		JLabel lblJava = new JLabel("Do you want experience on Java?");
		lblJava.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblJava.setBounds(10, 90, 414, 21);
		contentPane.add(lblJava);
		
		JLabel lblWeb = new JLabel("Do you want experience on HTML and CSS?");
		lblWeb.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblWeb.setBounds(10, 122, 414, 21);
		contentPane.add(lblWeb);
		
		JLabel lblJS = new JLabel("Do you want experience on Vanilla JS?");
		lblJS.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblJS.setBounds(10, 154, 414, 21);
		contentPane.add(lblJS);
		
		JLabel lblRe = new JLabel("Do you want experience on React?");
		lblRe.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblRe.setBounds(10, 186, 414, 21);
		contentPane.add(lblRe);
		
		JLabel lblFl = new JLabel("Do you want experience on React native or flutter?");
		lblFl.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblFl.setBounds(10, 218, 414, 21);
		contentPane.add(lblFl);
		
		JLabel lblPyt = new JLabel("Do you want experience on Python?");
		lblPyt.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPyt.setBounds(10, 253, 414, 21);
		contentPane.add(lblPyt);
		
		JLabel lblPM = new JLabel("Do you want experience on Agile Project Management?");
		lblPM.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPM.setBounds(10, 285, 414, 21);
		contentPane.add(lblPM);
		
		JLabel lblVs = new JLabel("Do you want experience on Jira and VSCode?");
		lblVs.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblVs.setBounds(10, 317, 414, 21);
		contentPane.add(lblVs);
		
		JCheckBox chkBoxUni = new JCheckBox("");
		chkBoxUni.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chkBoxUni.isSelected()) {
					totalScore = totalScore+10;
				
					
				}
		}
		});
		chkBoxUni.setBounds(412, 26, 97, 23);
		contentPane.add(chkBoxUni);
		
		JCheckBox chkBoxInt = new JCheckBox("");
		chkBoxInt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chkBoxInt.isSelected()) {
					totalScore = totalScore+10;
					
					
					
				}

			}
		});
		chkBoxInt.setBounds(412, 54, 97, 23);
		contentPane.add(chkBoxInt);
		
		JCheckBox chkBoxJava = new JCheckBox("");
		chkBoxJava.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chkBoxJava.isSelected()) {
					totalScore = totalScore+10;
					
				}
				
			}
		});
		chkBoxJava.setBounds(412, 86, 97, 23);
		contentPane.add(chkBoxJava);
		
		JCheckBox chkBoxWeb = new JCheckBox("");
		chkBoxWeb.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chkBoxWeb.isSelected()) {
					totalScore = totalScore+10;
				}
            }
	});
		chkBoxWeb.setBounds(412, 118, 97, 23);
		contentPane.add(chkBoxWeb);
		
		JCheckBox chkBoxJs = new JCheckBox("");
		chkBoxJs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chkBoxJs.isSelected()) {
				totalScore = totalScore + 10;
				}
			}
		});
		chkBoxJs.setBounds(412, 150, 97, 23);
		contentPane.add(chkBoxJs);
		
		JCheckBox chkBoxRe = new JCheckBox("");
		chkBoxRe.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chkBoxRe.isSelected()) {
					totalScore = totalScore + 10;
				}
			}
	});
		chkBoxRe.setBounds(412, 182, 97, 23);
		contentPane.add(chkBoxRe);
		
		JCheckBox chkBoxFl = new JCheckBox("");
		chkBoxFl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chkBoxFl.isSelected()) {
					totalScore = totalScore+10;
				}
			}
        });
		chkBoxFl.setBounds(412, 214, 97, 23);
		contentPane.add(chkBoxFl);
		
		JCheckBox chkBoxPyt = new JCheckBox("");
		chkBoxPyt.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chkBoxPyt.isSelected()) {
					totalScore = totalScore + 10;
				
				}
			}
		});
		chkBoxPyt.setBounds(412, 246, 97, 23);
		contentPane.add(chkBoxPyt);
		
		JCheckBox chkBoxPM = new JCheckBox("");
		chkBoxPM.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chkBoxPM.isSelected()) {
					totalScore = totalScore + 10;
					
				
					}	
			}
		});
		chkBoxPM.setBounds(412, 281, 97, 23);
		contentPane.add(chkBoxPM);
		
		JCheckBox chkBoxVs = new JCheckBox("");
		chkBoxVs.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(chkBoxVs.isSelected()) {
					totalScore = totalScore + 10;
					
				}
			}
		});
		chkBoxVs.setBounds(412, 313, 97, 23);
		contentPane.add(chkBoxVs);
		
		JButton btnOk = new JButton("OK");
		btnOk.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new newWindow().setVisible(true);
			}
		});
		btnOk.setBackground(Color.GREEN);
		btnOk.setBounds(131, 400, 157, 66);
		contentPane.add(btnOk);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnCancel.setBackground(Color.RED);
		btnCancel.setBounds(367, 400, 157, 66);
		contentPane.add(btnCancel);
	}
	
	public static String scores() {
	    if (totalScore >= 0 && totalScore <= 33)
            return "Begüm has bachelor's degree.\n"
                    + "She has internship experience.\n"
                    + "She can implement Java.\n";

        if (totalScore >= 34 && totalScore <= 66)
            return "Ecem has bachelor's degree.\n"
                    + "She has internship experience.\n"
                    + "She can implement Java.\n"  
                    + "She has experience on HTML and CSS.\n"
                    + "She can implement JavaScript.\n"
                    + "She has experience on React.\n";

        if (totalScore >= 67 && totalScore <= 100)
            return "Alper has bachelor's degree.\n"
                    + "He has internship experience.\n"
                    + "He can implement Java.\n"
                    + "He has experience on HTML and CSS.\n"
                    + "He can implement JavaScript.\n"
                    + "He has experience on React Native and Flutter.\n"
                    + "He can implement Python.\n"
                    + "He has experience on Project Management.\n"
                    + "He has experience on using Jira and VSCode.";;

        return "Selected person's qualities are: ";

	}
	
	public static String applicantsName() {
		if(totalScore >= 0 && totalScore <= 33)
			return "APPLICANT'S NAME: Begüm Kaya";
		else if(totalScore >= 34 && totalScore <= 66)
			return "APPLICANT'S NAME: Ecem Aydoðan";
		else if(totalScore >= 67 && totalScore <= 100)
			return "APPLICANT'S NAME: Alper Kaan Mazinoðlu";
		return "APPLICANT'S NAME: ";
	}
	
	
		

}
