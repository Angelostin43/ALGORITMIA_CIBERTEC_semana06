package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Problema_6_2 extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;

	private JPanel contentPane;
	private JLabel lblNota;
	private JTextField txtNota;
	private JButton btnAdicionar;
	private JButton btnEliminarAlFinal;
	private JButton btnEliminarTodo;
	private JButton btnDecrementarUltimaNotaDesaprobatoria;
	private JButton btnRemplazarUltimaNotaDesaprobatoria;
	private JTextArea txtS;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Problema_6_2 frame = new Problema_6_2();
					frame.setVisible(true);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Problema_6_2() {
		setTitle("Problema_6_2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 574, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtNota = new JTextField();
		txtNota.setBounds(66, 10, 86, 23);
		contentPane.add(txtNota);
		txtNota.setColumns(10);

		lblNota = new JLabel("Nota");
		lblNota.setBounds(10, 10, 46, 23);
		contentPane.add(lblNota);

		btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(this);
		btnAdicionar.setBounds(280, 40, 265, 23);
		contentPane.add(btnAdicionar);

		btnEliminarAlFinal = new JButton("Eliminar al final");
		btnEliminarAlFinal.addActionListener(this);
		btnEliminarAlFinal.setBounds(280, 70, 265, 23);
		contentPane.add(btnEliminarAlFinal);
		
		btnEliminarTodo = new JButton("Eliminar todo");
		btnEliminarTodo.addActionListener(this);
		btnEliminarTodo.setBounds(280, 100, 265, 23);
		contentPane.add(btnEliminarTodo);

		btnDecrementarUltimaNotaDesaprobatoria = new JButton("Decrementar \u00FAltima nota desaprobatoria");
		btnDecrementarUltimaNotaDesaprobatoria.addActionListener(this);
		btnDecrementarUltimaNotaDesaprobatoria.setBounds(280, 130, 265, 23);
		contentPane.add(btnDecrementarUltimaNotaDesaprobatoria);

		btnRemplazarUltimaNotaDesaprobatoria = new JButton("Remplazar \u00FAltima nota desaprobatoria");
		btnRemplazarUltimaNotaDesaprobatoria.addActionListener(this);
		btnRemplazarUltimaNotaDesaprobatoria.setBounds(280, 160, 265, 23);
		contentPane.add(btnRemplazarUltimaNotaDesaprobatoria);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 40, 260, 412);
		contentPane.add(scrollPane);

		txtS = new JTextArea();
		txtS.setFont(new Font("Monospaced", Font.PLAIN, 13));
		scrollPane.setViewportView(txtS);
	}

	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource() == btnRemplazarUltimaNotaDesaprobatoria) {
			actionPerformedBtnRemplazarUltimaNotaDesaprobatoria(arg0);
		}
		if (arg0.getSource() == btnDecrementarUltimaNotaDesaprobatoria) {
			actionPerformedBtnDecrementarUltimaNotaDesaprobatoria(arg0);
		}
		if (arg0.getSource() == btnEliminarTodo) {
			actionPerformedBtnEliminarTodo(arg0);
		}
		if (arg0.getSource() == btnEliminarAlFinal) {
			actionPerformedBtnEliminarAlFinal(arg0);
		}
		if (arg0.getSource() == btnAdicionar) {
			actionPerformedBtnAdicionar(arg0);
		}
		limpieza();
	}

	protected void actionPerformedBtnAdicionar(ActionEvent arg0) {

	}
	protected void actionPerformedBtnEliminarAlFinal(ActionEvent arg0) {
	
	}
	protected void actionPerformedBtnEliminarTodo(ActionEvent arg0) {
		
	}
	protected void actionPerformedBtnDecrementarUltimaNotaDesaprobatoria(ActionEvent arg0) {
	
	}
	protected void actionPerformedBtnRemplazarUltimaNotaDesaprobatoria(ActionEvent arg0) {
	
	}
	//  Métodos tipo void (sin parámetros)
	void imprimir() {
		imprimir("");
	}
	void limpieza() {
		txtNota.setText("");
		txtNota.requestFocus();
	}
	void listar() {

	}
	//  Métodos tipo void (con parámetros)
	void imprimir(String s) {
		txtS.append(s + "\n");
	}
	void mensaje(String s) {
		JOptionPane.showMessageDialog(this, s);
	}
	//  Métodos que retornan valor (sin parámetros)
	int leerNota()  {
		return Integer.parseInt(txtNota.getText().trim());
	}
	
}