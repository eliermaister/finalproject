package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.TextArea;
import javax.swing.JTable;

public class reportes extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					reportes frame = new reportes();
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
	public reportes() {
		setTitle("Reportes");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TextArea textArea = new TextArea();
		textArea.setBounds(10, 10, 414, 241);
		contentPane.add(textArea);
		
		table = new JTable();
		table.setBounds(23, 42, 363, 172);
		contentPane.add(table);
	}
}
