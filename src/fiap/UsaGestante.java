package fiap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.swing.JOptionPane;

public class UsaGestante {

	public static void main(String[] args) {
		String nome;
		String dataS;
		Gestante g1;
		try {
			nome = JOptionPane.showInputDialog("Digite seu nome");
			dataS = JOptionPane.showInputDialog("Digite a data da gestação");
			String anoN = dataS.substring(6, 10);
			String mesN = dataS.substring(3, 5);
			String diaN = dataS.substring(0, 2);
			String dtN = anoN + "-" + mesN + "-" + diaN;
			LocalDate dataDN = LocalDate.parse(dtN);
			DateTimeFormatter dft = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String dataNF = dataDN.format(dft);
			g1 = new Gestante(nome, dataDN);
			JOptionPane.showMessageDialog(null, "Início da gestação: " + dataNF);
			JOptionPane.showMessageDialog(null, "Nome: " + g1.getNome() + "\nInício da gestação: " + dataNF + "\nTempo de gestação: " 
			+ g1.tempoDeGestacao() + " meses");
		} catch (Exception e) {
			
		}

	}

}
