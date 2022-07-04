package interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import java.awt.Font;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;




import java.awt.Button;
import java.awt.TextArea;

public class crearCitas extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private JPanel contentPane;
	private JTextField fullname;
	private JTextField idPuesto;
	private JTextField dia;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					crearCitas frame = new crearCitas();
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
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public crearCitas() {
		setTitle("Crear Citas");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCrearCitaPara = DefaultComponentFactory.getInstance().createLabel("Crear Cita Para:");
		lblCrearCitaPara.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblCrearCitaPara.setBounds(10, 11, 103, 14);
		contentPane.add(lblCrearCitaPara);
		
		fullname = new JTextField();
		fullname.setEditable(false);
		fullname.setEnabled(false);
		fullname.setBounds(123, 10, 258, 20);
		contentPane.add(fullname);
		fullname.setColumns(10);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("ID del puesto:");
		lblNewJgoodiesLabel.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewJgoodiesLabel.setBounds(10, 74, 103, 14);
		contentPane.add(lblNewJgoodiesLabel);
		
		idPuesto = new JTextField();
		idPuesto.setBounds(122, 73, 103, 20);
		contentPane.add(idPuesto);
		idPuesto.setColumns(10);
		
		JLabel lblNewJgoodiesLabel_1 = DefaultComponentFactory.getInstance().createLabel("Fecha:");
		lblNewJgoodiesLabel_1.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewJgoodiesLabel_1.setBounds(58, 119, 44, 14);
		contentPane.add(lblNewJgoodiesLabel_1);
		
		JLabel lblDia = DefaultComponentFactory.getInstance().createLabel("Dia");
		lblDia.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblDia.setBounds(10, 144, 44, 14);
		contentPane.add(lblDia);
		
		dia = new JTextField();
		dia.setBounds(37, 144, 36, 20);
		contentPane.add(dia);
		dia.setColumns(10);
		
		JLabel lblNewJgoodiesLabel_2 = DefaultComponentFactory.getInstance().createLabel("Mes");
		lblNewJgoodiesLabel_2.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblNewJgoodiesLabel_2.setBounds(97, 146, 27, 14);
		contentPane.add(lblNewJgoodiesLabel_2);
		
		JComboBox escolaridad = new JComboBox();
		escolaridad.setModel(new DefaultComboBoxModel(new String[] {"Select","Enero", "Febrero", "Marzo", "Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"}));
		escolaridad.setMaximumRowCount(4);
		escolaridad.setFont(new Font("Tahoma", Font.PLAIN, 14));
		escolaridad.setBounds(134, 137, 103, 28);
		contentPane.add(escolaridad);
		
		Button asignar = new Button("Asignar");
		asignar.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		asignar.setBounds(272, 142, 70, 22);
		contentPane.add(asignar);
		
		TextArea Citas = new TextArea();
		Citas.setEnabled(false);
		Citas.setEditable(false);
		Citas.setBounds(23, 170, 401, 160);
		contentPane.add(Citas);
		
		Button save = new Button("Guardar");
		save.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		save.setBounds(195, 328, 70, 22);
		contentPane.add(save);
		
	
	}
}
