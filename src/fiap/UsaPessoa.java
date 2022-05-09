package fiap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class UsaPessoa {

	public static void main(String[] args) {
		Pessoa p1;
		String dataN;
		String nome;
		try {
			nome = JOptionPane.showInputDialog("Digite seu nome");
			dataN = JOptionPane.showInputDialog("Digite sua data de nascimento");
			String anoN = dataN.substring(6, 10);
			String mesN = dataN.substring(3, 5);
			String diaN = dataN.substring(0, 2);
			String dtN = anoN + "-" + mesN + "-" + diaN;
			LocalDate dataDN = LocalDate.parse(dtN);
			DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String dataNF = dataDN.format(dft);
			p1 = new Pessoa(nome, dataDN);
			JOptionPane.showMessageDialog(null, "Data de nascimento: " + p1.getDataNascimento());
			JOptionPane.showMessageDialog(null, "Nome: " + p1.getNome() + "\nData de nascimento: " + dataNF + "\nIdade :" + p1.calculaIdade());
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}

	}

}
