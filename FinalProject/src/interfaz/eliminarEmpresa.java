package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.border.BevelBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class eliminarEmpresa extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JPanel contentPane;
	private JTextField nombreEmpresa;
	private JButton btnNewButton;
	private JTable nombresEmpresas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eliminarEmpresa frame = new eliminarEmpresa();
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
	public eliminarEmpresa() {
		setTitle("Eliminar Empresa");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("Nombre de Empresa");
		lblNewJgoodiesLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewJgoodiesLabel.setBounds(10, 11, 138, 14);
		contentPane.add(lblNewJgoodiesLabel);
		
		nombreEmpresa = new JTextField();
		nombreEmpresa.setBounds(147, 10, 205, 20);
		contentPane.add(nombreEmpresa);
		nombreEmpresa.setColumns(10);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("");
		lblNewJgoodiesLabel_1.setIcon(new ImageIcon("D:\\Fotos\\a-iconos\\Alpha Dista Icon 15.ico"));
		lblNewJgoodiesLabel_1.setBounds(362, 11, 56, 42);
		contentPane.add(lblNewJgoodiesLabel_1);
		
		btnNewButton = new JButton("Buscar");
		btnNewButton.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		btnNewButton.setBounds(362, 11, 69, 42);
		contentPane.add(btnNewButton);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBounds(26, 73, 392, 115);
		contentPane.add(panel);
		
		nombresEmpresas = new JTable();
		nombresEmpresas.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nombre Empresa"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		nombresEmpresas.getColumnModel().getColumn(0).setPreferredWidth(118);
		panel.add(nombresEmpresas);
		
		JButton btnNewButton_1 = new JButton("Eliminar");
		btnNewButton_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		btnNewButton_1.setBounds(173, 211, 89, 39);
		contentPane.add(btnNewButton_1);
	}
}
