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
import java.awt.TextArea;
import java.awt.Button;

public class eliminarOferta extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JPanel contentPane;
	private JTextField idOferta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					eliminarOferta frame = new eliminarOferta();
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
	public eliminarOferta() {
		setTitle("Eliminar Ofertas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 299);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		idOferta = new JTextField();
		idOferta.addKeyListener(new KeyAdapter(){
			@Override
			public void keyTyped(KeyEvent e){
				char c = e.getKeyChar();
				if(c>='0' && c <= '9' && idOferta.getText().length() < 6){
					
				}
				else{
					JOptionPane.showMessageDialog(null, "El ID no puede ser mayor a 6 cifras o poseer valores negativos ");
				}
			}
		});
		idOferta.setBounds(132, 14, 164, 20);
		contentPane.add(idOferta);
		idOferta.setColumns(10);
		
		JButton search = new JButton("Busar");
		search.setToolTipText("");
		search.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		search.setBounds(318, 14, 71, 39);
		contentPane.add(search);
		
		TextArea textArea = new TextArea();
		textArea.setEditable(false);
		textArea.setEnabled(false);
		textArea.setBounds(22, 67, 380, 125);
		contentPane.add(textArea);
		
		Button delete = new Button("Eliminar");	
		delete.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		delete.setBounds(185, 211, 70, 39);
		contentPane.add(delete);
		
		JLabel lblNewJgoodiesTitle = DefaultComponentFactory.getInstance().createTitle("ID de Oferta");
		lblNewJgoodiesTitle.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewJgoodiesTitle.setBounds(33, 15, 89, 14);
		contentPane.add(lblNewJgoodiesTitle);
	}
}
