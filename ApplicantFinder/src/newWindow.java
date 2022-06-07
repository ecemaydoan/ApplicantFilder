
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class newWindow extends JFrame {
    
	private JPanel contentPane;
	private JTextField txtApplicantsName;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					newWindow frame = new newWindow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	static BinaryTree bt = new BinaryTree();
	
	

	public newWindow() {
		setTitle("Hire or Cancel");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 594, 475);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtApplicantsName = new JTextField();
		txtApplicantsName.setFont(new Font("Tahoma", Font.BOLD, 15));
    	txtApplicantsName.setText(mainWindow.applicantsName());
		txtApplicantsName.setBounds(21, 23, 532, 65);
		contentPane.add(txtApplicantsName);
		txtApplicantsName.setColumns(10);

		JTextArea textArea = new JTextArea();
		textArea.setBounds(21, 113, 532, 216);
		contentPane.add(textArea);
		textArea.setText(mainWindow.scores());
		
		JButton btnHire = new JButton("HIRE");
		btnHire.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent Person) {
			textArea.setText("Congratulations, you hired an employee");
			}
		});
		btnHire.setBackground(Color.GREEN);
		btnHire.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnHire.setBounds(21, 382, 142, 43);
		contentPane.add(btnHire);
		
		JButton btnCancel = new JButton("CANCEL");
		btnCancel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent Person) {
				System.exit(0);
			}		
			});
		btnCancel.setBackground(Color.RED);
		btnCancel.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnCancel.setBounds(411, 381, 142, 44);
		contentPane.add(btnCancel);
		
		JButton btnNext = new JButton("NEXT");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				textArea.setText(createBinaryTree());
		        txtApplicantsName.setText(null);
		 
		  if(TreeNode.getValue() >= 0 && TreeNode.getValue()<=33)
			  txtApplicantsName.setText("APPLICANT'S NAME: Begüm Kaya");
		  else  if(TreeNode.getValue()>= 34 && TreeNode.getValue()<=66)
			  txtApplicantsName.setText("APPLICANT'S NAME: Ecem Aydoðan");
		  else if(TreeNode.getValue()>= 67 && TreeNode.getValue() <= 100)
			  txtApplicantsName.setText("APPLICANT'S NAME: Alper Kaan Mazinoðlu");
		    
		  
			}
		});
		btnNext.setBackground(Color.BLUE);
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnNext.setBounds(212, 383, 147, 43);
		contentPane.add(btnNext);
	}	


	public static String createBinaryTree() {
	  
	    ArrayList <Person> PersonArr = new ArrayList<Person>();
	 	Person p1=new Person("Begüm Kaya",33);
		Person p2=new Person("Ecem Aydoðan",66);
		Person p3=new Person("Alper Kaan Mazinoðlu",99);
 
	    PersonArr.add(p1);
	    PersonArr.add(p2);
	    PersonArr.add(p3);
        
	     
	    for(Person p: PersonArr) {
	    	 bt.insert(p.getAveragescore());
	  } 
	 
	    bt.inOrderWithoutRecursion();
	    
	      return BinaryTree.print();
	    }
	
	 
}
