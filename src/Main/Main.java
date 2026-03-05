package Main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Calc extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JLabel number1;
	private JLabel number2;
	private JTextField inputNumber1;
	private JTextField inputNumber2;
	private JTextField inputResult;
	private JLabel result;
	private JButton btn;
	private JPanel panel;
	
	public Calc(){
		setTitle("Calculadora");
		setSize(250,300);
		setConfigs();
		setPanel();
		action();
		add(panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	
	private void setConfigs() {
		number1 = new JLabel("First Number");
		number2 = new JLabel("Second Number");
		inputNumber1 = new JTextField(20);
		inputNumber2 = new JTextField(20);
		result = new JLabel("RESULT");
		inputResult = new JTextField(20);
		btn = new JButton("Calc");
		inputResult.setEditable(false);
	}
	
	private void setPanel() {
		panel = new JPanel(new FlowLayout(FlowLayout.CENTER));
		panel.add(number1);
		panel.add(inputNumber1);
		panel.add(number2);
		panel.add(inputNumber2);
		panel.add(result);
		panel.add(inputResult);
		panel.add(btn);
	}
	
	public void action(){
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int n1 = Integer.valueOf(inputNumber1.getText());
					int n2 = Integer.valueOf(inputNumber2.getText());
					int soma = (n1 + n2);
					inputResult.setText("A soma eh : " + soma);
				}catch(Exception er){
					JOptionPane.showMessageDialog(null, "Entrada inválida", "Error value",JOptionPane.INFORMATION_MESSAGE);
				}

			}
		});
	}
}
	

public class Main{

	public static void main(String[] args) {
		new Calc();
	}

}
