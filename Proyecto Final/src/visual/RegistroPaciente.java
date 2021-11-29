package visual;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Toolkit;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;

public class RegistroPaciente extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			RegistroPaciente dialog = new RegistroPaciente();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public RegistroPaciente() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\HP\\Desktop\\2695.png"));
		setTitle("Registro de Paciente");
		setBounds(100, 100, 458, 451);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Registro de Paciente", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBackground(new Color(224, 255, 255));
		panel.setBounds(0, 0, 442, 374);
		contentPanel.add(panel);
		panel.setLayout(null);
		
		JLabel lblNombre = new JLabel("Cedula:");
		lblNombre.setBounds(10, 42, 72, 14);
		panel.add(lblNombre);
		{
			JLabel lblNewLabel = new JLabel("Nombre:");
			lblNewLabel.setBounds(10, 98, 72, 14);
			panel.add(lblNewLabel);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Fecha de Nacimiento:");
			lblNewLabel_1.setBounds(10, 154, 126, 14);
			panel.add(lblNewLabel_1);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Direccion: ");
			lblNewLabel_2.setBounds(10, 266, 72, 14);
			panel.add(lblNewLabel_2);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("Genero:");
			lblNewLabel_3.setBounds(10, 210, 72, 14);
			panel.add(lblNewLabel_3);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Telefono:");
			lblNewLabel_4.setBounds(10, 322, 72, 14);
			panel.add(lblNewLabel_4);
		}
		
		textField = new JTextField();
		textField.setBounds(146, 39, 197, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(146, 95, 197, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(146, 151, 197, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(146, 263, 197, 20);
		panel.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(146, 319, 197, 20);
		panel.add(textField_5);
		textField_5.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"<Seleccione>", "Femenino", "Masculino"}));
		comboBox.setBounds(146, 207, 197, 20);
		panel.add(comboBox);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("Registrar");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancelar");
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
