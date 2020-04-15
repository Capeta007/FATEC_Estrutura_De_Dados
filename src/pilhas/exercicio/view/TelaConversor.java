package pilhas.exercicio.view;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import pilhas.exercicio.controller.Infixa;
import pilhas.exercicio.controller.Posfixa;
import pilhas.exercicio.controller.Prefixa;

public class TelaConversor extends JFrame {

	private JButton btConverter;
	private JPanel contentPane;
	private JTextField tfInfixa;
	private JTextField tfPrefixa;
	private JTextField tfPosfixa;
	private JTextField tfConverter;
	private JTextField tfResult;
	private JLabel lbPrefixa;
	private JLabel lbPosfixa;
	private JLabel lbInfixa;
	private JLabel lbResult;
	private Posfixa pos;
	private Prefixa pre;
	private Infixa inf;

	public TelaConversor() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setSize(500, 480);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);

		pre = new Prefixa();
		pos = new Posfixa();
		inf = new Infixa();

		contruirTela();

	}

	private void contruirTela() {

		btConverter = new JButton("Converter");
		btConverter.setFont(new Font("arial", 1, 20));
		btConverter.setSize(200, 40);
		btConverter.setLocation(150, 100);
		contentPane.add(btConverter);

		btConverter.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {

				eventoClick(e);

			}

		});

		tfConverter = new JTextField();
		tfConverter.setFont(new Font("arial", 1, 20));
		tfConverter.setBounds(100, 30, 300, 40);
		contentPane.add(tfConverter);

		lbInfixa = new JLabel();
		lbInfixa.setText("Infixa: ");
		lbInfixa.setFont(new Font("arial", 1, 25));
		lbInfixa.setBounds(50, 180, 310, 40);
		contentPane.add(lbInfixa);

		tfInfixa = new JTextField();
		tfInfixa.setFont(new Font("arial", 1, 20));
		tfInfixa.setBounds(150, 180, 290, 40);
		contentPane.add(tfInfixa);

		lbPrefixa = new JLabel();
		lbPrefixa.setText("Prefixa: ");
		lbPrefixa.setFont(new Font("arial", 1, 25));
		lbPrefixa.setBounds(50, 250, 310, 40);
		contentPane.add(lbPrefixa);

		tfPrefixa = new JTextField();
		tfPrefixa.setFont(new Font("arial", 1, 20));
		tfPrefixa.setBounds(150, 250, 290, 40);
		contentPane.add(tfPrefixa);

		lbPosfixa = new JLabel();
		lbPosfixa.setText("Posfixa: ");
		lbPosfixa.setFont(new Font("arial", 1, 25));
		lbPosfixa.setBounds(50, 320, 310, 40);
		contentPane.add(lbPosfixa);

		tfPosfixa = new JTextField();
		tfPosfixa.setFont(new Font("arial", 1, 20));
		tfPosfixa.setBounds(150, 320, 290, 40);
		contentPane.add(tfPosfixa);

		lbResult = new JLabel();
		lbResult.setText("Resultado: ");
		lbResult.setFont(new Font("arial", 1, 25));
		lbResult.setBounds(30, 390, 310, 40);
		contentPane.add(lbResult);

		tfResult = new JTextField();
		tfResult.setFont(new Font("arial", 1, 20));
		tfResult.setBounds(170, 390, 290, 40);
		contentPane.add(tfResult);

		tfInfixa.setEnabled(false);
		tfInfixa.setHorizontalAlignment(tfInfixa.CENTER);
		tfPosfixa.setEnabled(false);
		tfPosfixa.setHorizontalAlignment(tfInfixa.CENTER);
		tfPrefixa.setEnabled(false);
		tfPrefixa.setHorizontalAlignment(tfInfixa.CENTER);
		tfResult.setEnabled(false);
		tfResult.setHorizontalAlignment(tfInfixa.CENTER);
	}

	protected void eventoClick(MouseEvent e) {

		if (!tfConverter.getText().isEmpty()) {

			verificarExpressao();

		} else {
			JOptionPane.showMessageDialog(null, "Digite a expressão");
		}

	}

	private void verificarExpressao() {

		char[] exp = tfConverter.getText().toCharArray();

		if (operador(exp[0])) {
			System.out.println("prefixa");
			tfPrefixa.setText(" " + tfConverter.getText());
			prefixa(tfConverter.getText());

		} else {
			if (operador(exp[exp.length - 1])) {
				System.out.println("posfixa");
				tfPosfixa.setText(" " + tfConverter.getText());
				posfixa(tfConverter.getText());
			} else {
				System.out.println("infixa");
				tfInfixa.setText(" " + tfConverter.getText());
				infixa(tfConverter.getText());

			}

		}

	}

	private void infixa(String exp) {

		String expInfixaParaPos = exp + ".";
		char[] s = expInfixaParaPos.toCharArray();
		tfPosfixa.setText(" " + pos.infixaParaPosfixa(s));

		String expValue = pos.infixaParaPosfixa(s) + ".";
		s = expValue.toCharArray();
		validarResultado(s);

		String expInfixaParaPre = "." + exp;
		s = expInfixaParaPre.toCharArray();
		tfPrefixa.setText(" " + pre.infixaParaPrefixa(s));

	}

	private void posfixa(String exp) {

		String expValue = exp + ".";
		char[] s = expValue.toCharArray();
		validarResultado(s);

		String expPosfixa = "." + exp;
		s = expPosfixa.toCharArray();
		tfInfixa.setText(" " + inf.posfixaParaInfixa(s));

		String expInfixa = "." + inf.posfixaParaInfixa(s);
		s = expInfixa.toCharArray();
		tfPrefixa.setText(" " + pre.infixaParaPrefixa(s));

	}

	private void prefixa(String exp) {

		String expPrefixa = exp + ".";
		char[] s = expPrefixa.toCharArray();
		tfInfixa.setText(" " + inf.prefixaParaInfixa(s));

		String expInfixaParaPos = inf.prefixaParaInfixa(s) + ".";
		System.out.println(expInfixaParaPos);
		s = expInfixaParaPos.toCharArray();
		tfPosfixa.setText(" " + pos.infixaParaPosfixa(s));

		String expValue = pos.infixaParaPosfixa(s) + ".";
		s = expValue.toCharArray();
		validarResultado(s);

	}

	private void validarResultado(char[] exp) {

		try {
			int i = Integer.parseInt(exp[0] + "");
			tfResult.setText(" " + pos.valor(exp));
		} catch (Exception e) {

		}

	}

	public boolean operador(char s) {
		return (s == '+' || s == '-' || s == '*' || s == '/' || s == '^'|| s == '¬' || s == '∧' || s == 'v');
	}
}
